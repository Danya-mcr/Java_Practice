package org.example.Lambok;

import lombok.NonNull;

public class PersonNotNullLamb {
    private String name;

    public PersonNotNullLamb(@NonNull String name) {
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
