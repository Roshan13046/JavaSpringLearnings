package interfaces;

public class Hen implements Bird{

    @Override
    public void canFly() {
        System.out.println("HEN cannot fly");
    }

    @Override
    public void noOfLegs() {
        System.out.println("HEN has 2 legs");
    }

    @Override
    public void canBreathe() {
        System.out.println("Hen can breathe");
    }


    public void isAlive(){
        System.out.println("I'm HEN, I'm living thing");
    }
}
