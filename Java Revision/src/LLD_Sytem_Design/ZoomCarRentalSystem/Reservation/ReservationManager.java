package LLD_Sytem_Design.ZoomCarRentalSystem.Reservation;

import LLD_Sytem_Design.BuilderPattern.User;
import LLD_Sytem_Design.ZoomCarRentalSystem.Vehicle.VehicleManager;

public class ReservationManager {
    //calls inventory manager to update vehcile status
    VehicleManager vehicleManager;
    ReservationRepo reservationRepo;

    createReservation(int vehicleId, User user, Date startDate, Date endDate);
    findById(int reservationId);
    cancelReservation(int reservationId);
    startTrip(int reservationId);
    completeTrip(int reservationId);
    remove(int reservationId);
}
