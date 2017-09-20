package com.example.SecureBankingApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	
	public enum EmployeeType{
		Normal, Manager, Admin
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="eid")
	private int eid;
	
	@Column(name="Employee_type")
	private EmployeeType Employee_type;

	public EmployeeType getEmployee_type() {
		return Employee_type;
	}

	public void setEmployee_type(EmployeeType employee_type) {
		Employee_type = employee_type;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	

}
