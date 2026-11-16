package org.example.SRP.Srp.Application;
import org.example.SRP.Srp.Repository.User;

import java.rmi.server.UID;
import java.util.ArrayList;

public interface IUserService {
    User GetById(UID id);
    ArrayList<User> GetAllUser();
    void CreateUser(User user);
}
