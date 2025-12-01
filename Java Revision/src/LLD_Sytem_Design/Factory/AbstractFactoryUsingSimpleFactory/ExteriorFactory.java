package LLD_Sytem_Design.Factory.AbstractFactoryUsingSimpleFactory;

public class ExteriorFactory {
    public static Object getExterior(String interiorType){
        Object obj;
        switch(interiorType){
            case "luxury":
                obj = new LuxuryCarExterior();
                break;
            case "normal":
                obj = new NormalCarExterior();
                break;
            default:
                throw new IllegalStateException("No Such Exterior type");
        }
        return obj;
    }
}