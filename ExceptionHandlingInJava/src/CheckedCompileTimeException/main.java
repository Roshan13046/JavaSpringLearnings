package CheckedCompileTimeException;

public class main {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }

    //throws keyword asks the caller method to handle the exception
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
