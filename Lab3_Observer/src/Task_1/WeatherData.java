package Task_1;

import Task_1.Class.WeatherStation;
import Task_1.Displays.CurrentConditionalDisplay;
import Task_1.Displays.ForecastDisplay;
import Task_1.Displays.StatisticDisplay;

public class WeatherData {
    private CurrentConditionalDisplay currentConditionalDisplay= new CurrentConditionalDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();
    private StatisticDisplay statisticDisplay = new StatisticDisplay();

    public float getTemperature() {
        return WeatherStation.TEMPERATURE;
    }
    public float getHumidity() {
        return  WeatherStation.HUMIDITY;
    }
    public float getPressure() {
        return WeatherStation.PRESSURE;
    }

    //вызывается при каждом показании датчика
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionalDisplay.update(temp, humidity, pressure);
        statisticDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
