package AbstractFactoryPattern;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input) {
            case "Audi":
                return new LuxuryV1();
            case "BMW":
                return new LuxuryV2();
            default:
                return null;
        }
    }
}
