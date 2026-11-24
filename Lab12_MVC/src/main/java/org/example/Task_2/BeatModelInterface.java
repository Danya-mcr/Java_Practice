package org.example.Task_2;

import org.example.Task_1.BPMObserver;
import org.example.Task_1.BeatObserver;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

}
