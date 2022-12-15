package GitProject5.controller;

import GitProject5.model.booking.BookingItem;
import GitProject5.model.booking.BookingOptions;
import GitProject5.model.booking.TotalBooking;

public interface IBookingItemCalculator {
    public double calculateTotalBookingItemAmount(TotalBooking totalBooking);
    public double calculateBookingItemPrice(BookingItem bookingItem) ;
    public BookingItemAmount calculateBookingItemAmount(TotalBooking totalBooking);
    public double calculateTotalBookingAmountAdmFee(double totalBookingItemAmount);
    public double getBookingClassRateOption(BookingOptions bookingOption);
    public double getAdmFee(boolean decimal);
}
