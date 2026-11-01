package org.example.Task_2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;
    int count;
    String currentState;

    public GumballMachine(String location, int count) throws RemoteException {
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
