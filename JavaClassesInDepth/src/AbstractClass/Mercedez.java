package AbstractClass;

public class Mercedez extends LuxuryCar{

    Mercedez(String brakeType, String drivingSeat, String doorWindow ){
        super(brakeType, drivingSeat, doorWindow);
    }

    Mercedez(){
        super();
    }

    @Override
    public String getBrakeType () {
        return "Air Pressure and Hydraulic Brakes";
    }

    public String getDrivingSeat(){
        return "Left Driving seat";
    }

    public String getDoorAndWindow(){
        return "Door and Windows are automatic with human touch sensers";
    }

    public static void main(String[] args) {
        Car mercedeszX1 = new Mercedez("Hydraulic", "Left", "Automatic Human Sensor");
        Car mercedeszC3 = new Mercedez();
    }
}
