package p6;

public class Database {

	public Flight[] dataFlights() {
		Flight flight1 = new Flight();
		flight1.setFlightName("SQ123");
		flight1.setDestinationAirport("Heathrow");
		flight1.setSourceAirport("Singapore");

		Passenger p11 = new Passenger();
		p11.setAge(26);
		p11.setGender("Male");
		p11.setName("Amelio");

		Passenger p12 = new Passenger();
		p12.setAge(27);
		p12.setGender("Female");
		p12.setName("Mary");

		Passenger p13 = new Passenger();
		p13.setAge(25);
		p13.setGender("Female");
		p13.setName("Layme");

		Passenger groupPassenger1[] = new Passenger[3];
		groupPassenger1[0] = p11;
		groupPassenger1[1] = p12;
		groupPassenger1[2] = p13;

		flight1.setPassengers(groupPassenger1);

		Flight flight2 = new Flight();
		flight2.setFlightName("SQ512");
		flight2.setDestinationAirport("London");
		flight2.setSourceAirport("Malaysia");

		Passenger p21 = new Passenger();
		p21.setAge(26);
		p21.setGender("Male");
		p21.setName("Amelio");

		Passenger p22 = new Passenger();
		p22.setAge(27);
		p22.setGender("Female");
		p22.setName("Mary");

		Passenger p23 = new Passenger();
		p23.setAge(25);
		p23.setGender("Female");
		p23.setName("Layme");

		Passenger groupPassenger2[] = new Passenger[3];
		groupPassenger2[0] = p21;
		groupPassenger2[1] = p22;
		groupPassenger2[2] = p23;

		flight2.setPassengers(groupPassenger2);

		Flight flights[] = new Flight[2];
		flights[0] = flight1;
		flights[1] = flight2;

		return flights;

	}
}
