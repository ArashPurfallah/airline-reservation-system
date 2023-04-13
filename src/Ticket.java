import java.util.HashMap;

public class Ticket {
    private int ticketId;
    private String passengerUserName;
    private String flightId;
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassengerUserName() {
        return passengerUserName;
    }

    public void setPassengerUserName(String passengerUserName) {
        this.passengerUserName = passengerUserName;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
}
