package LLD_Sytem_Design.ZoomCarRentalSystem.Bill;

import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.Reservation;

public interface BillingStrategy {

    public void generateBill(Reservation r);
}
