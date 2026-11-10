package org.example.Components;

import org.example.Component;

public class Button implements Component {
    private String type = "Button";
    private String id;

    public Button(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public String getId() {
        return id;
    }
}
