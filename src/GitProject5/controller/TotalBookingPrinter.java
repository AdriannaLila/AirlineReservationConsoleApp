package GitProject5.controller;

import GitProject5.model.booking.BookingItem;
import GitProject5.model.booking.TotalBooking;
import GitProject5.model.ticket.Airline;
import GitProject5.model.ticket.Passenger;

import java.util.ArrayList;

public class TotalBookingPrinter {
    public void printBookingInfo(TotalBooking totalBooking, Airline airline, Passenger passenger, BookingItemAmount bookingItemAmount, double admFee) {
        System.out.println("-----------------------------------------------------------------------------");
        passenger.setAge(21);
        System.out.println("PASSENGER: " + passenger.getSurname() + " " + passenger.getName() + " | " + passenger.getAge() + " yrs" + " | " + passenger.getPassId());
        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<BookingItem> bookingItems = totalBooking.getBookingItems();
        for (BookingItem bookingItem : bookingItems) {
            double totalBookingItemPayment = bookingItem.getBookingItemPrice()*bookingItem.getQuantity();
            System.out.println(bookingItem.getQuantity() + "x "+ bookingItem.getFlightTicket().setTicketConfirmationNumber(6) + " | " + bookingItem.getBookingItemPrice() + " Euro| " +totalBookingItemPayment + " Euro");
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Total booking payment: " + bookingItemAmount.getTotalBookingItemAmount() + " Euro.");

     int admFeeASPercentage=(int)admFee;
        System.out.println("Administration fee: " + admFeeASPercentage+ " % "+ "--> "+bookingItemAmount.getTotalBookingAmountAdmFee() + " Euro");
        System.out.println("Total booking payment with administration fee: "+ bookingItemAmount.getTotalBookingAmountWithAdmFee()+ " Euro");
        System.out.println("THANK YOU!" + "\n" + airline.getName().toUpperCase());
        System.out.println("-----------------------------------------------------------------------------");
    }
}
