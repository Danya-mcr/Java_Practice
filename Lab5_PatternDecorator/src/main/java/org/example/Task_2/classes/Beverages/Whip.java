package org.example.Task_2.classes.Beverages;

import org.example.Task_2.classes.Beverage;
import org.example.Task_2.classes.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 1.09 + beverage.cost();
    }
}
