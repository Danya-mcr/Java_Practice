package org.example.SolutionToTheCloneProblem;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Клонирование запрещено");
    }

    public void doSomething() {
        System.out.println("Хеш-код: " + this.hashCode());
    }
}
