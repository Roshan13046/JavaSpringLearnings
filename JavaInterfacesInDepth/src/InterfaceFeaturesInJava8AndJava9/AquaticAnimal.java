package InterfaceFeaturesInJava8AndJava9;

//functional Interface annotation is not mandatory to give, even normal interface can be functional interface
//if and only if there is exactly one abstract method present
@FunctionalInterface
public interface AquaticAnimal {
    //exactly 1 abstract method present
    public void canSwim();

    default void haveFins(){
        System.out.println("Yes, Aquatic animals have fins");
    }

    public static void canBreathe(){
        System.out.println("Yes, can breathe using oxygen dissolved in water");
    }

    String toString();//Object class method

}
