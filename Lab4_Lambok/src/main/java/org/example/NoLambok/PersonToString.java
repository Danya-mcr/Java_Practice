package org.example.NoLambok;

public class PersonToString {
    private String name;
    private int age;

    public PersonToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }
}
