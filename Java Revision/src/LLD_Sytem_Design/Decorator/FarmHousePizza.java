package LLD_Sytem_Design.Decorator;

public class FarmHousePizza implements BasePizza{

    @Override
    public String getPizzaDescription(){
        return "Farm House Pizza";
    }

    @Override
    public int getCost(){
        return 150;
    }
}
