package org.example.Task_3.Stores;

import org.example.Task_3.PizzaStore;
import org.example.Task_3.Pizzas.CA.CALCheesePizza;
import org.example.Task_3.Pizzas.CA.CALClamPizza;
import org.example.Task_3.Pizzas.CA.CALPepperoniPizza;
import org.example.Task_3.Pizzas.CA.CALVeggiePizza;
import org.example.Task_3.Pizzas.Pizza;
import org.example.Task_3.SimplePizzaFactory;

public class CALStylePizzaStore extends PizzaStore {
    public CALStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    Pizza CreatePizza(String item) {
        if (item.equals("cheese")) {
            return new CALCheesePizza();
        } else if (item.equals("veggie")) {
            return new CALVeggiePizza();
        } else if (item.equals("item")) {
            return new CALClamPizza();
        } else if (item.equals("pepproni")) {
            return new CALPepperoniPizza();
        } else {
            return null;
        }
    }
}
