package LLD_Sytem_Design.StatePattern;

public class ShippingState implements OrderState{
    @Override
    public void prevState(Order order) {
        order.setState(new NewState());
    }

    @Override
    public void nextState(Order order) {
        order.setState(new DeliveryState());
    }

    @Override
    public void printState() {
        System.out.println("Order in Shipping State");
    }
}
