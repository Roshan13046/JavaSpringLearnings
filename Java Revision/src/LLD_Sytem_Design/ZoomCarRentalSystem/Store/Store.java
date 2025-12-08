package LLD_Sytem_Design.ZoomCarRentalSystem.Store;

import LLD_Sytem_Design.ZoomCarRentalSystem.Bill.BillManager;
import LLD_Sytem_Design.ZoomCarRentalSystem.Payment.PaymentManager;
import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.ReservationManager;
import LLD_Sytem_Design.ZoomCarRentalSystem.Vehicle.VehicleManager;

import javax.xml.stream.Location;
import java.util.Date;

public class Store {
    int storeId;
    Location location;
    BillManager billManager;
    PaymentManager paymentManager;
    VehicleManager vehicleManager;
    ReservationManager reservationManager;

    getVehicles(Date from, Date to);
    createReservation();
    generateBill();
    makePayment();

}
