package org.example;

import java.util.ArrayList;
import java.util.List;

public class Form implements Component{
    private String type = "Form";
    private String id;
    private final ArrayList<Component> componentList = new ArrayList<>();

    public Form(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setElement(Component el) {
        componentList.add(el);
    }

    public void getAllElementsId() {
        for (Component el : componentList) {
            System.out.println("Id: " + el.getId());
        }
    }
}
