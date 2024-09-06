package InterfaceFeaturesInJava8AndJava9;

public class Eagle implements Bird{
    @Override
    public void canFly() {
        System.out.println("Eagles can Fly High");
    }

    @Override
    public void minHeightOfFly() {
        System.out.println("Min Height of fly 60ft");
    }
}
