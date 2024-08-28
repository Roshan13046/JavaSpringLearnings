package SingletonClass;

public class DBConnectionDoubleCheckLocking {

    //volatile make the program to search it in the memory and not into the cache
    private static volatile DBConnectionDoubleCheckLocking dbConnectionDoubleCheckLocking;

    private DBConnectionDoubleCheckLocking() {
    }

    public static DBConnectionDoubleCheckLocking getInstance(){
        if(dbConnectionDoubleCheckLocking == null){ //CHECK 1
            synchronized (DBConnectionDoubleCheckLocking.class){ //Synchronization check for multiple threads
                if(dbConnectionDoubleCheckLocking == null){ //CHECK 2
                    dbConnectionDoubleCheckLocking = new DBConnectionDoubleCheckLocking();
                }
            }
        }
        return dbConnectionDoubleCheckLocking;
    }
}
