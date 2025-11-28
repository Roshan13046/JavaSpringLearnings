package LLD_Sytem_Design.Strategy_DP;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void doPaymentProcess(){
        paymentStrategy.doPayment();
    }

}
