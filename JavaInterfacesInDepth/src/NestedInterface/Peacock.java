package NestedInterface;

//Implementing the outer and inner interface
public class Peacock implements Birds, Birds.NonFlyingBirds{
    @Override
    public void canFly() {
        System.out.println("Male Peacock can Fly");
    }

    @Override
    public void canRun() {
        System.out.println("Female peacock can Run");
    }
}
