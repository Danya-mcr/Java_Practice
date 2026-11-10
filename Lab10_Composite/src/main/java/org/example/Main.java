package org.example;

import org.example.Components.Button;
import org.example.Components.Image;
import org.example.Components.Textfield;

public class Main {
    public static void main(String[] args) {
        Component btn = new Button("btn1");
        Component img = new Image("btnImage");
        Component textField = new Textfield("txtField1");

        var form = new Form("form1");
        form.setElement(btn);
        form.setElement(img);
        form.setElement(textField);

        form.getAllElementsId();
    }
}