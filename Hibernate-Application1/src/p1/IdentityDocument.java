package p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IdentityDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recordId;
	private String documentType;
	private String documentNumber;
	public IdentityDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IdentityDocument(int recordId, String documentType, String documentNumber) {
		super();
		this.recordId = recordId;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}
	public IdentityDocument(String documentType, String documentNumber) {
		super();
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	
	
}
