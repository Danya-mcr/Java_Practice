package org.example.Task_2;

import java.util.ArrayList;

public class DinnerMenuIterator implements Iterator{
    MenuItem[] item;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.item = item;
    }

    public MenuItem next() {
        MenuItem menuItem = item[position];
        position = position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= item.length || item[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
