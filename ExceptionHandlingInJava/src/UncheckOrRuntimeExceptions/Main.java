package UncheckOrRuntimeExceptions;

public class Main {
    public static void main(String[] args) {
        int val = 5/0; //ArithmeticException
        System.out.println(val);

        Object obj = 0;
        //ClassCastException
        System.out.println((String) obj);


    }
}
