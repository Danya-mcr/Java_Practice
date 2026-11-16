package org.example.SRP.Srp.Repository;

import java.rmi.server.UID;
import java.util.ArrayList;

public class UserRepository implements IUserRepository {
    private Data data = Data.getInstance();

    public User ReadById(UID id) {
        return data.users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public ArrayList<User> ReadAllUser() {
        ArrayList<User> result = data.users;
        return result;
    }

    public void CrateUser(User user) {
        data.users.add(user);
    }
}


/*
1) Рисуем схему dfd
2) Переписываем расёты с изменениями
3) Пересчёт с изменениямиыы
4) Сравнение с калькуляторм
5) Делаем на бумажке,
*/
