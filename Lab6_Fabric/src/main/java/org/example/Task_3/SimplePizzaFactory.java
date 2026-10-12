package org.example.Task_3;

import org.example.Task_3.Pizzas.Default.CheesePizza;
import org.example.Task_3.Pizzas.Pizza;
import org.example.Task_3.Pizzas.Default.ClamPizza;
import org.example.Task_3.Pizzas.Default.PepperoniPizza;
import org.example.Task_3.Pizzas.Default.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza CreatePizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
