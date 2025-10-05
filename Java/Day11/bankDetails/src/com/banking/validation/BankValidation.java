package com.banking.validation;

import java.time.LocalDate;
import java.util.List;

import com.banking.core.AccountType;
import com.banking.core.BankAccount;
import com.banking.core.CurrentAccount;
import com.banking.core.SavingAccount;
import com.banking.custom_exceptions.BankingException;

public class BankValidation {
	
	

	
	public static BankAccount validateAllInput(int accountNumber, double balance, String customerName, 
			String phoneNumber,String actType,String date,double rateOrlimit,List<BankAccount> accounts) throws BankingException{
		
		checkAccountNumber(accountNumber,accounts);
		AccountType type=checkAccountType(actType);
		LocalDate birthDate=LocalDate.parse(date);
		if(type.equals(AccountType.SAVING)) {
			
			return new SavingAccount(accountNumber, balance, customerName, phoneNumber, type, birthDate, rateOrlimit);
			
		}else
		{
			return new CurrentAccount(accountNumber, balance, customerName, phoneNumber, type, birthDate, rateOrlimit);
		}
		
	//return new BankAccount(accountNumber,balance,customerName,phoneNumber,type,LocalDate.parse(date));
	}

	public static void checkAccountNumber(int accountNumber,List<BankAccount> accountList) throws BankingException {
		// TODO Auto-generated method stub
		BankAccount ac=new BankAccount(accountNumber);
		if(accountList.contains(ac))
		{
			throw new BankingException("Duplicate Account Number....");
		}
		//System.out.println("Yess");
		
	}
	
	public static AccountType checkAccountType(String actType) throws IllegalArgumentException{
		return AccountType.valueOf(actType.toUpperCase());
		
	}
	
	
}
