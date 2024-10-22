package UncheckOrRuntimeExceptions;

public class Main {
    public static void main(String[] args) {
        //IllegalArgumentException : NumberFormatException
        int value = Integer.parseInt("123");
        int value2 = Integer.parseInt("abcRoshan");

        //NullPointerException
        Object object = null ;
        System.out.println(object.getClass());
        String str2 = null;
        System.out.println(str2.charAt(2));


        //IndexOutOfBoundException
        //1.StringIndexOutOfBoundsException
        String str = "ROSHAN";
        System.out.println(str.charAt(6));

        //2.ArrayIndexOutOfBoundsException
        int [] arr = new int[3];
        System.out.println(arr[5]);


        int val = 5/0; //ArithmeticException
        System.out.println(val);

        Object obj = 0;
        //ClassCastException
        System.out.println((String) obj);


    }
}
