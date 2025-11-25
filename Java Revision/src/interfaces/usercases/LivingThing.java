package interfaces.usercases;

public interface LivingThing {
    default void canBreathe(){
        System.out.println("Can breathe");
    }
}
