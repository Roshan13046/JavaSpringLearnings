package InterfaceFeaturesInJava8AndJava9.ScenariosOfFunctionalInterfacesExtending;

public class Main {
    public static void main(String[] args) {
        Fan fanObj = ()->{
            System.out.println("Non-Living things cannot Breathe");
        };

        fanObj.cannotBreathe();
    }
}
