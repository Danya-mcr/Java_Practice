package org.example;

import org.example.WeatherDisplay;
import org.example.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherDisplay phoneDisplay = new WeatherDisplay("Микроволновка");
        WeatherDisplay tvDisplay = new WeatherDisplay("Утюг");

        station.addObserver(phoneDisplay);
        station.addObserver(tvDisplay);

        station.setTemperature(25);

        station.setTemperature(30);

        station.deleteObserver(tvDisplay);

        station.setTemperature(18);
    }
}
