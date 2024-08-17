package AbstractClass;

public abstract class Car {
    int noOfWheels ;


    Car(){
        noOfWheels = 4;
    }

    public abstract void applyBrake();
    public abstract void drivingType();
    public int getNoOfWheels(){
        return 4;
    }

}
