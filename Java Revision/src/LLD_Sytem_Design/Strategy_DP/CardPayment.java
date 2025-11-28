package LLD_Sytem_Design.Strategy_DP;

public class CardPayment implements PaymentStrategy{
    private String cardNumber;

    CardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void doPayment() {
        System.out.println("Card payment done by card by last 4 digits: " + cardNumber.substring(4,8));
    }
}
