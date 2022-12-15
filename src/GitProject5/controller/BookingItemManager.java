package GitProject5.controller;

import GitProject5.model.booking.BookingItem;
import GitProject5.model.booking.BookingOptions;
import GitProject5.model.booking.TotalBooking;
import GitProject5.model.ticket.FlightTicket;
import GitProject5.model.ticket.TicketsBooked;

public class BookingItemManager {
    TotalBooking [] bookingsArray=new TotalBooking[6];

    public TotalBooking generateBooking(TicketsBooked ticketsBooked){
        TotalBooking totalBooking=new TotalBooking();
        addBookingItem(totalBooking,ticketsBooked.getBookedTickets().get(1),BookingOptions.ECONOMY_CLASS,3);
        addBookingItem(totalBooking,ticketsBooked.getBookedTickets().get(3),BookingOptions.BUSINESS_CLASS,2);
        addBookingItem(totalBooking,ticketsBooked.getBookedTickets().get(6),BookingOptions.FIRST_CLASS,1);
    return totalBooking;

    }

    private void addBookingItem(TotalBooking totalBooking, FlightTicket flightTicket, BookingOptions bookingOptions,int quantity) {
        BookingItem bookingItem=new BookingItem(flightTicket,bookingOptions,quantity);
        totalBooking.getBookingItems().add(bookingItem);
    }
}
