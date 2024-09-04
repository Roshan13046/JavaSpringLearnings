package NestedInterface;

//implementing the ineer interface
public class Ostrich implements Birds.NonFlyingBirds {
    @Override
    public void canRun() {
        System.out.println("Ostrich can Run and cannot fly");
    }
}
