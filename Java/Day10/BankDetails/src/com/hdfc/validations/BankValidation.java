package com.hdfc.validations;

import com.hdfc.ExeptionHandling.BankException;
import com.hdfc.core.BankAccount;

public class BankValidation {
	
	public static BankAccount validateAllInputs(int actNum , double balance , String custName , 
			String phoneNum,BankAccount[] accounts) throws BankException{
		checkForDuplicate(actNum, accounts);
		return new BankAccount(actNum, balance, custName, 
				phoneNum);
	}

	private static void checkForDuplicate(int actNum, BankAccount[] accounts) throws BankException {

		BankAccount actNew=new BankAccount(actNum);
		for (BankAccount act : accounts)
			if (act!= null) {
				if (act.equals(accounts)) {
					throw new BankException("Account Number is dup !!!!!!");
				}
			}
		
	}

}
