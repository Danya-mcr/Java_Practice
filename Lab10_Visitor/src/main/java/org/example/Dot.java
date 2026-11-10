package org.example;

public class Dot implements Shape {
    private int id;
    private int x;
    private int y;

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) { /* Логика перемещения */ }

    @Override
    public void draw() { /* Логика отрисовки */ }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    // Геттеры для посетителя
    public int getId() { return id; }
    public int getX() { return x; }
    public int getY() { return y; }
}
