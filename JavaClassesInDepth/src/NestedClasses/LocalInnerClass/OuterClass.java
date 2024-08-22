package NestedClasses.LocalInnerClass;

public class OuterClass {

    int var1 = 10;
    static int staticVar2 = 20;


    public void display(boolean showLocalInnerClass){

        if(showLocalInnerClass){
            //Local inner class, it can't be public, private, protected. it has default access as it end after block execution ends
             class LocalInnerClass{
                int innerClassVar1 = 30;
                static int staticInnerClassVar1 = 30;

                public void print(){
                    System.out.println(innerClassVar1 + staticInnerClassVar1 + var1 + staticVar2);
                }
            }
            //it can only be instantiated inside the block of code
            LocalInnerClass localInnerClass = new LocalInnerClass();
            localInnerClass.print();
        }
    }
}
