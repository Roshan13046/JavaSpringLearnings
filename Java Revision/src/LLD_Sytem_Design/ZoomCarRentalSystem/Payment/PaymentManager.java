package LLD_Sytem_Design.ZoomCarRentalSystem.Payment;

import LLD_Sytem_Design.Strategy_DP.PaymentStrategy;
import LLD_Sytem_Design.ZoomCarRentalSystem.Bill.Bill;

import java.util.concurrent.ConcurrentMap;

public abstract class PaymentManager {

    ConcurrentMap<Integer, Payment> payment;
    PaymentStrategy paymentStrategy;

    public abstract void makePayment(Bill bill, double amount);
}
