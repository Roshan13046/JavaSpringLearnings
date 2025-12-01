package LLD_Sytem_Design.Decorator;

public class MushroomTopping extends Topping{

    MushroomTopping(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getPizzaDescription() {
        return basePizza.getPizzaDescription() + " + Extra Mushroom";
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 80;
    }
}
