package LLD_Sytem_Design.Factory.FactoryMethod;


public class Circle implements Shape {
    private double radius;

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public double getArea() {
        System.out.println("Area of Circle ");
        return Math.PI * radius * radius;
    }
}
