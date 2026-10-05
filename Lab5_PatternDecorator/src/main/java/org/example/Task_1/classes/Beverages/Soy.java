package org.example.Task_1.classes.Beverages;

import org.example.Task_1.classes.Beverage;
import org.example.Task_1.classes.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .05 + beverage.cost();
    }
}
