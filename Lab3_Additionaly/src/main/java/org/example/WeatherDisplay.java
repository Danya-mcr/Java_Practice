package org.example;

import java.util.Observable;
import java.util.Observer;

public class WeatherDisplay implements Observer {
    private String displayName;

    public WeatherDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (arg instanceof Integer) {
            int newTemperature = (Integer) arg;
            System.out.println(displayName + " - текущая температура: " + newTemperature);
        }
    }
}
