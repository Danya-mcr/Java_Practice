package org.example.LazyInitialization;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Хеш s1: " + s1.hashCode());
        System.out.println("Хеш s2: " + s2.hashCode());
    }
}