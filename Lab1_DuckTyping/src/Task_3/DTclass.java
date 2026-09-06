package Task_3;

import Task_3.Classes.A;
import Task_3.Classes.B;
import Task_3.Classes.C;
import Task_3.Classes.D;
import Task_3.Core.IDuckTyping;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class DTclass {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(a1);
        objects.add(b1);
        objects.add(c1);
        objects.add(d1);
        ArrayList<Object> dtArray = IDuckTyping.filterClasses(objects);
        for (Object obj : dtArray) {
            for (var met : obj.getClass().getMethods()) {
                try {
                    met.invoke(obj);
                } catch (Exception e) {e.getMessage();}
            }
        }
    }
}