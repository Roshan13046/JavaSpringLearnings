package AbstractFactoryPattern;

public class VehicleTypeFactory {
    VehicleFactory getVehicleFactory(String factoryType){
        switch (factoryType){
            case "Luxury":
                return new LuxuryVehicleFactory();

            case "Ordinary":
                return new OrdinaryVehicleFactory();
            default:
                return null;
        }
    }
}
