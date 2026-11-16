package org.example.SRP.GodObject;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Objects;

public class UserService {
    public ArrayList<User> users = new ArrayList<>();

    public void CreateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User не может быть null");
        }
        users.add(user);
    }
    public User GetById(UID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id не может быть null");
        }
        return users.stream().filter(u -> Objects.equals(u.getId(), id)).findFirst().orElse(null);
    }

    public ArrayList<User> GetAllUser() {
        return users;
    }

    public void PrintAllUsers() {
        for (User u : users) {
            System.out.println("Id: " + u.getId() + " name: " + u.getName() + " role: " + u.getRole());
        }
    }
}
