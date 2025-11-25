package singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    private static class DbConnection{
        private static final BillPughSingleton dbConnection = new BillPughSingleton();

        public BillPughSingleton getDbConnection(){
            return dbConnection;
        }

    }
}
