package Task_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class WeatherStation {
        public static float temperature = 10;
        public static float humidity = 20;
        public static float pressure = 30;
    }

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        data.getTemperature();
        data.getHumidity();
        data.getPressure();

        data.measurementsChanged();
    }
}