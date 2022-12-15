package GitProject5.controller;
import GitProject5.model.booking.BookingOptions;

public class BookingItemCalculatorEU extends AbstractBookingItemCalculator {
    private final double admFee = 0.15;
    public double getBookingClassRateOption(BookingOptions bookingOption) {

        switch (bookingOption) {
            case ECONOMY_CLASS:
                return 0.85;
            case BUSINESS_CLASS:
                return 0.82;
            case FIRST_CLASS:
                return 0.8;
            default:
                System.err.println("Booking option invalid");
                return 1;
        }
    }

    public double getAdmFee() {
        return admFee;
    }
}
