package LLD_Sytem_Design.Decorator;

public class ChickenTopping extends Topping{

    ChickenTopping(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getPizzaDescription() {
        return basePizza.getPizzaDescription() + " + Chicken Topping";
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 100;
    }
}
