package p5;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Product implements Serializable, Comparable<Product>{

	private static final long serialVersionUID = -4754763954070699906L;
	private List<Review> reviews;
	private int price;
	private LocalDate launchDate;
	private String productName;
	
	
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductName()
	{
		return productName;
	}
	@Override
	public int compareTo(Product o1) {
		return this.price - o1.price;
		// TODO Auto-generated method stub
	}
	@Override
	public String toString() {
		return productName + " [reviews=" + reviews + ", price=" + price + ", launchDate=" + launchDate + "]";
	}
	
	
	
	

}
