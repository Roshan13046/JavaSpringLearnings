package SingletonClass;

public class DBConnectionSynchronized {
    private static DBConnectionSynchronized dbConnectionSynchronized;

    private DBConnectionSynchronized(){

    }

    //Adv: multiple threads running in parallel get calls the method in synchronized form
    //DisAvd:
    //The program get's slower as due to synchronization lock/unlock process, the other threads have to wait for executions
    //Synchronized initialization
    synchronized public static DBConnectionSynchronized getInstance(){
        if(dbConnectionSynchronized == null){
            dbConnectionSynchronized = new DBConnectionSynchronized();
        }
        return dbConnectionSynchronized;
    }


}
