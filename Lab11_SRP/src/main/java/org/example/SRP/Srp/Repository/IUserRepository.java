package org.example.SRP.Srp.Repository;

import java.rmi.server.UID;
import java.util.ArrayList;

public interface IUserRepository {
    User ReadById(UID id);
    ArrayList<User> ReadAllUser();
    void CrateUser(User user);
}
