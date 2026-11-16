package org.example.SRP.GodObject;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        User admin = new User("Лёха", UserRole.Admin);
        User regularUser = new User("Маша", UserRole.User);

        service.CreateUser(admin);
        service.CreateUser(regularUser);

        service.PrintAllUsers();
    }
}
