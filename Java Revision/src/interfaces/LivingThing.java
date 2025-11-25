package interfaces;

public interface LivingThing {

    default void canBreathe(){
        addNumbers(1,2);
        isAlive();

        System.out.println("Living thing can breathe");
    }

    private void addNumbers(int a, int b){
        System.out.println(a+b);

    }

    static void isAlive(){
        System.out.println("I'm living thing");
        myPrivateMethod();
    }

    private static void myPrivateMethod(){
        System.out.println("Private static Method");
    }



}
