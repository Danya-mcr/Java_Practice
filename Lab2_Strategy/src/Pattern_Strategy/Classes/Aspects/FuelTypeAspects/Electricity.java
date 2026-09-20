package Pattern_Strategy.Classes.Aspects.FuelTypeAspects;

import Pattern_Strategy.Interfaces.IFuelType;

public class Electricity implements IFuelType {
    public void printFuelType() {
        System.out.println("Чистое электричество");
    }
}
