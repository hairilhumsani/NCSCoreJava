package p1;

/*Maximum 100 tickets can be sold*/
public class OutofTicketException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String getMsg()
	{
		return "Ticket are above 100. Unable to proceed";
	}

}
