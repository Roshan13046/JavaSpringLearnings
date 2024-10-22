package UncheckOrRuntimeExceptions;

public class Main {
    public static void main(String[] args) {
        Object obj = 0;
        //ClassCastException
        System.out.println((String) obj);
    }
}
