package org.example.Actions;

import org.example.Interfaces.Action;

public class Multiply implements Action {
    private double a, b;
    public Multiply(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double doAction() {
        return a * b;
    }
}
