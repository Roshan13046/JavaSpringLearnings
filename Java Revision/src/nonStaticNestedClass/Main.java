package nonStaticNestedClass;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerClassMethod();

        OuterClass.InnerClass2 innerClass2 = outerClass.new InnerClass2();
        innerClass2.innerClass2Method();
    }
}
