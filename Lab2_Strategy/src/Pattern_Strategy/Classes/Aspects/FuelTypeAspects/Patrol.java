package Pattern_Strategy.Classes.Aspects.FuelTypeAspects;

import Pattern_Strategy.Interfaces.IFuelType;

public class Patrol implements IFuelType {
    public void printFuelType() {
        System.out.println("92 бензин");
    }
}
