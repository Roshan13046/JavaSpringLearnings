package LLD_Sytem_Design.Factory.FactoryMethod;

import LLD_Sytem_Design.Factory.SimpleFactory.ShapeType;

public class ShapeFactoryMethod {
    public static Shape getShape(ShapeType shapeType){
        Shape shape = null;
        switch (shapeType){
            case CIRCLE :
                CircleShapeFactory circleShapeFactory = new CircleShapeFactory();
                shape = circleShapeFactory.createShape();
                break;

            case RECTANGLE:
                RectangleShapeFactory rectangleShapeFactory = new RectangleShapeFactory();
                shape = rectangleShapeFactory.createShape();
                break;
            default:
                throw new IllegalStateException("No such type of Shape exists");
        }
        return shape;
    }
}
