package InterfacesInDepth;

public abstract class Pigeon implements BirdInterface{
    @Override
    public void canFly() {
        System.out.println("Yes pigeon can fly");
    }

    public abstract void beakLength();
}
