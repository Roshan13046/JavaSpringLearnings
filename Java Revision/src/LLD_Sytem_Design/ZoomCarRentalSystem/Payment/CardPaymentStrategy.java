package LLD_Sytem_Design.ZoomCarRentalSystem.Payment;

public class CardPaymentStrategy implements PaymentStrategy{

    @Override
    public void makeBillPayment(double amount) {
        System.out.println("Card Payment Strategy");
    }
}
