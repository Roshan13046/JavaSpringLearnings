package InterfaceFeaturesInJava8AndJava9.ScenariosOfFunctionalInterfacesExtending;

@FunctionalInterface
public interface Fan extends NonLiving{
    //Method name should be same as that of the functional interface name
    @Override
    void cannotBreathe();
}
