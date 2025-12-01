package LLD_Sytem_Design.Factory.SimpleFactory;

public class Circle implements Shape{
    private double radius;

    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }

    @Override
    public double getShapeArea() {
        System.out.println("Area of Circle : " + (Math.PI * radius * radius));
        return Math.PI * radius * radius;
    }
}
