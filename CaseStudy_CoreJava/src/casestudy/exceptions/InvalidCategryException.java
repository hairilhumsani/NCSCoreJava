package casestudy.exceptions;

public class InvalidCategryException extends Exception {
	
	public String getMsgForInvalidCategory()
	{
		return "Invalid Category";
	}
	
	public String getMsgForInvalidDeliverable()
	{
		return "Item has not delivered";
	}
}
