package Task_1;

import Task_1.ZooKipa.ZooKipa;
import Task_1.animals.Lion;
import Task_1.animals.Slon;
import Task_1.animals.Zebra;

public interface Zoo {
    public static void main(String[] args) {
        ZooKipa Anton = new ZooKipa();
        Lion lion = new Lion();
        Zebra zebra = new Zebra();
        Slon slon = new Slon();

        Anton.toFeedLion(lion);
        Anton.toFeedZebra(zebra);
        Anton.toFeedSlon(slon);
    }
}