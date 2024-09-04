import InterfacesInDepth.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Interface can be used a data type to store the references of all the classes which implements it
        FlyingBirds eagleBird = new Eagle();
        eagleBird.canFly();
        NonFlyingBirds henBird = new Hen();
        henBird.canRun();
        Birds peacock = new Hen();
        peacock.canEat();
    }
}