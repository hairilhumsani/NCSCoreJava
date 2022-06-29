package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Authority {
	
	private String authorityType;
	private String validTillDate;
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authority(String authorityType, String validTillDate) {
		super();
		this.authorityType = authorityType;
		this.validTillDate = validTillDate;
	}
	public String getAuthorityType() {
		return authorityType;
	}
	public void setAuthorityType(String authorityType) {
		this.authorityType = authorityType;
	}
	public String getValidTillDate() {
		return validTillDate;
	}
	public void setValidTillDate(String validTillDate) {
		this.validTillDate = validTillDate;
	}

	
}
