package FactoryPattern;

public class Main {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.createShape(ShapeEnum.Circle);
        circle.draw();

        Shape rectangle = ShapeFactory.createShape(ShapeEnum.Rectangle);
        rectangle.draw();
    }
}
