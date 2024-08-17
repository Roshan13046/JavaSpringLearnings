package AbstractClass;

public abstract class SportsBike implements Bike{

    @Override
    public String getBikeType() {
        return "Sports Bike";
    }

    @Override
    public int getNoOfWheels() {
        return 2;
    }

    public abstract String getSuspensionType();
    public abstract int getMaxSpeedLimit();
}
