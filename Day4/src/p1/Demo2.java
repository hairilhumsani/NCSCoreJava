package p1;

class TicketBookingService
{
	
	public boolean bookTicket(int number)throws BookingException
	{
		boolean status = false;
		if(number>10)
		{
			throw new BookingException();
		}
		else
		{
			// code to book the tickets
			System.out.println(number+" Tickets booked !!!");
			status = true;
		}
		
		return status;
	}

}
class BookingException extends Exception
{
	/*only avilable inside booking exception not, not available in Super class Exception*/
	public String getBookingIssue()
	{
		return "Out of Booking Limit Exception ";
	}
}
public class Demo2 {
	
	public static void main(String[] args) {

		boolean bookingStatus = false;
		TicketBookingService service = new TicketBookingService();
		try
		{
			bookingStatus = service.bookTicket(80);
		}
		catch(Exception e)
		{
			BookingException abc = (BookingException)e;
			System.out.println(abc.getBookingIssue());
			// System.out.println(e.getBookingIssue()); // gives compile time error bcoz of above reason
		}
		
		System.out.println(bookingStatus);
		
	}

}











