package com.cms.core;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String passWord;
	private int regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	private static int idCounter=17501;
	
	/**
	 * 
	 */
	public Customer(String fisrtName,String lastName,String email,
			String passWord,int regAmount,LocalDate dob,ServicePlan plan){
		this.id=++idCounter;
		this.firstName=fisrtName;
		this.lastName=lastName;
		this.email=email;
		this.passWord=passWord;
		this.regAmount=regAmount;
		this.dob=dob;
		this.plan=plan;
	}
	
	//to check email duplicate we have to take email only field
	public Customer(String email){
		this.email=email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			//Customer c=Customer(obj);
			return this.email.equals(((Customer)obj).email);
		}
		return false;
	}
	
	

}
