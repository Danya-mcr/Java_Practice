package org.example.SRP.Srp.UI;

import org.example.SRP.Srp.Application.IUserService;
import org.example.SRP.Srp.Application.UserService;
import org.example.SRP.Srp.Repository.IUserRepository;
import org.example.SRP.Srp.Repository.User;
import org.example.SRP.Srp.Repository.UserRepository;
import org.example.SRP.Srp.UserRole;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IUserRepository userRepository = new UserRepository();
        IUserService userService = new UserService(userRepository);

        User admin = new User("Лёха", UserRole.Admin);
        User regularUser = new User("Маша", UserRole.User);

        userService.CreateUser(admin);
        userService.CreateUser(regularUser);

        ArrayList<User> allUsers = userService.GetAllUser();
        for (User u : allUsers) {
            System.out.println("Id: " + u.getId() + " name: " + u.getName() + " role: " + u.getRole());
        }
    }
}

