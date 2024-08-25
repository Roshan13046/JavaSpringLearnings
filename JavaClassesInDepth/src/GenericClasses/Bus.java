package GenericClasses;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Vehicle{
    String busType;

    public Bus(){
        busType = null;
    }
    public Bus(String busType) {
        busType = busType;
    }

    public Bus(String no, String seater, String busType) {
        super(no, seater);
        busType = busType;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bus touristBus = new Bus();
        Vehicle schoolBus = new Bus();

        vehicle = touristBus;
        schoolBus = vehicle;
//        touristBus = vehicle;//ERROR: Not allowed

        List<Vehicle> vehicleList = new ArrayList<>();
        List<Bus> busList = new ArrayList<>();

//        vehicleList = busList;//Error: not allowed
//        busList = vehicleList;//Error: not allowed

        Display displayObj = new Display();

        //Wild card Upper Bound : classes allowed are from upper class to lower class
        displayObj.display(vehicleList);
        displayObj.display(busList);

        //Wild card Lower Bound : classes allowed are from lower class to upper class
        displayObj.display2(vehicleList);
        displayObj.display2(busList);
    }
}
