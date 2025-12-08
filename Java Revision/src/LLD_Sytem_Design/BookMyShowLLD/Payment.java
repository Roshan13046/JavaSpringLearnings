package LLD_Sytem_Design.BookMyShowLLD;

public abstract class Payment {
    int paymentId;
    PaymentStatus paymentStatus;
    abstract void doPayment(double amount);
}
