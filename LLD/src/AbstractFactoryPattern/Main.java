package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        VehicleFactory luxuryVehicleFactory = vehicleTypeFactory.getVehicleFactory("Luxury");
        luxuryVehicleFactory.getVehicle("BMW");
    }
}
