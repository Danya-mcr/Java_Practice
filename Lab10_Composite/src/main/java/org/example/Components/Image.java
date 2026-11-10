package org.example.Components;

import org.example.Component;

public class Image implements Component {
    private String type = "Image";
    private String id;

    public Image(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public String getId() {
        return id;
    }
}
