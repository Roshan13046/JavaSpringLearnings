package LLD_Sytem_Design.Factory.FactoryMethod;

public class CircleShapeFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
