package InterfacesInDepth;

public class WhitePigeon implements BirdInterface{

    @Override
    public void canFly() {
        System.out.println("White Pigeon can fly");
    }

    @Override
    public void noOfLegs() {
        System.out.println("Pigeon had 2 legs");
    }
}
