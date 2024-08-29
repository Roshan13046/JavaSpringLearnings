package SingletonClass;

public class DataBaseConnection {
    //Adv:
//    Only one obj created once the application runs, it's used for the DB connection, once DB connection is
//    done we can call
//    multiple db queries and fetch the data,

    //DisAdv:
//    Even if the DB is not used, the object still get's created and stored into the memory,
//    which is unnecessary creation

    //Eager Initialization Singleton class
    //private bcz the object should be accessed with this class only,
    //static means the object belongs to the class now
    private static DataBaseConnection dbConnection = new DataBaseConnection();

    //private constructor so that the multiple instance cannot be created outside the class
    private DataBaseConnection(){

    }

    //return the created instance, it's public so that can be called outside the class, and static as it belongs to class
    public static DataBaseConnection getInstance(){
        return dbConnection;
    }
}
