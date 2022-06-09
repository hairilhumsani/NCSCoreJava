package p1;

public class InvalidDatabaseNameException extends Exception 
{
	String wrongDatabaseName;

	public InvalidDatabaseNameException(String name) {
		super();
		this.wrongDatabaseName = name;
	}
	
	public String getIssue()
	{
		return wrongDatabaseName+" name is not valid as per company policy";
	}
	
	
}
