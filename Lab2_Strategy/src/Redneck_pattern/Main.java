package Redneck_pattern;

import Redneck_pattern.Classes.Lada;
import Redneck_pattern.Classes.Lixiang;

public class Main {
    public static void main(String[] args) {
        Lada lada = new Lada();
        Lixiang lixiang = new Lixiang();

        lada.canDrive();
        lada.isPetrol();
        lada.leatherInterior();

        lixiang.canDrive();
        lixiang.isPetrol();
        lixiang.leatherInterior();
    }
}