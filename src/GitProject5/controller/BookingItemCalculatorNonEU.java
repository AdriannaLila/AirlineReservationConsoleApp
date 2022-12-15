package GitProject5.controller;

import GitProject5.model.booking.BookingOptions;

public class BookingItemCalculatorNonEU extends AbstractBookingItemCalculator{

    private final double admFee=0.2;

    public double getBookingClassRateOption(BookingOptions bookingOption) {
      switch (bookingOption){
          case ECONOMY_CLASS : return 0.8;
          case BUSINESS_CLASS: return 0.75;
          case FIRST_CLASS:return 0.7;
          default:
              System.err.println("Booking option unvalid");
              return 1;
      }
    }
    public double getAdmFee() {
        return admFee;
    }
}
