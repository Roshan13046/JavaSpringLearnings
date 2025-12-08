package LLD_Sytem_Design.ZoomCarRentalSystem.Vehicle;

import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.Reservation;
import LLD_Sytem_Design.ZoomCarRentalSystem.Reservation.ReservationRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class VehicleManager {
    private final ConcurrentMap<Integer, Vehicle> vehicles = new ConcurrentHashMap<>();
    private final ConcurrentMap<Integer, List<Integer>> vehicleBookingIds = new ConcurrentHashMap<>();

    private final ConcurrentMap<Integer, ReentrantLock> vehicleLocks = new ConcurrentHashMap<>();

    private ReservationRepo reservationRepo;

    public void addVehicle(Vehicle vehicle){
        vehicles.put(vehicle.getVehicleId(), vehicle);
    }
    public void removeVehicle(int vehicleId){

    }

    public void updateVechile(Vehicle vehicle);

    public Optional<Vehicle> getVehicle(int vehicleId){
        return Optional.ofNullable(vehicles.get(vehicleId));
    }

    private void setReservationRepo(ReservationRepo reservationRepo){
        this.reservationRepo = reservationRepo;
    }

    public void bookVehicle(int vehicleId, int reservationId, Date from, Date to);
    public boolean isAvailable(int vehicleId, LocalDate from, LocalDate to){
        Vehicle vehicle = vehicles.get(vehicleId);
        if(vehicle == null ) return false;
        if(vehicle.getVehicleStatus() == VehicleStatus.INACTIVE) return false;
        DateInterval requested = new DateInterval(from, to);
        List<Integer> reservationIDs = vehicleBookingIds.get(vehicleId);

        if(reservationIDs == null || reservationIDs.isEmpty()){
            return true;
        }

        for(int reservationId : reservationIDs){
            Reservation reservation = reservationRepo.findById(reservationId).get();
            LocalDate bookedFrom = reservation.getStartDate();
            LocalDate bookedTill = reservation.getEndDate();
            DateInterval bookedInterval = new DateInterval(bookedFrom, bookedTill);
            if(bookedInterval.overlaps(requested)){
                return false;
            }
        }

        return true;
    }

    //Atomic Booking
    public boolean reserve(int vehicleId, int reservationId, LocalDate from, LocalDate to){
        ReentrantLock lock = putLockOnVehicle(vehicleId);
        lock.lock();

        try{
            if(!isAvailable(vehicleId, from, to)) return false;

            vehicleBookingIds.putIfAbsent(vehicleId, new ArrayList<>());
            vehicleBookingIds.get(vehicleId).add(reservationId);

            vehicles.get(vehicleId).setVehicleStatus(VehicleStatus.INACTIVE);

            return true;
        }finally {
            lock.unlock();
        }
    }

    //Atomic Release
    public void release(int vehicleId, int reservationId){
        ReentrantLock lock = putLockOnVehicle(vehicleId);
        lock.lock();

        try{
            List<Integer> ids = vehicleBookingIds.get(vehicleId);
            if(ids != null) ids.remove(Integer.valueOf(reservationId));

            List<Integer> stillBooked = vehicleBookingIds.get(vehicleId);
            if(stillBooked == null || stillBooked.isEmpty()){
                vehicles.get(vehicleId).setVehicleStatus(VehicleStatus.ACTIVE);
            }
        }finally {
            lock.unlock();
        }
    }

    public List<Vehicle> getAvailableVehicles(VehicleType type, LocalDate from,
                                              LocalDate to){
        return vehicles.values().stream().
                filter(v-> v.getVehicleType() == type)
                .filter(v -> isAvailable(v.getVehicleId(), from, to))
                .collect(Collectors.toList());

    }

    public ReentrantLock putLockOnVehicle(int vehicleId){
        vehicleLocks.putIfAbsent(vehicleId, new ReentrantLock());
        return vehicleLocks.get(vehicleId);
    }
}
