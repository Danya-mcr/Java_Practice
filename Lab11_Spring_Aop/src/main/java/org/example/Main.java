package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

        BankService bankService = context.getBean(BankService.class);
        UserContext userContext = context.getBean(UserContext.class);

        bankService.viewBalance("ACC-101");

        try {
            bankService.deleteAccount("ACC-101");
        } catch (SecurityException e) {
            System.out.println("Поймано в Main: " + e.getMessage());
        }

        userContext.setCurrentRole("ADMIN");
        bankService.deleteAccount("ACC-101");
    }
}
