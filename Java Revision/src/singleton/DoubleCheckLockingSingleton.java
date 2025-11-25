package singleton;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton dbConnection;

    private DoubleCheckLockingSingleton(){

    }

    public static DoubleCheckLockingSingleton getDbConnection(){
        if(dbConnection == null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(dbConnection == null){
                    dbConnection = new DoubleCheckLockingSingleton();
                }
            }
        }
        return dbConnection;
    }
}
