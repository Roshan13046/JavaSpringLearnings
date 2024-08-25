package GenericClasses;

public class ChildClass extends ParentClass implements BirdFacade,CarFacade{
    String birdName, birdSpecies, carColor, carNumber;

    public ChildClass(String birdName, String birdSpecies, String carColor, String carNumber) {
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
        this.carColor = carColor;
        this.carNumber = carNumber;
    }

    public ChildClass(String name, String address, String birdName, String birdSpecies, String carColor, String carNumber) {
        super(name, address);
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
        this.carColor = carColor;
        this.carNumber = carNumber;
    }

    @Override
    public String getBirdName() {
        return birdName;
    }

    @Override
    public String getBirdSpecies() {
        return birdSpecies;
    }

    @Override
    public String getCarColor() {
        return carColor;
    }

    @Override
    public String getCarNumber() {
        return carNumber;
    }
}
