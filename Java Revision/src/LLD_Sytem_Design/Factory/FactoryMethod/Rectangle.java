package LLD_Sytem_Design.Factory.FactoryMethod;

public class Rectangle implements Shape{
    double length, breadth;

    @Override
    public void draw(){
        System.out.println("Rectangle drawn");
    }

    @Override
    public double getArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
        return length * breadth;
    }
}
