package InterfaceFeaturesInJava8AndJava9;

public interface LivingThing {
    default boolean canBreathe(){
        return true;
    }
}
