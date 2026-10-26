package org.example.Task_1;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

    DinnerMenu dinnerMenu = new DinnerMenu();
    MenuItem[] lunchItem = dinnerMenu.getMenuItems();

    public void getMenu() {
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < lunchItem.length; i++) {
            MenuItem menuItem = lunchItem[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
