package LLD_Sytem_Design.ZoomCarRentalSystem.Bill;

public class Bill {
    int billId;
    int reservationId;
    double totalBillAmount;
    boolean isBillPaid;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }

    public boolean isBillPaid() {
        return isBillPaid;
    }

    public void setBillPaid(boolean billPaid) {
        isBillPaid = billPaid;
    }
}
