package NestedClasses;

public class OuterClass {

    int var1=10;
    static int staticClassVar2=20;

    //Non static  inner class
     class InnerClass{
        public void print(){
            System.out.println("Sum : " + var1 + staticClassVar2);
        }
    }
//Inheritance in non-static inner class
    class InheritInnerClass extends InnerClass{
         int inheritVar1 = 20;
         static int inheritVar2 = 30;

         public void display(){
             System.out.println("Inheritance in Inner class");
         }
    }

    public static void main(String[] args) {
        OuterClass oc1 = new OuterClass();
        InnerClass ic1 = oc1.new InnerClass(); //NOTE: Syntax to create instance of non static inner class
        //Inheritance in inner class
        InheritInnerClass iic1 = oc1.new InheritInnerClass();
        InnerClass iic2 = oc1.new InheritInnerClass();
        ic1.print();
    }
}
