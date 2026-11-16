package org.example.HighCohesion;

public class A1 {
    private int x, y;

    public A1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void method1() {
        int result = x + y;
        System.out.println("1ый метод A1: " + result);
    }
}
