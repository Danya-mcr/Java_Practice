package org.example.SRP.Srp.Repository;

import java.util.ArrayList;


public class Data {
    private static final Data uniqueInstance = new Data();
    public ArrayList<User> users = new ArrayList<>();

    private Data() {}

    public static Data getInstance() {
        return uniqueInstance;
    }
}

