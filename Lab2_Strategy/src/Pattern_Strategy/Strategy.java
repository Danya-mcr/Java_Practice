package Pattern_Strategy;

import Pattern_Strategy.Classes.Aspects.Cars.Lixiang;
import Pattern_Strategy.Classes.Aspects.Cars.Lada;
import Pattern_Strategy.Classes.Aspects.FuelTypeAspects.Electricity;
import Pattern_Strategy.Classes.Aspects.FuelTypeAspects.Patrol;
import Pattern_Strategy.Classes.Aspects.InteriortrimAspects.Fabric;
import Pattern_Strategy.Classes.Aspects.InteriortrimAspects.Leather;

public class Strategy {
    public static void main(String[] args) {
        Patrol patrol = new Patrol();
        Electricity electricity = new Electricity();
        Fabric fabric = new Fabric();
        Leather leather = new Leather();

        Lada lada = new Lada(patrol, fabric);
        Lixiang lixiang = new Lixiang(electricity, leather);

        lada.canDrive();
        lada.checkFuel();
        lada.checkInterier();

        lixiang.canDrive();
        lixiang.checkFuel();
        lixiang.checkInterier();
    }
}