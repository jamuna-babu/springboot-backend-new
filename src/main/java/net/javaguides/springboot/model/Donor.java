
package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Donor")
public class Donor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;


	
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "product_type")
	private String productType;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "verified")
	private String verifiedd;
	
	
	
	public Donor() {
		
	}
	
	public Donor(String firstName, String lastName,String emailId,String productType,String productName,String verified_1) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.productType = productType;
		this.productName = productName;
		this.verifiedd = verifiedd;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getproductType() {
		return productType;
	}
	public void setproductType(String productType) {
		this.productType = productType;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public String getverifiedd() {
		return verifiedd;
	}
	public void setverified_(String verified_1) {
		this.verifiedd = verifiedd;
	}
	
}

