package Task_2.Core;

import java.util.ArrayList;

public interface IDuckTyping {
    void printHello();

    static ArrayList<IDuckTyping> filterClasses(ArrayList<Object> array) {
        ArrayList<IDuckTyping> result = new ArrayList<>();
        for (Object o : array) {
            if (IDuckTyping.class.isAssignableFrom(o.getClass())) {
                result.add((IDuckTyping) o);
            }
        }
        return result;
    }
}
