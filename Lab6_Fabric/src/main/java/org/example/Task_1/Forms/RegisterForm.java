package org.example.Task_1.Forms;

import org.example.Task_1.ICreateForm;
import org.example.Task_1.Objects.ButtonClass;
import org.example.Task_1.Objects.TextFieldClass;

public class RegisterForm implements ICreateForm {
    public TextFieldClass CreateText() {
        return new TextFieldClass("Форма регистрации");
    }

    public ButtonClass CreateButton() {
        return new ButtonClass("Зарегистрироваться");
    }
}
