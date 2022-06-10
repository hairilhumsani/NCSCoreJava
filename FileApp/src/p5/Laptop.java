package p5;

import java.io.Serializable;

public class Laptop implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int laptopNumber;
	
	public Laptop(int laptopNumber) {
		super();
		this.laptopNumber = laptopNumber;
	}

	public int getLaptopNumber() {
		return laptopNumber;
	}

	public void setLaptopNumber(int laptopNumber) {
		this.laptopNumber = laptopNumber;
	}

	@Override
	public String toString() {
		return "Laptop [laptopNumber=" + laptopNumber + "]";
	}

	
	
	

}
