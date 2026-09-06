package Task_2;

import Task_2.Classes.A;
import Task_2.Classes.B;
import Task_2.Classes.C;
import Task_2.Classes.D;
import Task_2.Core.IDuckTyping;

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
        ArrayList<IDuckTyping> dtArray = IDuckTyping.filterClasses(objects);
        for (IDuckTyping obj : dtArray) {
            obj.printHello();
        }
    }
}