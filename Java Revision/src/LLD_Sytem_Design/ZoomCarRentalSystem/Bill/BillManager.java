package LLD_Sytem_Design.ZoomCarRentalSystem.Bill;

import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.Reservation;

import java.util.concurrent.ConcurrentMap;

public class BillManager {
    ConcurrentMap<Integer, Bill> bills;

    BillingStrategy billingStrategy;

    public void generateBill(Reservation reservation){

    }
}
