package org.example.SRP.Srp.Repository;

import org.example.SRP.Srp.UserRole;

import java.rmi.server.UID;

public class User {
    private UID id;
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        id = new UID();
        this.name = name;
        this.role = role;
    }

    public UID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserRole getRole() {
        return role;
    }
}
