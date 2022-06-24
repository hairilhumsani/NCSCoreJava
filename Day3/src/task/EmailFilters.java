package task;

public class EmailFilters {

	static String emails[] = {

			"ramesh@gmail.com", "rakesh@outlook.com", "lokesh@linkedin.com", "mahesh@gmail.com", "ganesh@gmail.com",
			"rajesh@outlook.com" };

	public static void main(String[] args) {
		int outlook = 0;
		int linkedin = 0;
		int gmail = 0;
		

		for (String email : emails) {
			email.split("@");

			if (email.endsWith("gmail.com")) {
				gmail++;

			}

			else if (email.endsWith("outlook.com")) {
				outlook++;

			} else if (email.endsWith("linkedin.com")) {
				linkedin++;

			}
		}
		System.out.println("Gmail= " + gmail + " Outlook= " + outlook + " Linkin= " + linkedin);
	};
}
