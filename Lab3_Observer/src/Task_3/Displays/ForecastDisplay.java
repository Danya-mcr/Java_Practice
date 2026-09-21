package Task_3.Displays;

import Task_3.Interfaces.DisplayElement;
import Task_3.WeatherData;
import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPresure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPresure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + currentPressure + "/" + currentPressure + "/" + currentPressure);
    }
}
