package LLD_Sytem_Design.Decorator;

public class ChesseTooping extends Topping{

    ChesseTooping(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getPizzaDescription() {
        return basePizza.getPizzaDescription() + " + Extra Cheese";
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 50;
    }
}
