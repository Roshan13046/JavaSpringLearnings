package InterfaceFeaturesInJava8AndJava9.LambdaExpressions;

public class Main {
    public static void main(String[] args) {
        //Implementing the functional interface using the Anonymous class
        Bird hen = new Bird() {
            @Override
            public void canFly() {
                System.out.println("Hen's cannot fly they can just run");
            }
        };

        //Implementing the functional interface using the Lambda Expression
        Bird peacock = ()->{
            System.out.println("Peackock can fly low and can move slowly");
        };

    }
}
