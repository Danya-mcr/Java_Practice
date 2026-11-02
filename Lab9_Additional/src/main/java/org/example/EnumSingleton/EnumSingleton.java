package org.example.EnumSingleton;

public enum EnumSingleton {
    INSTANCE;

    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public String getInfo() {
        return "Хеш-код: " + this.hashCode() + " Counter: " + counter;
    }
}
