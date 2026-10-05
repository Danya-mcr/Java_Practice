package org.example.Task_2.classes.Beverages;

import org.example.Task_2.classes.Beverage;
import org.example.Task_2.classes.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        switch (beverage.getSize()) {
            case TALL -> {
                return .20 + beverage.cost();
            }
            case GRANDLE -> {
                return .15 + beverage.cost();
            }
            case VENTI -> {
                return .10 + beverage.cost();
            }
        }

        return 0;
    }
}
