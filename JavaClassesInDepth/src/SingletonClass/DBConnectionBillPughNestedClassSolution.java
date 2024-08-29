package SingletonClass;

public class DBConnectionBillPughNestedClassSolution {
    //it is similar to earger initialization only thing is that it's object is initialized inside a static nested class
    private DBConnectionBillPughNestedClassSolution(){

    }

    //private static nested class
    private static class DBConnectionBillPughNestedClassHelper{
        private static final DBConnectionBillPughNestedClassSolution singletonObj = new DBConnectionBillPughNestedClassSolution();
    }

    public static DBConnectionBillPughNestedClassSolution getInstance(){
        return DBConnectionBillPughNestedClassHelper.singletonObj;
    }
}
