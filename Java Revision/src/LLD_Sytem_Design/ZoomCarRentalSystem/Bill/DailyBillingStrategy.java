package LLD_Sytem_Design.ZoomCarRentalSystem.Bill;

import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.Reservation;
import LLD_Sytem_Design.ZoomCarRentalSystem.Vehicle.VehicleManager;

public class DailyBillingStrategy implements BillingStrategy{
    VehicleManager vehicleManager;


    @Override
    public void generateBill(Reservation r) {
        System.out.println("Daily Billing Strategy");
    }
}
