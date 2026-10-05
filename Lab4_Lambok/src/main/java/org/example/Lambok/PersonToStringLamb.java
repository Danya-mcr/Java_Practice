package org.example.Lambok;

import lombok.ToString;

@ToString
public class PersonToStringLamb {
    private String name;
    private int age;

    public PersonToStringLamb(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
