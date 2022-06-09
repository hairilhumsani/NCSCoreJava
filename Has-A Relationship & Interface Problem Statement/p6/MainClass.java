package p6;

import java.util.Scanner;

public class MainClass implements FlightService {

	static Database database = new Database();
	static Scanner sc = new Scanner(System.in);
	static Scanner scString = new Scanner(System.in);

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();

		while (true) {

			System.out.println("\n\n ---------------------------\n");
			System.out.println("Enter Option: ");
			System.out.println("1. Get All Flight Names");
			System.out.println("2. Get Flight Between Airport");
			System.out.println("3. Get Passengers information");
			System.out.println("Enter Option: ");
			System.out.println("Enter Option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				String[] allNames = mainClass.getAllFlightNames(database.dataFlights());
				for (String names : allNames) {
					System.out.println(names);
				}
				break;
			}
			case 2: {
				System.out.println("Enter source Airport");
				String scr = scString.nextLine();
				System.out.println("Enter destination Airport");
				String des = scString.nextLine();

				Flight[] f = mainClass.getFlightsBetweenAirports(scr, des);
				for (Flight ff : f) {
					if (ff != null) {
						System.out.println(ff.getFlightName());
					} else {
						System.out.println("");
					}

				}
				break;
			}
			case 3: {
				System.out.println("Enter Flight Name");
				String flightName = scString.nextLine();
				System.out.println("Passenger Info:");
				for (Flight f : database.dataFlights()) {
					if (f.getFlightName().contains(flightName)) {
						System.out.println("Flight " + f.getFlightName() + " Heading from " + f.getSourceAirport()
								+ " towards " + f.getDestinationAirport());
						Passenger[] p = mainClass.getPassengersInfo(f);
						for (Passenger pp : p) {
							System.out.println(
									"Name: " + pp.getName() + " Age: " + pp.getAge() + " Gender: " + pp.getGender());
						}
						break;
					}

				}

				break;
			}
			case 4: {
				System.out.println("Enter Flight Name");
				String flightName = scString.nextLine();
				System.out.println("Female Passenger Count");
				int i = 0;
				for (Flight f : database.dataFlights()) {
					if (f.getFlightName().contains(flightName)) {
						i = mainClass.getTotalFemalePassengersCount(f);
						break;
					}
				}

				System.out.println("");
			}
			}
		}

	}

	@Override
	public String[] getAllFlightNames(Flight[] flight) {

		String[] response = new String[flight.length];
		int pos = 0;
		for (Flight f : flight) {
			response[pos++] = f.getFlightName();
		}

		// TODO Auto-generated method stub
		return response;
	}

	@Override
	public Flight[] getFlightsBetweenAirports(String srcAirport, String destinationAirport) {
		Flight[] flights = new Flight[database.dataFlights().length];
		int pos = 0;
		for (Flight f : database.dataFlights()) {
			if (f.getSourceAirport().equals(srcAirport) && f.getDestinationAirport().equals(destinationAirport)) {
				flights[pos++] = f;
			}
		}
		return flights;
	}

	@Override
	public Passenger[] getPassengersInfo(Flight flight) {
		return flight.getPassengers();
	}

	@Override
	public int getTotalPassengersCount(Flight flight) {
		return flight.getPassengers().length;
	}

	@Override
	public int getAveragePassengerAge(Flight flight) {
		int totalAge = 0;
		int average = 0;
		for (Passenger p : flight.getPassengers()) {
			totalAge = totalAge + p.getAge();
		}

		average = totalAge / flight.getPassengers().length;
		return average;
	}

	@Override
	public int getTotalFemalePassengersCount(Flight flight) {
		int count = 0;
		for (Passenger p : flight.getPassengers()) {
			if (p.getGender().contains("Female"))
				;
			{
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public int getTotalMalePassengersCount(Flight flight) {
		int count = 0;
		for (Passenger p : flight.getPassengers()) {
			if (p.getGender().contains("male")) {
				count++;
			}
		}
		return count;
	}
}
