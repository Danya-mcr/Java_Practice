package org.example;

import java.util.Arrays;

public final class DayClass {

    private final String name;
    private final int ordinal;

    public static final DayClass MONDAY = new DayClass("MONDAY", 0);
    public static final DayClass TUESDAY = new DayClass("TUESDAY", 1);
    public static final DayClass WEDNESDAY = new DayClass("WEDNESDAY", 2);

    private static final DayClass[] VALUES = new DayClass[] { MONDAY, TUESDAY, WEDNESDAY };

    private DayClass(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public static DayClass[] values() {
        return VALUES.clone();
    }

    public static DayClass valueOf(String name) {
        for (DayClass day : VALUES) {
            if (day.name.equals(name)) {
                return day;
            }
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }

    public String name() {
        return name;
    }

    public int ordinal() {
        return ordinal;
    }

    @Override
    public String toString() {
        return name;
    }

}
