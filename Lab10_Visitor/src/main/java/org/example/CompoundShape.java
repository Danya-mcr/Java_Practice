package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    private int id;
    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    @Override
    public void move(int x, int y) {}

    @Override
    public void draw() {}

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundShape(this);
    }

    public int getId() { return id; }
    public List<Shape> getChildren() { return children; }
}
