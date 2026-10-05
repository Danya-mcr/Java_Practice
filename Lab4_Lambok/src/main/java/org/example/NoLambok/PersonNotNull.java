package org.example.NoLambok;

public class PersonNotNull {
    private String name;

    public PersonNotNull(String name) {
        if (name == null) throw new NullPointerException("name is null");
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new NullPointerException("name is null");
        this.name = name;
    }
}
