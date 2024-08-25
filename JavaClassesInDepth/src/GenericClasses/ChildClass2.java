package GenericClasses;

public class ChildClass2 extends ParentClass implements BirdFacade{
    String birdName, birdSpecies;

    public ChildClass2(String birdName, String birdSpecies) {
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
    }

    public ChildClass2(String name, String address, String birdName, String birdSpecies) {
        super(name, address);
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
    }

    @Override
    public String getBirdName() {
        return birdName;
    }

    @Override
    public String getBirdSpecies() {
        return birdSpecies;
    }


}
