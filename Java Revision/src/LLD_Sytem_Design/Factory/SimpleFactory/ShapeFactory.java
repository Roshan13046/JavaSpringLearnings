package LLD_Sytem_Design.Factory.SimpleFactory;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE :
                return new Circle();
            case RECTANGLE :
                return new Rectangle();
            default :
                throw new IllegalStateException("No Such Shape Exists");
        }
    }
}
