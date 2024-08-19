public class MigratoryBirds extends Bird{

    String name;
    String foodType;
    String travellingRouteDistance;

    MigratoryBirds(){
        name  = null;
        foodType = null;
        travellingRouteDistance = null;
    }

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
