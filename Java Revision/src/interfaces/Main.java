package interfaces;

public class Main {
    public static void main(String[] args) {
        Bird.NonFlyingBird bird = new Eagle();
        bird.canRun();


        LivingThing hen = new Hen();
        hen.canBreathe();
    }
}

