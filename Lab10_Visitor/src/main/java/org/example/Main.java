package org.example;


public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);

        XMLExportVisitor exportVisitor = new XMLExportVisitor();

        // Экспортируем одиночную фигуру и составную структуру
        String xmlResult = exportVisitor.export(rectangle, compoundShape);
        System.out.println(xmlResult);
    }
}