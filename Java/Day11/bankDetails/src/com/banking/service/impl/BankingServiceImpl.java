package com.banking.service.impl;

import static com.banking.validation.BankValidation.validateAllInput;

import java.util.ArrayList;
import java.util.List;

import com.banking.core.BankAccount;
import com.banking.custom_exceptions.BankingException;
import com.banking.service.BankingService;;

public class BankingServiceImpl implements BankingService {

	List<BankAccount> list=new ArrayList<>();

	@Override
	public String openAccount(int accountNumber, double balance, String customerName, String phoneNumber, String acType,
			String dob, double rateOrLimit) throws BankingException {

		BankAccount act=validateAllInput( accountNumber, balance, customerName, phoneNumber, acType,
				dob,rateOrLimit,list);
		list.add(act);

		return ""+acType.toUpperCase()+" Account Created...";
	}

	@Override
	public BankAccount getSummary(int accountNo) throws BankingException {

		BankAccount act=new BankAccount(accountNo);
		if(list.contains(act)) {
			int idx=list.indexOf(act);
			return list.get(idx);//get method internally implement equals method

		}

		throw new BankingException("Account Number Not Found..");
	}

	@Override
	public void withdraw(int accountNo, double amount) throws BankingException {

		BankAccount act=new BankAccount(accountNo);
		if(list.contains(act)) {
			int idx=list.indexOf(act);
			list.get(idx).withdraw(amount);;

		}

	}

	@Override
	public void deposit(int accountNo, double amount) throws BankingException {
		BankAccount act=new BankAccount(accountNo);
		if(list.contains(act)) {
			int idx=list.indexOf(act);
			list.get(idx).deposit(amount);

		}

	}

}
