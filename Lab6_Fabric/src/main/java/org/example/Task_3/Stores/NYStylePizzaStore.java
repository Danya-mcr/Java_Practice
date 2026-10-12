package org.example.Task_3.Stores;

import org.example.Task_3.PizzaStore;
import org.example.Task_3.Pizzas.NY.NYCheesePizza;
import org.example.Task_3.Pizzas.NY.NYClamPizza;
import org.example.Task_3.Pizzas.NY.NYPepperoniPizza;
import org.example.Task_3.Pizzas.NY.NYVeggiePizza;
import org.example.Task_3.Pizzas.Pizza;
import org.example.Task_3.SimplePizzaFactory;

public class NYStylePizzaStore extends PizzaStore {
    public NYStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }
    Pizza CreatePizza(String item) {
        if (item.equals("cheese")) {
            return new NYCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYVeggiePizza();
        } else if (item.equals("item")) {
            return new NYClamPizza();
        } else if (item.equals("pepproni")) {
            return new NYPepperoniPizza();
        } else {
            return null;
        }
    }
}
