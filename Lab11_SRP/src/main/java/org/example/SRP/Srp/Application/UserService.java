package org.example.SRP.Srp.Application;

import org.example.SRP.Srp.Repository.IUserRepository;
import org.example.SRP.Srp.Repository.User;

import java.rmi.server.UID;
import java.util.ArrayList;

public class UserService implements IUserService{
    private IUserRepository userRepository;
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User GetById(UID id) {
        if (id == null) throw new IllegalArgumentException("Id не может быть null");
        return userRepository.ReadById(id);
    }

    public ArrayList<User> GetAllUser() {
        return userRepository.ReadAllUser();
    }

    public void CreateUser(User user) {
        if (user == null) throw new IllegalArgumentException("User не может быть null");
        userRepository.CrateUser(user);
    }
}
