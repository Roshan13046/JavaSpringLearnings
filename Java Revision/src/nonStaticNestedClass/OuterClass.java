package nonStaticNestedClass;

public class OuterClass {
    int instanceVariable;
    static int classVariable;
    public class InnerClass{
        int innerClassVariable;

        public void innerClassMethod(){
            System.out.println(instanceVariable + classVariable);
        }
    }


    class InnerClass2 extends InnerClass{
        int innerClass2Variable;

        public void innerClass2Method(){
            System.out.println(instanceVariable + classVariable + innerClassVariable + innerClass2Variable);
        }
    }
}
