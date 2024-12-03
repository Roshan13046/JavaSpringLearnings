package AbstractFactoryPattern;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch(input){
            case "Tata":
                return new OrdinaryV1();
            case "Toyota":
                return new OrdinaryV2();
            default:
                return null;
        }
    }
}
