package LLD_Sytem_Design.Decorator;

public abstract class Topping implements BasePizza {
    protected  BasePizza basePizza;

    Topping(BasePizza basePizza){
        this.basePizza = basePizza;
    }
}
