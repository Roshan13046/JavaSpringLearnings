package InterfaceFeaturesInJava8AndJava9.TypesOfFunctionalInterfaces;

public class Main {
    public static void main(String[] args) {
        //Consumer Functional Interface
        Consumer<Integer> logObj = (Integer val) -> {
            if (val < 10) {
                System.out.println("Logging less than 10 values and val = " + val);
            } else {
                System.out.println("Logging more than 10 values and val = " + val);
            }
        };

        logObj.accept(8);
        logObj.accept(234);


        //Supplier Functional Interface
        Supplier<String> supObj = () -> "My name is Roshan Raut";

        Supplier<String> supObj2 = () -> {
            return "My name is Shubham Raut";
        };

        System.out.println(supObj.get());
        System.out.println(supObj2.get());
    }




}
