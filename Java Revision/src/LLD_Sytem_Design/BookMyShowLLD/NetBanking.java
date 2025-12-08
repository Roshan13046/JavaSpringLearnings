package LLD_Sytem_Design.BookMyShowLLD;

public class NetBanking extends Payment{
    @Override
    void doPayment(double amount) {
        System.out.println("Payment NetBanking done of amount " + amount);
    }
}
