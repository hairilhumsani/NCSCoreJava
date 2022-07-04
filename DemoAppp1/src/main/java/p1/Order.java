package p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	@Value("${product.name")
	private String productName;
	
	@Autowired
	@Qualifier("cashPayment")
	private Payment modeOfPayment;
	
	@Value("${order.grossValue}")
	private int grossOrderAmount;
	
	
	private int finalOrderAmount;
	
	
	
	public Order()
	{
		
	}
	
	
	
	public Order(int finalOrderAmount) {
		super();
		this.finalOrderAmount = finalOrderAmount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Payment getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(Payment modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public int getGrossOrderAmount() {
		return grossOrderAmount;
	}
	public void setGrossOrderAmount(int grossOrderAmount) {
		this.grossOrderAmount = grossOrderAmount;
	}
	public int getFinalOrderAmount() {
		return finalOrderAmount;
	}
	public void setFinalOrderAmount(int finalOrderAmount) {
		this.finalOrderAmount = finalOrderAmount;
	}
	
	
	@Override
	public String toString() {
		return "Order [productName=" + productName + ", modeOfPayment=" + modeOfPayment + ", grossOrderAmount="
				+ grossOrderAmount + ", finalOrderAmount=" + finalOrderAmount + "]";
	}
	
	
	
	
	
	
	
	
	

}
