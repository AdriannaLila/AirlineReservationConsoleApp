package GitProject5.controller;
import GitProject5.model.ticket.FlightTicket;
import GitProject5.model.ticket.TicketsBooked;

import java.security.KeyStore;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BookedTicketsPrinter {
    public void printBookedTickets(TicketsBooked ticketsBooked){
System.out.println("-----------------------------------------------------------BOOKED TICKETS---------------------------------------------------------------------");
System.out.println("-----------------------------------------------------------STAND: " + LocalDate.now() + " -----------------------------------------------------------------");

        HashMap<Integer, FlightTicket> bookingItems=ticketsBooked.getBookedTickets();

        for(Map.Entry<Integer,FlightTicket> ticketEntry : bookingItems.entrySet()){
            FlightTicket bookingItem=ticketEntry.getValue();
            System.out.println(bookingItem.setTicketConfirmationNumber(6) + " | " + bookingItem.getPrice() + " Euro" + " | "+ bookingItem.getStatus());

        }

    }
}
