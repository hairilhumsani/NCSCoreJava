package models;

public class Product {
	
	
	private String laptopBrand;
	private String laptopName;
	private String processor;
	private int price;
	private String typeOfStorage;
	private int ramSize;
	
	
	
	public Product(String laptopBrand, String laptopName, String processor, int price, String typeOfStorage, int ramSize) {
		super();
		this.laptopBrand = laptopBrand;
		this.laptopName = laptopName;
		this.processor = processor;
		this.price = price;
		this.typeOfStorage = typeOfStorage;
		this.ramSize = ramSize;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTypeOfStorage() {
		return typeOfStorage;
	}
	public void setTypeOfStorage(String typeOfStorage) {
		this.typeOfStorage = typeOfStorage;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRam(int ramSize) {
		this.ramSize = ramSize;
	}
	
	@Override
	public String toString() {
		return "Product [laptopBrand=" + laptopBrand + ", laptopName=" + laptopName + ", processor=" + processor
				+ ", price=" + price + ", typeOfStorage=" + typeOfStorage + ", ramSize=" + ramSize + "]";
	}
}
