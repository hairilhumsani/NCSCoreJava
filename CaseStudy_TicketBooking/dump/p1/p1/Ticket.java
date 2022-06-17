package p1;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Ticket {
	private int bookingId;
	private int seatBooked; // number of seats to be booked
	
	Map<Integer,String> audienceName; // <seatNumber,AudianceName>
	LocalDate ticketDate;
	
	public Ticket() {
	}
	
	public Ticket(Map<Integer,String> audienceName, LocalDate ticketDate, int seatBooked)
	{
		this.audienceName = audienceName;
		this.ticketDate = ticketDate;
		this.seatBooked = seatBooked;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getSeatBooked() {
		return seatBooked;
	}
	public void setSeatBooked(int seatBooked) {
		this.seatBooked = seatBooked;
	}
	public Map<Integer, String> getAudienceName() {
		return audienceName;
	}
	public void setAudienceName(Map<Integer, String> audienceName) {
		this.audienceName = audienceName;
	}
	public LocalDate getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(LocalDate ticketDate) {
		this.ticketDate = ticketDate;
	}
	
	
	
}
