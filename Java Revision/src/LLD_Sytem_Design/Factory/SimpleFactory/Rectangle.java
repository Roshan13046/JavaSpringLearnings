package LLD_Sytem_Design.Factory.SimpleFactory;

public class Rectangle implements Shape{
    private double length, breadth;

    @Override
    public void draw() {
        System.out.println("Rectangle Drawn");
    }

    @Override
    public double getShapeArea() {
        System.out.println("Area of Rectangle is : " + length * breadth);
        return length * breadth;
    }
}
