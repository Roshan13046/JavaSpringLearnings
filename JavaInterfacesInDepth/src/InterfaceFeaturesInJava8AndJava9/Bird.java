package InterfaceFeaturesInJava8AndJava9;

public interface Bird {
    public void canFly();

    //if adding a new method in the old java interface, then that new method has to be implemented into all the
    // classes which implements it, this can be avoided by using the default method and adding it's definition into the interface
    default void minHeightOfFly() {
        System.out.println("Min Height of fly 60ft");
    }

    default boolean canBreathe(){
        return true;
    }
}
