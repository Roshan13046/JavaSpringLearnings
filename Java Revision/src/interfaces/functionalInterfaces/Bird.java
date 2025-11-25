package interfaces.functionalInterfaces;

@FunctionalInterface
public interface Bird {

     void canFly();
     default void getHeight(){
         System.out.println("get height");
     }

     static void canEat(){
         System.out.println("can Eat");
     }

//     String toString();


}


