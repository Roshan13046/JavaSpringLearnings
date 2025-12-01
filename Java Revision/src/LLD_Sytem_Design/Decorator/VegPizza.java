package LLD_Sytem_Design.Decorator;

public class VegPizza implements BasePizza{

    @Override
    public String getPizzaDescription(){
        return "Veg-Pizza";
    }

    @Override
    public int getCost(){
        return 200;
    }
}
