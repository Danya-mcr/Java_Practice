package Task_3;


import Task_3.Displays.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(82, 70, 28.1f);
        weatherData.setMeasurements(78, 90, 29.0f);
    }
}