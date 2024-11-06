package CheckedCompileTimeException;

public class Person {

    public static void method1(String name) throws ClassNotFoundException, InterruptedException{
        if(name.equals("Class")){
            throw new ClassNotFoundException();
        }else{
            throw new InterruptedException();
        }
    }

    public static void main(String[] args) {
        try{
            Person.method1("Interrupt thread");
            Person.method1("Class");
        }catch(ClassNotFoundException expObj){
            System.out.println("Log: Class Not Found Exception");
        }catch (InterruptedException exp){//specific exception object
            System.out.println("Log: Interruption Exception");
        }catch(Exception e){ // generic exception obj : Note it has to kept at last, after this no specific
            //exception can be added
            System.out.println(e.getMessage());
        }
    }
}
