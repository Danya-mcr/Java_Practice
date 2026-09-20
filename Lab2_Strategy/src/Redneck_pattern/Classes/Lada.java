package Redneck_pattern.Classes;

public class Lada extends Car {

    @Override
    public void canDrive() {
        System.out.println("Врум врум");
    }

    @Override
    public void isPetrol() {
        System.out.println("92 пожалуйста");
    }

    @Override
    public void leatherInterior() {
        System.out.println("Ткань, если повезёт");
    }
}
