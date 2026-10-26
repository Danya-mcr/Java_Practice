package org.example.Task_2;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu = new DinnerMenu();

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("LUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
