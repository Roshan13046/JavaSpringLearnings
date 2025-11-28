package LLD_Sytem_Design.Strategy_DP;

public class upiPaymentStrategy implements PaymentStrategy {

    private String upiId;

    upiPaymentStrategy(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void doPayment() {
        System.out.println("UPI payment done by upi id : " + upiId);
    }

}
