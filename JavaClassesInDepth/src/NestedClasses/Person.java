package NestedClasses;

 public class Person {
     String name;
     static String  address;

     public static void displayDetails(){
         System.out.println("Displayed Person Details");
     }

     public void printDetails(){
         System.out.println("Person Details Printed");
     }

     public String getActorNameAndAddress(){
         Actor actor = new Actor();
         return actor.getNameAndAddress();
     }

//    protected static class Actor{
     //Note: if private inner static nested class then it's object can't be created outside this Person class
      private static class Actor{
         //     public static class Actor{
        public String getNameAndAddress(){
//            System.out.println(name + address);//non static members cannot be accessed from static class method
            displayDetails();
            Person p = new Person();
            p.printDetails();

            return p.name + address;
        }
    }

     public static void main(String[] args) {
        Person person = new Person();
        person.printDetails();
        Person.displayDetails();
         System.out.println(Person.address);

         //Accessing nested class
         Actor actor1 = new Actor();
         Person.Actor actor2 = new Person.Actor();
         actor2.getNameAndAddress();
     }

}
