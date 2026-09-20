package Half_redneck_pattern.Classes;

import Half_redneck_pattern.Interfaces.Car;

public class Lada implements Car {
    public void canDrive() {
        System.out.println("Врум врум до 90кмч");
    }

    public void isPetrol() {
        System.out.println("Солярка");
    }

    public void leatherInterior() {
        System.out.println("Ткань (почти кожа)");
    }
}
