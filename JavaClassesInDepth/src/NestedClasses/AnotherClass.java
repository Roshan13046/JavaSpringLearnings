package NestedClasses;

public class AnotherClass extends OuterClass.InnerClass {

    AnotherClass(){
//        We now when child class constructor is invoked, it first invokes the constructor of the parent class
//        Here the Inner class is the parent class so it can only be invoked by the object of the Outer class
        new OuterClass().super();
    }

    public void display(){
        //calling the print of the parent class
        print();
    }
}
