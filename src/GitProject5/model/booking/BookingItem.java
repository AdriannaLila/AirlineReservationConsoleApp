package GitProject5.model.booking;

import GitProject5.model.ticket.FlightTicket;

public class BookingItem {
    private FlightTicket flightTicket;
    private BookingOptions bookingOption;
    private int quantity;
    private double bookingItemPrice;

    public BookingItem(FlightTicket flightTicket, BookingOptions bookingOption, int quantity) {
        this.flightTicket = flightTicket;
        this.bookingOption= bookingOption;
        this.quantity = quantity;
    }

    public FlightTicket getFlightTicket() {
        return flightTicket;
    }

    public void setFlightTicket(FlightTicket flightTicket) {
        this.flightTicket = flightTicket;
    }

    public BookingOptions getBookingOption() {
        return bookingOption;
    }

    public void setBookingOption(BookingOptions bookingOption) {
        this.bookingOption = bookingOption;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBookingItemPrice() {
        return bookingItemPrice;
    }

    public void setBookingItemPrice(double bookingItemPrice) {
        this.bookingItemPrice = bookingItemPrice;
    }
}
