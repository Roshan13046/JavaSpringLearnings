package AnonymousClasses;

public class Test {

    public static void main(String[] args) {
        //Anonymous Class implementation
        Car mercedesCar = new Car() {
            @Override
            public void applyBrakes() {
                System.out.println("Mercedes Car Special Brake System ");
            }
        };

        mercedesCar.applyBrakes();
    }
}
