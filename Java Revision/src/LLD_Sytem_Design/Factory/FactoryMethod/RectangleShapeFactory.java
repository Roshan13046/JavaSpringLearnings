package LLD_Sytem_Design.Factory.FactoryMethod;

public class RectangleShapeFactory implements ShapeFactory{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
