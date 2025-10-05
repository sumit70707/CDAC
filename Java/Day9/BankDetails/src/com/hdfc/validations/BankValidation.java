package com.hdfc.validations;

import com.hdfc.ExeptionHandling.AccountException;
import com.hdfc.developer.BankAccount;

public class BankValidation {
	
	public static BankAccount validateAllInputs(int actNum , double balance , String custName , 
			String phoneNum,BankAccount[] accounts) throws AccountException{
		checkForDuplicate(actNum, accounts);
		return new BankAccount(actNum, balance, custName, 
				phoneNum);
	}

	private static void checkForDuplicate(int actNum, BankAccount[] accounts) throws AccountException {

		BankAccount actNew=new BankAccount(actNum);
		for (BankAccount act : accounts)
			if (act!= null) {
				if (act.equals(accounts)) {
					throw new AccountException("Account Number is dup !!!!!!");
				}
			}
		
	}

}
