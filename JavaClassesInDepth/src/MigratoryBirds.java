public class MigratoryBirds extends Bird{

    String name;
    String foodType;
    String travellingRouteDistance;

    @Override
    public String getFoodType() {
        return foodType;
    }

    @Override
    public String getName(){
        return name;
    }

    public String getTravellingRouteDistance(){
        return travellingRouteDistance;
    }
}
