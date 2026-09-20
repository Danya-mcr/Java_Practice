package Pattern_Strategy.Classes.Aspects.Cars;

import Pattern_Strategy.Classes.Aspects.FuelTypeAspects.Patrol;
import Pattern_Strategy.Classes.Aspects.InteriortrimAspects.Fabric;

public class Lada extends Car{
    public Lada(Patrol fuel, Fabric trim) {
        super(fuel, trim);
    }
}
