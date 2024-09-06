package InterfaceFeaturesInJava8AndJava9;

public class Peacock implements Bird{
    @Override
    public void canFly() {
        System.out.println("Peacock Bird can fly");
    }

    @Override
    public void minHeightOfFly() {
        System.out.println("Min Height of fly 60ft");
    }
}
