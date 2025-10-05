package com.cms.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cms.Exception.CMSException;
import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.service.CMSService;
import com.cms.validation.CMSValidation;

public class CMSServiceImpl implements CMSService{
	
	//private Customer[] customers;
	private List<Customer> customers;
	//private int counter;
	
	public CMSServiceImpl(int size) {
		this.customers=new ArrayList<>(size);
	}	

	@Override
	public String registerCustomer(String fisrtName, String lastName, String email, String passWord, int regAmount,
			String dob, String plan) throws CMSException {
		
		Customer c=CMSValidation.validateInput(fisrtName, lastName, email, passWord, regAmount, dob, plan,customers);
		customers.add(c);
		
		return "Registration Successfull";
	}

	@Override
	public void displayCustomerDetail() {

		for(Customer c:customers) {
			if(c!=null)
				System.out.println(c);
		}
	}

	@Override
	public Customer signIn(String email, String password) throws CMSException {

		Customer c=new Customer(email);

		int indx=customers.indexOf(c);
		if(indx== -1)
			throw new CMSException("Invalid Email...");
		
		Customer completeDetails=customers.get(indx);
		if(!completeDetails.getPassWord().equals(password))
			throw new CMSException("Invalid Password...");

		return completeDetails;
	}

	@Override
	public String changePassword(String email, String oldPassword, String newPass) throws CMSException {
		
		Customer c=new Customer(email);

		int indx=customers.indexOf(c);
		if(indx== -1)
			throw new CMSException("Invalid Email...");
		
		Customer completeDetails=customers.get(indx);
		if(!completeDetails.getPassWord().equals(oldPassword))
			throw new CMSException("Invalid Password...");

		completeDetails.setPassWord(newPass);
		
		return "Hey "+email+" Your Pass Has Been Changed";
	}

	@Override
	public String unsubscribeCustomer(String email) throws CMSException {
		// TODO Auto-generated method stub
		Customer cust=new Customer(email);
		
		if(customers.contains(cust)) {
			customers.remove(cust);
			return ""+email+" Unsubscribed To The Service.";
		}
		throw new CMSException("Email Not Found...");
	}

	@Override
	public void searchByPlanAndDate(String plan, String date) {
		// TODO Auto-generated method stub
		ServicePlan servicePlan=ServicePlan.valueOf(plan);	
		LocalDate localDate=LocalDate.parse(date);
		
		for(Customer c: customers) {
			if(c.getPlan().equals(servicePlan) && c.getDob().isAfter(localDate) ) 
				System.out.println(c.getFirstName()+" "+c.getLastName());
			
		}
		
	}

	@Override
	public void sortCustomersByEmail() {

		Collections.sort(customers);
	}


}
