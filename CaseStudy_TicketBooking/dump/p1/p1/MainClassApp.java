package p1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClassApp {

	Ticket tix[] = new Ticket[100];
	Ticket ticket = null;
	int tixCount = 0;
	int seatCount = 0;

	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	static MainClassApp mca = new MainClassApp();

	public static void main(String[] args) {

		while (true)

		{
			System.out.println("\n-------------------------------\n");
			System.out.println("What do you want to do ?");
			System.out.println("1. Buy tickets");
			System.out.println("2. View all records");
			System.out.println("3. View record by Id");
			int choice = mca.sc.nextInt();

			switch (choice) {
			case 1:
				mca.addOneTicket();
				break;
			}
		}

	}

	public void addOneTicket throws TicketCountException() {
		ticket = new Ticket();
		Map<Integer, String> audienceName = new HashMap<>();
		System.out.println("How many persons?");
		int persons = mca.sc.nextInt();
		for (int i = 1; i <= persons; i++) {
			++seatCount;
			System.out.println("Enter Name of Person " + i);
			String name = mca.scString.nextLine();
			audienceName.put(seatCount,name);
		}
		ticket.setAudienceName(audienceName);;
		ticket.setBookingId(tixCount);
		tix[tixCount] = ticket;
		tixCount++;
		
	}

}
