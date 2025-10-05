package com.cms.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
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
	
	@Override
	public int compareTo(Customer anotherCustomer) {
		
		System.out.println("in compreTo");
		return this.email.compareTo(anotherCustomer.email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(int regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

}
