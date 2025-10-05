package com.cms.service.impl;

import com.cms.Exception.CMSException;
import com.cms.core.Customer;
import com.cms.service.CMSService;
import com.cms.service.validation.CMSValidation;

public class CMSServiceImpl implements CMSService{
	
	private Customer[] customers;
	private int counter;
	
	public CMSServiceImpl(int size) {
		this.customers=new Customer[size];
	}	

	@Override
	public String registerCustomer(String fisrtName, String lastName, String email, String passWord, int regAmount,
			String dob, String plan) throws CMSException {
		
		Customer c=CMSValidation.validateAll(fisrtName, lastName, email, passWord, regAmount, dob, plan,customers);
		customers[counter++]=c;
		
		return "Registration Successfull";
	}

	@Override
	public void displayCustomerDetail() {
		for(Customer c:customers) {
			if(c!=null)
				System.out.println(c);
		}
		
	}

}
