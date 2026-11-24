package org.example.Task_2;

import org.example.Task_1.BPMObserver;
import org.example.Task_1.BeatModelInterface;
import org.example.Task_1.BeatObserver;

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    ArrayList<org.example.Task_1.BeatObserver> beatObservers = new ArrayList<>();
    ArrayList<org.example.Task_1.BPMObserver> bpmObservers = new ArrayList<>();
    int bpm = 90;
    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        System.out.println("Starting the sequencer");
        if (sequencer != null) sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        if (sequencer != null) sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        if (sequencer != null && bpm > 0) {
            sequencer.setTempoInBPM(getBPM());
        }
        notifyBPMObservers();
    }

    @Override
    public int getBPM() { return bpm; }

    void beatEvent() { notifyBeatObservers(); }

    @Override
    public void registerObserver(org.example.Task_1.BeatObserver o) { beatObservers.add(o); }

    @Override
    public void removeObserver(org.example.Task_1.BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) beatObservers.remove(i);
    }

    @Override
    public void registerObserver(org.example.Task_1.BPMObserver o) { bpmObservers.add(o); }

    @Override
    public void removeObserver(org.example.Task_1.BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) bpmObservers.remove(i);
    }

    public void notifyBeatObservers() {
        for (BeatObserver observer : beatObservers) observer.updateBeat();
    }

    public void notifyBPMObservers() {
        for (BPMObserver observer : bpmObservers) observer.updateBPM();
    }

    @Override
    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
            beatEvent();
            if (sequencer != null) sequencer.start();
            setBPM(getBPM());
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    public MidiEvent makeEvent(int comb, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comb, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return event;
    }
}