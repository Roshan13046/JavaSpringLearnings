package NestedClasses;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.printDetails();
        Person.displayDetails();
        System.out.println(Person.address);

        //Accessing nested class
//        Person.Actor actor1 = new Person.Actor();
//        Person.Actor actor2 = new Person.Actor();
//        actor2.getNameAndAddress();

        System.out.println(person.getActorNameAndAddress());
    }
}
