package Pattern_Strategy.Classes.Aspects.Cars;

import Pattern_Strategy.Classes.Aspects.FuelTypeAspects.Electricity;
import Pattern_Strategy.Classes.Aspects.InteriortrimAspects.Leather;

public class Lixiang extends Car{
    public Lixiang(Electricity fuel, Leather trim) {
        super(fuel, trim);
    }
}
