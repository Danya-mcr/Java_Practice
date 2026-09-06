package Task_1;

import Task_1.Classes.A;
import Task_1.Classes.B;
import Task_1.Classes.C;
import Task_1.Classes.D;
import Task_1.Core.IDuckTyping;

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
        ArrayList<IDuckTyping> dtArray = new ArrayList<>();
        for (Object o : objects) {
            if (IDuckTyping.class.isAssignableFrom(o.getClass())) {
                dtArray.add((IDuckTyping) o);
            }
        }
        for (IDuckTyping obj : dtArray) {
            obj.printHello();
        }
    }
}