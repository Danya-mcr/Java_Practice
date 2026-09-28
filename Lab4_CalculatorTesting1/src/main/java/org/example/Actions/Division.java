package org.example.Actions;

import org.example.Interfaces.Action;

public class Division implements Action {
    private double a, b;
    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double doAction() {
        if (b == 0) throw new ArithmeticException("Делить на 0 нельзя");
        return a / b;
    }
}
