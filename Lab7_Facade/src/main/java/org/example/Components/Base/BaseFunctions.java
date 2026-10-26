package org.example.Components.Base;

public class BaseFunctions {
    public void on() {
        System.out.println("Включёно");
    }

    public void off() {
        System.out.println("Выключено");
    }

    @Override
    public String toString() {
        return "Вывод информации";
    }
}
