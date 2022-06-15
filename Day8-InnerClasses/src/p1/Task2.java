package p1;

interface Wifi {
	public boolean doConnect(String fileName);
}

class Laptop implements Wifi {

	@Override
	public boolean doConnect(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Connecting");
		return !fileName.isBlank();
	}

}

public class Task2 {

	public static void main(String[] args) {

		Task2 app = new Task2();
		Wifi w = new Laptop();
		app.letsConnect(w);
		
		new Task2().letsConnect((wifiName) -> {
			return true;
			
		});
		

	}
public void letsConnect(Wifi wifi) {
		Boolean connect = wifi.doConnect("Connected");

		if (connect) {
			System.out.println("Connected");
		}

	}

}
