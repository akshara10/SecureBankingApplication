package com.example.SecureBankingApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer extends User {

	public enum CustomerType{
		Individual,Merchant
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="custid")
	private int cust_id;
	

	@Column(name="accountno")
	private String accountNo;
	
	@Column(name="customertype")
	private CustomerType type;
	
		
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}	
	
	
	

}
