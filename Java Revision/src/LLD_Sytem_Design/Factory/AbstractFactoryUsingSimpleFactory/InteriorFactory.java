package LLD_Sytem_Design.Factory.AbstractFactoryUsingSimpleFactory;

public class InteriorFactory {
    public static Object getInterior(String interiorType){
        Object obj;
        switch(interiorType){
            case "luxury":
                 obj = new LuxuryCarInterior();
                break;
            case "normal":
                obj = new NormalCarInterior();
                break;
            default:
                throw new IllegalStateException("No Such interior type");
        }
        return obj;
    }
}
