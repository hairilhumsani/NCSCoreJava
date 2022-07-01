package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TradingAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tradingId;
	private String typeOfTrading;
	private int fund;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tradingId")
	Set<Stock> allStock;
	
	public TradingAccount()
	{
		
	}
	
	public TradingAccount(String typeOfTrading, int fund) {
		super();
		this.typeOfTrading = typeOfTrading;
		this.fund = fund;
	}
	public int getTradingId() {
		return tradingId;
	}
	public void setTradingId(int tradingId) {
		this.tradingId = tradingId;
	}
	public String getTypeOfTrading() {
		return typeOfTrading;
	}
	public void setTypeOfTrading(String typeOfTrading) {
		this.typeOfTrading = typeOfTrading;
	}
	public int getFund() {
		return fund;
	}
	public void setFund(int fund) {
		this.fund = fund;
	}
	public Set<Stock> getAllStock() {
		return allStock;
	}
	public void setAllStock(Set<Stock> allStock) {
		this.allStock = allStock;
	}

	@Override
	public String toString() {
		return "TradingAccount [tradingId=" + tradingId + ", typeOfTrading=" + typeOfTrading + ", fund=" + fund
				+ ", allStock=" + allStock + "]";
	}
	
	
	
	
	
	
	
	
	

}
