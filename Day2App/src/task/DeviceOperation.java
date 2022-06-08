package task;

public class DeviceOperation {

	Device arr[] = new Device[1000];
	int count = 0;

	public Device addDevice(Device a) {
		if (a.getModelNumber() != "") {
			arr[count++] = a;
			return a;
		} else {
			return null;
		}
	}

	public Device[] getAllDevices() {
		return arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String searchDeviceByModel(String modelNumber) {
		String response = "Error";
		for (int i = 0; i < count; i++) {
			if (arr[i].getModelNumber().contains(modelNumber)) {
				System.out.println(arr[i].getModelNumber());
				response = arr[i].showDevices();
			}
		}
		return response;
	}
	
	public void deviceByRange(int min, int max)
	{
		for (int i =0; i< count; i++)
		{
			if(min < arr[i].getCost() && arr[i].getCost() < max)
			{
				System.out.println(arr[i].getDeviceName());
			}
			
		}
	}

}
