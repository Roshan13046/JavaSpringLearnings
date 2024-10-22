package UncheckOrRuntimeExceptions;

public class Main {
    public static void main(String[] args) {
        //IndexOutOfBoundException

        //StringIndexOutOfBoundsException
        String str = "ROSHAN";
        System.out.println(str.charAt(6));

        //ArrayIndexOutOfBoundsException
        int [] arr = new int[3];
        System.out.println(arr[5]);


        int val = 5/0; //ArithmeticException
        System.out.println(val);

        Object obj = 0;
        //ClassCastException
        System.out.println((String) obj);


    }
}
