package NestedInterface;

//class implementing nestedInterface
public class SeaSnake implements Animal.AquaticAnimal{
    @Override
    public void canLiveInWater() {
        System.out.println("Can Live on Land");
    }
}
