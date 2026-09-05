package Task_3;

import Task_3.Core.Animal;
import Task_3.Core.IEater;
import Task_3.ZooKipa.ZooKipa;
import Task_3.animals.Lion;
import Task_3.animals.Slon;
import Task_3.animals.Zebra;

import java.util.ArrayList;

public interface Zoo {
    public static void main(String[] args) {
        Animal lion1 = new Lion();
        Animal slon1 = new Slon();
        Animal  zebra1 = new Zebra();
        Animal  zebra2 = new Zebra();
        Animal  zebra3 = new Zebra();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion1);
        animals.add(zebra1);
        animals.add(zebra2);
        animals.add(zebra3);
        animals.add(slon1);
        ZooKipa zooKipa = new ZooKipa();
        for (Animal a: animals ) {
            zooKipa.toFeedEater(a);
        }
    }
}