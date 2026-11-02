package org.example.EnumSingleton;

public class Main {
    public static void main(String[] args) {

        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;

        System.out.println("Хеш s1: " + s1.hashCode());
        System.out.println("Хеш s2: " + s2.hashCode());

        s1.increment();
        s2.increment();

        System.out.println("Текущее состояние: " + s1.getInfo());

        EnumSingleton s3 = EnumSingleton.INSTANCE;
        s3.increment();
        System.out.println("После третьего вызова: " + s3.getInfo());
    }
}