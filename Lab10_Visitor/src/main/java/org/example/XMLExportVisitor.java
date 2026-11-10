package org.example;

public class XMLExportVisitor implements Visitor {

    public String export(Shape... shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        for (Shape shape : shapes) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "<dot>\n" +
                "    <id>" + dot.getId() + "</id>\n" +
                "    <x>" + dot.getX() + "</x>\n" +
                "    <y>" + dot.getY() + "</y>\n" +
                "</dot>";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "<circle>\n" +
                "    <id>" + circle.getId() + "</id>\n" +
                "    <x>" + circle.getX() + "</x>\n" +
                "    <y>" + circle.getY() + "</y>\n" +
                "    <radius>" + circle.getRadius() + "</radius>\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<rectangle>\n" +
                "    <id>" + rectangle.getId() + "</id>\n" +
                "    <x>" + rectangle.getX() + "</x>\n" +
                "    <y>" + rectangle.getY() + "</y>\n" +
                "    <width>" + rectangle.getWidth() + "</width>\n" +
                "    <height>" + rectangle.getHeight() + "</height>\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundShape(CompoundShape cs) {
        StringBuilder sb = new StringBuilder();
        sb.append("<compound_shape>\n")
                .append("    <id>").append(cs.getId()).append("</id>\n");
        for (Shape shape : cs.getChildren()) {
            String obj = shape.accept(this);
            // Добавляем отступы для дочерних элементов структуры
            obj = "    " + obj.replace("\n", "\n    ");
            sb.append(obj).append("\n");
        }
        sb.append("</compound_shape>");
        return sb.toString();
    }
}

