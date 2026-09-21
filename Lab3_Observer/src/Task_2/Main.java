package Task_2;

import Task_2.Displays.CurrentConditionalDisplay;
import Task_2.Displays.ForecastDisplay;
import Task_2.Displays.StatisticDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionalDisplay currentConditionalDisplay = new CurrentConditionalDisplay(weatherData);

        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}