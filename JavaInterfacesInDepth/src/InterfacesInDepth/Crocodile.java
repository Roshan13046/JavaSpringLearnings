package InterfacesInDepth;

public class Crocodile implements WaterAnimal, LandAnimal{
//Multiple Inheritance is possible only through interfaces in Java else it leads to Diamond Problem
    @Override
    public void canBreath() {
        System.out.println("Crocodile can breath in water and on the Land");
    }
}
