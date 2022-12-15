package GitProject5.controller;

public class BookingItemAmount {

    private double totalBookingItemAmount;
    private double totalBookingAmountAdmFee;
    private double totalBookingAmountWithAdmFee;

    public BookingItemAmount(double totalBookingItemAmount, double totalBookingAmountAdmFee, double totalBookingAmountWithAdmFee) {
        this.totalBookingItemAmount = totalBookingItemAmount;
        this.totalBookingAmountAdmFee = totalBookingAmountAdmFee;
        this.totalBookingAmountWithAdmFee = totalBookingAmountWithAdmFee;
    }
    public double getTotalBookingItemAmount() {
        return totalBookingItemAmount;
    }

    public double getTotalBookingAmountAdmFee() {
        return totalBookingAmountAdmFee;
    }

    public double getTotalBookingAmountWithAdmFee() {
        return totalBookingAmountWithAdmFee;
    }

    public void setTotalBookingAmountWithAdmFee(double totalBookingAmountWithAdmFee) {
        this.totalBookingAmountWithAdmFee = totalBookingAmountWithAdmFee;
    }
}
