package GitProject5.controller;

import GitProject5.model.booking.BookingItem;
import GitProject5.model.booking.BookingOptions;
import GitProject5.model.booking.TotalBooking;
import GitProject5.model.ticket.FlightTicket;
import java.util.ArrayList;

abstract public class AbstractBookingItemCalculator implements IBookingItemCalculator {

    public double getAdmFee(boolean decimal) {
        if(decimal){
            return getAdmFee();
        }else {
            return getAdmFee()*100;
        }
    }

    public double calculateTotalBookingItemAmount(TotalBooking totalBooking){
        ArrayList<BookingItem>bookingItems=totalBooking.getBookingItems();
        double totalBookingItemAmount=0.0;

        for(BookingItem bookingItem : bookingItems){
            totalBookingItemAmount+=calculateBookingItemPrice(bookingItem);
        }
        return totalBookingItemAmount;
    }

    public double calculateBookingItemPrice(BookingItem bookingItem) {

        double bookingClassOption=getBookingClassRateOption(bookingItem.getBookingOption());
        FlightTicket flightTicket = bookingItem.getFlightTicket();
        double totalBookingItemPrice=flightTicket.getPrice()*bookingClassOption;
        bookingItem.setBookingItemPrice(totalBookingItemPrice);

        return totalBookingItemPrice*bookingItem.getQuantity();
    }

    public double calculateTotalBookingAmountAdmFee(double totalBookingItemAmount){
        return totalBookingItemAmount*19/100;
    }

    public BookingItemAmount calculateBookingItemAmount(TotalBooking totalBooking){
        double totalBookingItemAmount=calculateTotalBookingItemAmount(totalBooking);
        double totalBookingAmountAdmFee=calculateTotalBookingAmountAdmFee(totalBookingItemAmount);
      double totalBookingAmountWithAdmFee=totalBookingItemAmount+totalBookingAmountAdmFee;

      BookingItemAmount bookingItemAmount=new BookingItemAmount(totalBookingItemAmount,totalBookingAmountAdmFee,totalBookingAmountWithAdmFee);
      return bookingItemAmount;
    }

 abstract public double getBookingClassRateOption(BookingOptions bookingOption);
    public abstract  double getAdmFee();
}
