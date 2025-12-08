package LLD_Sytem_Design.ZoomCarRentalSystem.Vehicle;

public class Vehicle {
    int vehicleId;
    String vehicleNo;
    String vehicleChassisNo;
    String vehicleModelNo;
    String vehicleRegistrationDate;
    String kmsDriven;
    int dailyRent;
    int hourlyRent;
    int average;
    int noOfSeats;
    VehicleType vehicleType;
    VehicleStatus vehicleStatus;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleChassisNo() {
        return vehicleChassisNo;
    }

    public void setVehicleChassisNo(String vehicleChassisNo) {
        this.vehicleChassisNo = vehicleChassisNo;
    }

    public String getVehicleModelNo() {
        return vehicleModelNo;
    }

    public void setVehicleModelNo(String vehicleModelNo) {
        this.vehicleModelNo = vehicleModelNo;
    }

    public String getVehicleRegistrationDate() {
        return vehicleRegistrationDate;
    }

    public void setVehicleRegistrationDate(String vehicleRegistrationDate) {
        this.vehicleRegistrationDate = vehicleRegistrationDate;
    }

    public String getKmsDriven() {
        return kmsDriven;
    }

    public void setKmsDriven(String kmsDriven) {
        this.kmsDriven = kmsDriven;
    }

    public int getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getHourlyRent() {
        return hourlyRent;
    }

    public void setHourlyRent(int hourlyRent) {
        this.hourlyRent = hourlyRent;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
