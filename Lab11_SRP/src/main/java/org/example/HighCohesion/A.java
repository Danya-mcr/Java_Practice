package org.example.HighCohesion;

public class A {
    private int x, y;
    private int z;
    private int a, b, c;

    public void method1() {
        int result = x * y;
        System.out.println("1ый метод: " + result);
    }

    public void method2() {
        System.out.println("2ой метод: " + z);
    }

    public void method3() {
        int result = a + b + c;
        System.out.println("3ий метод: " + result);
    }
}
