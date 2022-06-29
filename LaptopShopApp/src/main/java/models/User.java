package models;

import java.util.List;

public class User {
	
	private String username;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	private List<Product> purchasedProducts;
	
	
	public User(String username, String password, String securityQuestion, String securityAnswer,
			List<Product> purchasedProducts) {
		super();
		this.username = username;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.purchasedProducts = purchasedProducts;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	public List<Product> getPurchasedProducts() {
		return purchasedProducts;
	}
	public void setPurchasedProducts(List<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + ", purchasedProducts=" + purchasedProducts + "]";
	}
	
	

}
