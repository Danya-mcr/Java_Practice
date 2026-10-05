package org.example.Task_2.classes;

public abstract class Beverage {
    public enum  Size {TALL, GRANDLE, VENTI};
    Size size = Size.TALL;
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
