package Task_1.Displays;

import Task_1.Interfaces.Display;

public class StatisticDisplay implements Display {
    public void update(float temp, float hum, float pres) {
        System.out.println("Температура: %f".formatted(temp));
        System.out.println("Влажность: %f".formatted(hum));
        System.out.println("Давление: %f".formatted(pres));
    }
}
