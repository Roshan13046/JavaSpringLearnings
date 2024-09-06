package InterfaceFeaturesInJava8AndJava9;

public interface Bird {
    public void canFly();

    //if adding a new method in the interface, then that new method has to be implemented into all the classes which implements it
    public void minHeightOfFly();
}
