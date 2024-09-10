package InterfaceFeaturesInJava8AndJava9;

public interface LivingThing {
    default boolean canBreathe(){
        return true;
    }

    //java 8 feature: we can have public static methods inside the interfaces
    public static boolean canEat(){
        return true;
    }
}
