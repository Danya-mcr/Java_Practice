package org.example.Components;

import org.example.Components.Base.BaseFunctions;

public class Amplifier extends BaseFunctions {
    public void setcd() {
        System.out.println("Cd вставлен");
    }
    public void setDvd() {
        System.out.println("Dvd вставлен");
    }

    public void setStereoSound() {
        System.out.println("Set stereo audio");
    }

    public void setSurroundSound() {
        System.out.println("Set surround sound");
    }

    public void setTuner() {
        System.out.println("Set tuner");
    }

    public void setVolume(int val) {
        System.out.println("Set volume");
    }
}
