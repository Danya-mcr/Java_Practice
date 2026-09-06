package Task_3.Core;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public interface IDuckTyping {
    void printHello();

    static ArrayList<Object> filterClasses(ArrayList<Object> array) {
        ArrayList<Object> result = new ArrayList<>();
        for (Object obj : array) {
            boolean key = true;
            for (var met : IDuckTyping.class.getDeclaredMethods()) {
                if (Modifier.isStatic(met.getModifiers())) continue;
                try {
                    obj.getClass().getMethod(met.getName(), met.getParameterTypes());
                } catch (NoSuchMethodException e) {
                    key = false;
                    break;
                }
            }
            if (key) result.add(obj);
        }
        return result;
    }
}
