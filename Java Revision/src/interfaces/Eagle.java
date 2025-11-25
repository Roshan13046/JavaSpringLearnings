package interfaces;

public class Eagle implements Bird.NonFlyingBird {

//    @Override
//    public void canFly(){
//        System.out.println("EAGLE can fly");
//    }
//
//    @Override
//    public void noOfLegs(){
//        System.out.println("2 Legs");
//    }

    @Override
    public void canRun(){
        System.out.println("Cannot Run");
    }
}
