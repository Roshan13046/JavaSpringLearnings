package LLD_Sytem_Design.Factory.AbstractFactoryUsingSimpleFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {

        InteriorFactory interiorFactory = (InteriorFactory)FactoryClient.getFactoryClientType("interior");
        LuxuryCarInterior luxury = (LuxuryCarInterior)interiorFactory.getInterior("luxury");
        luxury.showCarInterior();


    }
}
