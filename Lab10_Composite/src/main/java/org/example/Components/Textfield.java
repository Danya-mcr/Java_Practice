package org.example.Components;

import org.example.Component;

public class Textfield implements Component {
    private String type = "Textfield";
    private String id;

    public Textfield(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public String getId() {
        return id;
    }
}
