package p1;

import java.sql.SQLException;

class MyClass {
	// class is responsible for dataase things

	public void getDatafromdatabase(String databaseName) throws SQLException, InvalidDatabaseNameException {
		// lot of code
		if (!(databaseName.startsWith("NCS"))) {
			InvalidDatabaseNameException exp = new InvalidDatabaseNameException(databaseName);
			throw exp; // throw is used to generate the exception
			//System.out.println(databaseName+" Invalid Name");
		} else {
			System.out.println(" database read " + databaseName);
		}

	}
	/*
	 * above method informing in advance about the possible exception during runtime
	 */
}

public class ThrowsDemo {

	public static void main(String[] args) {

		MyClass obj = new MyClass();

		try {
			obj.getDatafromdatabase("NCSabc");
		} catch (SQLException e) {
			System.out.println(e);
		} catch (InvalidDatabaseNameException e) {
			System.out.println(e.getIssue());
		}

	}

}
