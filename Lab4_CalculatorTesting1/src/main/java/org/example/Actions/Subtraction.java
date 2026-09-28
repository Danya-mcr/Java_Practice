package org.example.Actions;

import org.example.Interfaces.Action;

public class Subtraction implements Action {
    private double a, b;
    public Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double doAction() {
        return a - b;
    }
}
