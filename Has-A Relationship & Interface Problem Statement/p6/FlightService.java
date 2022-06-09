package p6;

public interface FlightService {

	public String[] getAllFlightNames(Flight[] flight);
	public Flight[] getFlightsBetweenAirports(String srcAirport,String destinationAirport);
	public Passenger[] getPassengersInfo(Flight flight);
	public int getTotalPassengersCount(Flight flight);
	public int getAveragePassengerAge(Flight flight);
	public int getTotalFemalePassengersCount(Flight flight);
	public int getTotalMalePassengersCount(Flight flight);
	
	
	
	
}
