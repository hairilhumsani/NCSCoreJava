package p1;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="NCSProduct")
public class Product implements Comparable<Product>, Serializable {

	private static final long serialVersionUID = -4698168225399980281L;

	
	@Column
	@Id
	private int productId;
	
	@Column
	private String productName;
	
	@Column
	private int price;
	
	@Column
	private float rating;
	
	@Column
	private String category;
	
	

	public Product(int productId, String productName, int price, float rating, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.rating = rating;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, price, productId, productName, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && price == other.price && productId == other.productId
				&& Objects.equals(productName, other.productName)
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating);
	}

}
