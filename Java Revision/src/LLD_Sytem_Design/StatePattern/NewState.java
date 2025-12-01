package LLD_Sytem_Design.StatePattern;

public class NewState implements OrderState{

    @Override
    public void prevState(Order order) {
        System.out.println("No Prev order state");
    }

    @Override
    public void nextState(Order order) {
        order.setState(new ShippingState());
    }

    @Override
    public void printState() {
        System.out.println("Order in new state");
    }
}
