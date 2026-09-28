package org.example.Actions;

import org.example.Interfaces.Action;

public class Sinus implements Action {
    private double a;
    public Sinus(double a) {
        this.a = a;
    }
    @Override
    public double doAction() {
        return Math.sin(a);
    }
}
