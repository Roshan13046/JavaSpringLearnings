package LLD_Sytem_Design.Decorator;

public class Client {
    public static void main(String[] args) {
        BasePizza farmHousePizza = new FarmHousePizza();
        System.out.println(farmHousePizza.getPizzaDescription() + " , " + farmHousePizza.getCost());

        BasePizza vegMushroomCheesePizza = new MushroomTopping(new ChesseTooping(new VegPizza()));
        System.out.println(vegMushroomCheesePizza.getPizzaDescription() + " , " + vegMushroomCheesePizza.getCost());
    }
}
