package InterfaceFeaturesInJava8AndJava9;

public interface LivingThing {
    default boolean canBreathe(){
        return true;
    }

    //java 8 feature: we can have public static methods inside the interfaces
    public static boolean canEat(){
        return true;
    }

    //trying to call the private method from default ones
    default boolean checkIfCanMove(){
        //non static methods can access both static and non-static methods
        System.out.println(canGrow());//static methods
        System.out.println(canMove());//non-static private method
        System.out.println(checkIfCanGrow());//static public method
        //calling the private method canMove()
        return canMove();
    }

    //Java 9 feature: we can add the private methods in the interface it's mandatory to provide its definition
    private boolean canMove(){
        return true;
    }

    //Java 9 feature: we can add the private static methods in the interface it's mandatory to provide its definition
    private static boolean canGrow(){
        return true;
    }

    public static boolean checkIfCanGrow(){
        //calling the private static method canGrow()
        return canGrow();//static methods can only access static methods
    }
}
