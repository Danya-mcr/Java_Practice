package Task_1.ZooKipa;
import Task_1.animals.Lion;
import Task_1.animals.Slon;
import Task_1.animals.Zebra;

public class ZooKipa {
    public void toFeedLion(Lion lion) {
        lion.eats();
    }
    public void toFeedZebra(Zebra zebra) {
        zebra.eating();
    }
    public void toFeedSlon(Slon slon) {
        slon.toEat();
    }
}
