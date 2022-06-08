package task;

import java.util.Scanner;

public class MyDeviceMVCApp extends RandomUtils {
	
	Scanner sc = new Scanner(System.in);
	Scanner stringScanner = new Scanner(System.in);
	
	DeviceOperation devOps = new DeviceOperation();
	
	public static void main(String[] args) {
		MyDeviceMVCApp app = new MyDeviceMVCApp();
		
		while(true)
		{
			System.out.println("\n\n ------------------------\n");
			System.out.println("1. Add Device");
			System.out.println("2. Search Device");
			System.out.println("3. Display All Device");
			System.out.println("4. Display device by Price Range");
			System.out.println("0. Exit");
			
			
			
			System.out.println("Enter User Choice :- ");
			
			int choice = app.sc.nextInt();
			
			switch (choice)
			{
			case 1:
				app.addDevice();
				break;
				
			case 2:
				app.searchModel();
				break;
				
			case 3:
				app.displayAllDevice();
				break;
				
			case 4:
				app.displayDeviceByPriceRange();
				break;
				
			default:
				break;
			}
		}
	}
	
	public void addDevice()
	{
		System.out.println("Enter device name: ");
		String deviceName = stringScanner.nextLine();
		
		System.out.println("Enter Brand Name of the Device");
		String brandName = stringScanner.nextLine();
		
 		System.out.println("Enter Price of the Device");
 		int price = sc.nextInt();
 		
 		System.out.println("Enter average rating");
 		int avgRate = sc.nextInt();
 		
 		Device a = new Device();
 		
 		a.setDeviceName(deviceName);
 		a.setCost(price);
 		a.setBrandName(brandName);
 		a.setAvgRating(avgRate);
 		a.setModelNumber(super.getAlphaNumericString(6));
 		
 		Device savedObject = devOps.addDevice(a);
 		if(savedObject == null)
		{
			System.out.println("Contact to Customer Care ...");
		}
		else
		{
			System.out.println("Device Added ");
		}
		
	}
	
	public void searchModel()
	{
		System.out.println("Enter model number: ");
		String modelName = stringScanner.nextLine();
		String response = devOps.searchDeviceByModel(modelName);
		System.out.println(response);
		
	};

	public void displayAllDevice()
	{
		Device arr[] = devOps.getAllDevices();
		int count = devOps.getCount();
		
		for(int i = 0; i < count; i++)
		{
			System.out.println(arr[i].showDevices());
		}
	};
	
	public void displayDeviceByPriceRange()
	{
		System.out.println("Enter min range price");
		int min = sc.nextInt();
		System.out.println("Enter max range price");
		int max = sc.nextInt();
		
		devOps.deviceByRange(min, max);
	}

}
