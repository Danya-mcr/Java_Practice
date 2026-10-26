package org.example.Task_3;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie burger and air fries", "Veggie burger on a whole wheat bun", true, 3.99);
        addItem("Soup of the day", "A cup of the soup", false, 3.69);
        addItem("Burrito", "A large burrito", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
