package LLD_Sytem_Design.StatePattern;

public class Order {
    OrderState orderState;

    Order(){
        this.orderState = new NewState();
    }

    public void setState(OrderState orderState){
        this.orderState = orderState;
    }

    void prevState(){
        orderState.prevState(this);
    }

    void nextState(){
        orderState.nextState(this);
    }

    void printState(){
        orderState.printState();
    }
}
