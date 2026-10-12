package org.example.Task_1;


import org.example.Task_1.Forms.LoginForm;
import org.example.Task_1.Forms.RegisterForm;

public class Main {
    public static void main(String[] args) {
        RegisterForm registerForm = new RegisterForm();
        LoginForm loginForm = new LoginForm();

        registerForm.CreateText().PrintText();
        registerForm.CreateButton().Click();

        loginForm.CreateText().PrintText();
        loginForm.CreateButton().Click();
    }
}