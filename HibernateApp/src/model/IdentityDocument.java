package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IdentityDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recordId;
	private String documentName;
	private int documentNumber;
	private int AccountNumber;

	public IdentityDocument(String documentName, int documentNumber, int accountNumber) {
		super();
		this.documentName = documentName;
		this.documentNumber = documentNumber;
		AccountNumber = accountNumber;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

}
