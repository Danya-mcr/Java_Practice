package Pattern_Strategy.Classes.Aspects.InteriortrimAspects;

import Pattern_Strategy.Interfaces.IInteriorTrim;

public class Fabric implements IInteriorTrim {
    public void printInteriorType() {
        System.out.println("Тканевый салон");
    }
}
