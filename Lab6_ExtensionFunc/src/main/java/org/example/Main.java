package org.example;

import org.example.Decorators.UnderscoreSpaceDecorator;
import org.example.Decorators.UpperCaseDecorator;

public class Main {
    public static void main(String[] args) {
        ISourceText text = new PlainText("abstract factory");
        System.out.println("Оригинал: " + text.getText());

        ISourceText upperText = new UpperCaseDecorator(text);
        System.out.println("Upper: " + upperText.getText());

        ISourceText fullyDecorated = new UnderscoreSpaceDecorator(upperText);
        System.out.println("Underscore: " + fullyDecorated.getText());
    }
}