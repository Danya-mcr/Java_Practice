package org.example;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public void viewBalance(String accountId) {
        System.out.println("Баланс счета " + accountId + ": 50 000 руб.");
    }

    public void deleteAccount(String accountId) {
        System.out.println("Счет " + accountId + " безвозвратно удален из базы!");
    }
}
