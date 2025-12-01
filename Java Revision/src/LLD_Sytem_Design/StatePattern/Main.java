package LLD_Sytem_Design.StatePattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.printState();

        order.nextState();
        order.printState();

        order.nextState();
        order.printState();

        order.nextState();
        order.prevState();

    }
}
