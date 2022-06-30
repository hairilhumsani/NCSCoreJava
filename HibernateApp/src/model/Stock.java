package model;

import javax.persistence.Entity;

@Entity
public class Stock {

	
	private int stockQuantity;
	private int stockPrice;
	private String company;
	
	
	public int getStockComp() {
		return stockQuantity;
	}
	public void setStockComp(int stockComp) {
		this.stockQuantity = stockComp;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Stock(int stockQuantity, int stockPrice, String company) {
		super();
		this.stockQuantity = stockQuantity;
		this.stockPrice = stockPrice;
		this.company = company;
	}
	
	
	
	
	
	
	
	
	
	
	
}
