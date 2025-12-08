package LLD_Sytem_Design.ZoomCarRentalSystem.Payment;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public void makeBillPayment(double amount) {
        System.out.println("UPI payment strategy");
    }
}
