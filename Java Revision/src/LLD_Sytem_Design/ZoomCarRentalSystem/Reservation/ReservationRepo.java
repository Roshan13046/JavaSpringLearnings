package LLD_Sytem_Design.ZoomCarRentalSystem.Reservation;

import java.util.Map;

public class ReservationRepo {
    //reservationId's -> reservation
    Map<Integer, Reservation> reservations;

    save(Reservation reservation);
    findById(int reservationId);
    remove(int reservationId);
}
