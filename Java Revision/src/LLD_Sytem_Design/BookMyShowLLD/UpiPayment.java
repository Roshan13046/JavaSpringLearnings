package LLD_Sytem_Design.BookMyShowLLD;

public class UpiPayment extends Payment{
    @Override
    void doPayment(double amount) {
        System.out.println("Amount payment done : " + amount);
    }
}
