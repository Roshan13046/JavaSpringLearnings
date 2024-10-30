package CheckedCompileTimeException;

public class main {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        throw new ClassNotFoundException();
    }
}
