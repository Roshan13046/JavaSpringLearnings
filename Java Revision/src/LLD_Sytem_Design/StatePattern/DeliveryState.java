package LLD_Sytem_Design.StatePattern;

public class DeliveryState implements OrderState{
    @Override
    public void prevState(Order order) {
        order.setState(new ShippingState());
    }

    @Override
    public void nextState(Order order) {
        System.out.println("order in delivery state no Next state");
    }

    @Override
    public void printState() {
        System.out.println("Order in Delivery state");
    }
}
