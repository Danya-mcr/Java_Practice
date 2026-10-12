package org.example.Task_3.Stores;

import org.example.Task_3.PizzaStore;
import org.example.Task_3.Pizzas.CHI.CHICheesePizza;
import org.example.Task_3.Pizzas.CHI.CHIClamPizza;
import org.example.Task_3.Pizzas.CHI.CHIPepperoniPizza;
import org.example.Task_3.Pizzas.CHI.CHIVeggiePizza;
import org.example.Task_3.Pizzas.Pizza;
import org.example.Task_3.SimplePizzaFactory;

public class CHIStylePizzaStore extends PizzaStore {
    public CHIStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }
    Pizza CreatePizza(String item) {
        if (item.equals("cheese")) {
            return new CHICheesePizza();
        } else if (item.equals("veggie")) {
            return new CHIVeggiePizza();
        } else if (item.equals("item")) {
            return new CHIClamPizza();
        } else if (item.equals("pepproni")) {
            return new CHIPepperoniPizza();
        } else {
            return null;
        }
    }
}
