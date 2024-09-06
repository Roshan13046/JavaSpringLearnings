package InterfaceFeaturesInJava8AndJava9;

public class Hen implements Bird, LivingThing{

    @Override
    public void canFly() {
        System.out.println("Cannot Fly only Run");
    }

    //This is the way to solve the problem of multiple inheritance and same default methods added in the interfaces
    @Override
    public boolean canBreathe() {
        return true;
    }
}
