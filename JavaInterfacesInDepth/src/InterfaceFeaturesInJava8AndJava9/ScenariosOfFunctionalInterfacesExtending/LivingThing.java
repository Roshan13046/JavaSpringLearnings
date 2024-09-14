package InterfaceFeaturesInJava8AndJava9.ScenariosOfFunctionalInterfacesExtending;

public interface LivingThing {
//    void canbreathe();

    default void canBreathe(){
        System.out.println("Living things can Breathe");
    }
}
