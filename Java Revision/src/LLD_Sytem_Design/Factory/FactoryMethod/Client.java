package LLD_Sytem_Design.Factory.FactoryMethod;

import LLD_Sytem_Design.Factory.SimpleFactory.ShapeType;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactoryMethod.getShape(ShapeType.CIRCLE);
        circle.getArea();
        circle.draw();

        Shape rectangle = ShapeFactoryMethod.getShape(ShapeType.RECTANGLE);
        rectangle.getArea();
        rectangle.draw();
    }
}
