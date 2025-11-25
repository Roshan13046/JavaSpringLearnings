public class NestedClass {

    int counter;
    static int staticCounter;
    private void nestedMethod(){
        System.out.println("Nested Method");

        //static nested class
        InnerClass innerClass = new InnerClass();
        innerClass.innerClassMethod();
    }

    private static class InnerClass {
        int innerClassCounter;

        private void innerClassMethod(){
            System.out.println("InnerClass Method");
            System.out.println(staticCounter);
        }
    }


}

