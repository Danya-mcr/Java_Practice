package org.example.Task_1;

public class GumballMachine {
    String location;
    int count;
    String currentState;
    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        currentState = "Working";
    }
    public String getLocation() {
        return location;
    }
    public int getCount() {
        return count;
    }
    public String getState() {
        return currentState;
    }
}
