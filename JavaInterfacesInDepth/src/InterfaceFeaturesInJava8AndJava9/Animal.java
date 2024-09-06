package InterfaceFeaturesInJava8AndJava9;

public interface Animal extends LivingThing{

    //way 3 to define the default method present in the interfaces
    default boolean canBreathe(){
        boolean canBreatheOrNot = LivingThing.super.canBreathe();

        if(canBreatheOrNot){
            System.out.println("yes it can Breathe");
        }else{
            System.out.println("No it cannot Breathe");
        }

        return canBreatheOrNot;
    }
}
