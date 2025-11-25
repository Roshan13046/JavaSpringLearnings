package singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton dbConnection;

    private SynchronizedSingleton(){

    }

    synchronized public static SynchronizedSingleton getDbConnection(){
        if (dbConnection == null){
            dbConnection = new SynchronizedSingleton();
        }
        return dbConnection;
    }
}
