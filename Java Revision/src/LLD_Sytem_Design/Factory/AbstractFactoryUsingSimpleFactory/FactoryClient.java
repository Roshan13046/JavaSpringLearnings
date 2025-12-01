package LLD_Sytem_Design.Factory.AbstractFactoryUsingSimpleFactory;

public class FactoryClient {

    public static Object getFactoryClientType(String factoryType){
        Object obj;
        switch (factoryType){
            case "interior":
                obj = new InteriorFactory();
                break;
            case "exterior":
                obj = new ExteriorFactory();
                break;
            default:
                throw new IllegalStateException("No Such type of factory exists");
        }

        return obj;
    }
}
