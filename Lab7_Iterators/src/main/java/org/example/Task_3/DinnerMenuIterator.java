package org.example.Task_3;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] item;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] item) {
        this.item = item;
    }

    public MenuItem next() {
        MenuItem menuItem = item[position];
        position = position += 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= item.length || item[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You cant remove an item until youve done at least one next()");
        }
        if (item[position - 1] != null) {
            for (int i = position - 1; i < (item.length-1); i++) {
                item[i] = item[i + 1];
            }
            item[item.length-1] = null;
        }
    }
}
