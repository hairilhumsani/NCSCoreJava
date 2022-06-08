package task;

public class Device {

	private String deviceName;
	private String modelNumber; // as Id , should be auto-generated combination of char or numbers (6 chars)
	// such as abc123 , xyz343, bjb543
	private int cost;
	private int avgRating;
	private String brandName;
	
	public Device()
	{
		
	};

	public Device(String deviceName, int cost, int avgRating, String brandName,String modelNumber) {
		this.setDeviceName(deviceName);
		this.setCost(cost);
		this.setAvgRating(avgRating);
		this.setBrandName(brandName);
		this.setModelNumber(modelNumber);
	}
	

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getModelNumber() {
		return modelNumber;
	}
	
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	
	public String showDevices()
	{
		return "Device -"+deviceName+" , "+brandName+" , $"+cost+" , "+avgRating + " , " + modelNumber;
	}
	

}// end class
