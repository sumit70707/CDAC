package com.cms.service;

import com.cms.Exception.CMSException;

public interface CMSService {
	public String registerCustomer(String fisrtName,String lastName,String email,
			String passWord,int regAmount,String dob,String plan) throws CMSException;

	public void displayCustomerDetail();

}
