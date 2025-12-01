package LLD_Sytem_Design.StatePattern;

public interface OrderState {
    public void prevState(Order order);
    public void nextState(Order order);
    public void printState();
}
