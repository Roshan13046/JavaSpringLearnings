package InterfaceFeaturesInJava8AndJava9;

//Another way of functional interface
public interface Amphibians {

    //exactly one abstract method present
    public void canLiveOnLandAndWater();

    default void canSwim(){
        System.out.println("Yes, can swim in water");
    }

    public static void canWalk(){
        System.out.println("Yes, can glide, walk, move on Land");
    }
}
