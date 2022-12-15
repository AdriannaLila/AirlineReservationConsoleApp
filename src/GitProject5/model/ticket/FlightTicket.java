package GitProject5.model.ticket;

public class FlightTicket {
    private static String ticketConfirmationNumber;
    private double price;

    private static final String status="confirmed";

    public static String getStatus() {
        return status;
    }

    public FlightTicket(String ticketConfirmationNumber, double price, String status) {
        this.ticketConfirmationNumber = ticketConfirmationNumber;
        this.price = price;
    }

    public static String setTicketConfirmationNumber(int maxLengthOfConfirmationNumber) {

        String possibleChoice= "ABCDEFGHIJKLMNOPQRSTXHUVZYÜÖÄ0123456789";
        char [] confNum= new char[maxLengthOfConfirmationNumber];
        for(int i=0; i<maxLengthOfConfirmationNumber;i++){
            int randomIndex= (int) (Math.random()*possibleChoice.length());
            confNum [i]=possibleChoice.charAt(randomIndex);
        }
        return new String(confNum);
    }

    public double getPrice() {
        return price;
    }
}

