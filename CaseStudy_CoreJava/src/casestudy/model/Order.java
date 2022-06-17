package casestudy.model;

import java.time.LocalDate;
import java.util.Comparator;

public class Order implements Comparator<Order>{

	private String username;
	private String category;
	private int orderCost;
	LocalDate dateOfOrder;
	private String action;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(int orderCost) {
		this.orderCost = orderCost;
	}
	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public String isAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Order [username=" + username + ", category=" + category + ", orderCost=" + orderCost + ", dateOfOrder="
				+ dateOfOrder + ", action=" + action + "]";
	}
	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		return o1.getOrderCost() - o2.getOrderCost();
	}
	
	
	
	
	
}
