
package com.cms.validation;

import java.time.LocalDate;
import java.util.List;

import com.cms.Exception.CMSException;
import com.cms.core.Customer;
import com.cms.core.ServicePlan;

public class CMSValidation {

	public static Customer validateInput(String fisrtName,String lastName,String email,
			String passWord,int regAmount,String dob,String plan,List<Customer> customers) throws CMSException{

		validateEmail(email,customers);
		ServicePlan servicePlan=validatePlan(plan,regAmount);
		LocalDate lDate=LocalDate.parse(plan);

		return new Customer( fisrtName, lastName, email,
				passWord, regAmount,lDate, servicePlan);
	}


	
	private static void validateEmail(String email,List<Customer> customers) throws CMSException{

		String Vemail="^[a-z][a-z0-9._-]*@[a-z]+\\\\.(com|org|net)$";
		if(email.matches(Vemail)) {
			Customer cust=new Customer(email);
			if(customers.contains(cust))
				throw new CMSException("Duplicate Email...");
		}else {
			throw new CMSException("Invalid Email...");
		}

	}
	
	
	private static ServicePlan validatePlan(String plan, int regAmount) throws IllegalArgumentException,
	CMSException{
		ServicePlan servicePlan=ServicePlan.valueOf(plan.toUpperCase());
		if(servicePlan.getPlanCost()!=regAmount) {
			throw new CMSException("Plan Does Not Exist For This Cost...");
		}
		return servicePlan;
	}

}
