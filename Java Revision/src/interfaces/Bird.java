package interfaces;

public interface Bird extends LivingThing {
     public static final int MAX_LEGS = 2;

    public void canFly();

    public void noOfLegs();

    public interface NonFlyingBird{

        public void canRun();
    }

//    default void canBreathe(){
//        System.out.println("Living thing can breathe");
//    }
    public void canBreathe();



}
