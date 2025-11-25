package localInnerClass;

public class OuterClass {

    int instanceVariable;
    static int classVariable;



    public void display(){
        int localVariable =0 ;

        class LocalInnerClass{
            int localInnerClassVariable = 0;
            public void print(){
                System.out.println(instanceVariable + classVariable + localVariable + localInnerClassVariable);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.print();
    }

    public static void main(String[] args) {
      OuterClass outerClass = new OuterClass(){
          @Override
          public void display(){
              System.out.println("Anonymous class");
          }
      };
      outerClass.display();
    }
}
