package org.example.Task_3;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;
    Menu cafeManu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeManu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeManu = cafeManu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeManu.createIterator();
        System.out.println("BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("LUNCH");
        printMenu(dinnerIterator);
        System.out.println("DINNER");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
