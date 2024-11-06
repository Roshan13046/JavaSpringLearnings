package CheckedCompileTimeException;

public class main {
    public static void main(String[] args)  {
        try{
            method1();
        }catch (ClassNotFoundException exceptionObj){
            exceptionObj.printStackTrace();
        }
    }

    //way 1: throws keyword asks the caller method to handle the exception
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

    //way 2: using try catch block
    public static void method2(){
        try{
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException exceptionObject){
            System.out.println("Exception found");
            exceptionObject.printStackTrace();
        }
    }
}
