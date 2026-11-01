package org.example;
import org.mindrot.jbcrypt.BCrypt;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("email@gmail.com", BCrypt.hashpw("12345abc", BCrypt.gensalt(12)), "Danil");
        for (Object field : data) {
            System.out.println(field);
        }
    }
}