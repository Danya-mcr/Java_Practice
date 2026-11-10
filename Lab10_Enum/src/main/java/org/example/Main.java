package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DayClass today = DayClass.MONDAY;
        System.out.println("Сегодня: " + today);
        System.out.println("Индекс: " + today.ordinal());
        System.out.println("Все дни: " + Arrays.toString(DayClass.values()));
    }
}