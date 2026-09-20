package Pattern_Strategy.Classes.Aspects.Cars;

import Pattern_Strategy.Interfaces.ICanDrive;
import Pattern_Strategy.Interfaces.IFuelType;
import Pattern_Strategy.Interfaces.IInteriorTrim;

abstract class Car implements ICanDrive {
    IFuelType fuelType;
    IInteriorTrim interiorTrim;

    public Car(IFuelType fuel, IInteriorTrim trim) {
        fuelType = fuel;
        interiorTrim = trim;
    }

    public void canDrive() {
        System.out.println("Врум врум");
    }

    public void checkFuel() {
        fuelType.printFuelType();
    }

    public void checkInterier() {
        interiorTrim.printInteriorType();
    }
}
