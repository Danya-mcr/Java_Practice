package org.example.HighCohesion;

public class A3 {
    private int a, b, c;

    public A3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void method3() {
        int result = a + b + c;
        System.out.println("3ий метод А3: " + result);
    }
}
