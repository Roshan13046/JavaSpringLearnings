package singleton;

public class Singleton {
    private static Singleton dbConnection = new Singleton();

    private Singleton(){

    }

    public static Singleton getDbConnection(){
        return dbConnection;
    }
}
