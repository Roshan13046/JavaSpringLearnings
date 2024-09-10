package InterfaceFeaturesInJava8AndJava9;

public class Main {
    public static void main(String[] args) {
        //way 1 to implement interfaces having default method
        Tiger tiger = new Tiger();
        tiger.canBreathe();

        Eagle eagle = new Eagle();
        eagle.hasDigestiveSystem();
        if(LivingThing.canEat()){
            System.out.println("Can Eat");
        };

        eagle.hasAge();
        if(LivingThing.checkIfCanGrow()){
            System.out.println("yes can grow");
        }

    }
}
