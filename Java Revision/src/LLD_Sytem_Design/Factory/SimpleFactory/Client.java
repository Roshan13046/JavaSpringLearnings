package LLD_Sytem_Design.Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.getShapeArea();
        circle.draw();

        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.getShapeArea();
        rectangle.draw();
    }
}
