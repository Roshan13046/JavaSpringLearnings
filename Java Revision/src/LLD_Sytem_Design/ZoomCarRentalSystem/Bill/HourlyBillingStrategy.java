package LLD_Sytem_Design.ZoomCarRentalSystem.Bill;

import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.Reservation;
import LLD_Sytem_Design.ZoomCarRentalSystem.Vehicle.VehicleManager;

public class HourlyBillingStrategy implements BillingStrategy {
    VehicleManager inventory;

    @Override
    public void generateBill(Reservation r) {
        System.out.println("Hourly Billing");
    }
}
