package com.cms.service;

import com.cms.Exception.CMSException;
import com.cms.core.Customer;

public interface CMSService {
	String registerCustomer(String fisrtName,String lastName,String email,
			String passWord,int regAmount,String dob,String plan) throws CMSException;

	void displayCustomerDetail();

	Customer signIn(String email, String password) throws CMSException;

	String changePassword(String email, String oldPassword, String newPass) throws CMSException;

	String unsubscribeCustomer(String next) throws CMSException;

	void searchByPlanAndDate(String plan, String date);

	void sortCustomersByEmail();

}
