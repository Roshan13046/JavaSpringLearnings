package singleton;

public class LazySingleton {
    private static LazySingleton dbConnection;

    private LazySingleton(){

    }

    public static LazySingleton getDbConnection(){
        if(dbConnection == null){
            dbConnection = new LazySingleton();
        }

        return dbConnection;
    }
}
