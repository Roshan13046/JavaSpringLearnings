package LLD_Sytem_Design.Strategy_DP;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessorCard = new PaymentProcessor(new CardPayment("12345678"));
        PaymentProcessor paymentProcessorUpi = new PaymentProcessor(new upiPaymentStrategy("123456789@xyz"));
        paymentProcessorCard.doPaymentProcess();
        paymentProcessorUpi.doPaymentProcess();


    }
}
