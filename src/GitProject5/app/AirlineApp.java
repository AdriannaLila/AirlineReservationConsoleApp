package GitProject5.app;

import GitProject5.controller.*;
import GitProject5.model.booking.TotalBooking;
import GitProject5.model.ticket.Airline;
import GitProject5.model.ticket.Location;
import GitProject5.model.ticket.Passenger;
import GitProject5.model.ticket.TicketsBooked;

public class AirlineApp {
    private static Location location;

    public static void main(String[] args) {

        String typeOfArg = args[0];
        String locationGiven = args[1];
        location = LocationManager.getLocation(locationGiven);

        switch (typeOfArg) {
            case "TICKET":
                runReservationProcess();
                break;
            default:
                System.err.println("Invalid argument type");
        }
    }
    private static void runReservationProcess(){

        Airline airline= new Airline("XY");

        Passenger passenger=new Passenger("Annie","Maar","A163007L");

        TicketsBooked ticketsBooked=new TicketsBooked();
        BookedTicketsPrinter bookedTicketsPrinter=new BookedTicketsPrinter();
        bookedTicketsPrinter.printBookedTickets(ticketsBooked);

        BookingItemManager bookingItemManager=new BookingItemManager();

        TotalBooking totalBooking1=bookingItemManager.generateBooking(ticketsBooked);
        TotalBooking totalBooking2=new TotalBooking();
        TotalBooking totalBooking3=new TotalBooking();

        AbstractBookingItemCalculator abstractBookingItemCalculator=getBookingItemCalculator();
        BookingItemAmount bookingItemAmount=abstractBookingItemCalculator.calculateBookingItemAmount(totalBooking1);
        TotalBookingPrinter totalBookingPrinter=new TotalBookingPrinter();
        totalBookingPrinter.printBookingInfo(totalBooking1,airline,passenger,bookingItemAmount,abstractBookingItemCalculator.getAdmFee(false));
    }

    private static AbstractBookingItemCalculator getBookingItemCalculator() {
        switch (location){
            case EU :return new BookingItemCalculatorEU();
            case NONEU: return new BookingItemCalculatorNonEU();
        }
        System.err.println("Invalid location");
        return null;
    }
}
