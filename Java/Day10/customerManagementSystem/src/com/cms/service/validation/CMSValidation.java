package com.cms.service.validation;

import java.time.LocalDate;

import com.cms.Exception.CMSException;
import com.cms.core.Customer;
import com.cms.core.ServicePlan;

public class CMSValidation {
	
	public static Customer validateAll(String fisrtName,String lastName,String email,
			String passWord,int regAmount,String dob,String plan , Customer[] customers) throws CMSException {
		
		checkForEmail(email,customers);
		return new Customer(fisrtName,lastName,email,passWord,
					regAmount,LocalDate.parse(dob) ,ServicePlan.valueOf(plan));
		
	}

	private static void checkForEmail(String email, Customer[] customers) throws CMSException {
		Customer newCust=new Customer(email);
		for(Customer c:customers) {
			if(c!=null) {
				if(c.equals(newCust))
				throw new CMSException("Duplicate Email...");
			}
		}
		
		
	}
	

}
