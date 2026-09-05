package Task_2;

import Task_2.Core.IEater;
import Task_2.ZooKipa.ZooKipa;
import Task_2.animals.Lion;
import Task_2.animals.Slon;
import Task_2.animals.Zebra;

import java.util.ArrayList;

public interface Zoo {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Slon slon1 = new Slon();
        Zebra zebra1 = new Zebra();
        Zebra zebra2 = new Zebra();
        Zebra zebra3 = new Zebra();
        ArrayList<IEater> eaters = new ArrayList<>();
        eaters.add(lion1);
        eaters.add(zebra1);
        eaters.add(zebra2);
        eaters.add(zebra3);
        eaters.add(slon1);
        ZooKipa zooKipa = new ZooKipa();
        for (IEater e: eaters ) {
            zooKipa.toFeedEater(e);
        }
    }
}