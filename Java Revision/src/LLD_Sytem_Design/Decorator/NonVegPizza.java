package LLD_Sytem_Design.Decorator;

public class NonVegPizza implements BasePizza{
    @Override
    public String getPizzaDescription() {
        return "NonVeg Pizza";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
