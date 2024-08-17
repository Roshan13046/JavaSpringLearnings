package AbstractClass;

public abstract class LuxuryCar extends Car{

    String brakeType;
    String drivingSeat;
    String doorAndWindow;

    LuxuryCar(){
        brakeType = null;
        drivingSeat = null;
        doorAndWindow = null;
    }

    LuxuryCar(String brakeType, String drivingSeat, String doorAndWindow){
        brakeType = brakeType;
        drivingSeat = drivingSeat;
        doorAndWindow = doorAndWindow;
    }

    @Override
    public void applyBrake() {
        System.out.println("Brakes Applied");
    }

    @Override
    public void drivingType() {
        System.out.println("Automatic Driving");
    }


    public abstract String getBrakeType();
    public abstract String getDrivingSeat();
    public abstract String getDoorAndWindow();
}
