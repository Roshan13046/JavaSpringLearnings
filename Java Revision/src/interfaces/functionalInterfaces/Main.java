package interfaces.functionalInterfaces;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(){
                @Override
                public void canFly() {
                    System.out.println("CAN FLY");
                }
        };

        Bird hen = ()->{
            System.out.println("Lambda expression");
        };


        //Consumer
        Consumer<Integer> loggingObject = (Integer val)->{
            if(val > 100){
                System.out.println("logging val : " + val);
            }
        };

        loggingObject.accept(101);

        //supplier
        Supplier<String> supplyObject = ()->{
            System.out.println("SUPPLIED OBJECT : " + "ROSHAN");
            return "ROSHAN";
        };

        supplyObject.give();

        //function
        Function<String, Integer> funObject = (Integer val)->{
          return val.toString();
        };

        funObject.apply(12345);

        //predicate
        Predicate<Integer> predicateObj = (Integer val)->{
            System.out.println("val > 20 "+ (val > 20));
            return val>20;
        };

        predicateObj.test(30);

    }
}

