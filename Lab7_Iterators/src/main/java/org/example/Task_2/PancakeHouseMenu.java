package org.example.Task_2;

import java.util.ArrayList;

public class PancakeHouseMenu {
    public ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&Bs Pancakes Breakfast", "Pancakes with scrabled eghgs and toasts", false, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
