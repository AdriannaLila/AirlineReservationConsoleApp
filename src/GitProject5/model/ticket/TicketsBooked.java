package GitProject5.model.ticket;

import java.util.HashMap;

public class TicketsBooked {

    private HashMap<Integer,FlightTicket>bookedTickets=new HashMap<>();

    public TicketsBooked(){
        initializeTickets();
    }

    private void initializeTickets() {

        bookedTickets.put(1,new FlightTicket(FlightTicket.setTicketConfirmationNumber(6),50.0,FlightTicket.getStatus()));
        bookedTickets.put(2,new FlightTicket(FlightTicket.setTicketConfirmationNumber(4),78.98,FlightTicket.getStatus()));
        bookedTickets.put(3,new FlightTicket(FlightTicket.setTicketConfirmationNumber(5),100.25,FlightTicket.getStatus()));
        bookedTickets.put(4,new FlightTicket(FlightTicket.setTicketConfirmationNumber(6),47.0,FlightTicket.getStatus()));
        bookedTickets.put(5,new FlightTicket(FlightTicket.setTicketConfirmationNumber(7),230.45,FlightTicket.getStatus()));
        bookedTickets.put(6,new FlightTicket(FlightTicket.setTicketConfirmationNumber(6),190.0,FlightTicket.getStatus()));
    }

    public HashMap<Integer,FlightTicket> getBookedTickets(){
        return bookedTickets;
    }

}
