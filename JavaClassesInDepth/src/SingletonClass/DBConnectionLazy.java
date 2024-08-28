package SingletonClass;

public class DBConnectionLazy {
//    Adv: Now the instance gets created only if the singleton getInstance() method is called, else it won't
    //DisAdv: if two threads running in parallel and the object is null, it may create multiple objects still
    private static DBConnectionLazy dbConnectionLazy = new DBConnectionLazy();

    private DBConnectionLazy(){

    }

    //Lazy initialization
    public static DBConnectionLazy getInstance(){
        if(dbConnectionLazy == null){
            dbConnectionLazy = new DBConnectionLazy();
        }
        return dbConnectionLazy;
    }

}
