package org.example;

import java.util.Observable;

public class WeatherStation extends Observable {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}
