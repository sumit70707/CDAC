package com.hdfc.service.impl;

import com.hdfc.ExeptionHandling.BankException;
import com.hdfc.core.AccountType;
import com.hdfc.core.BankAccount;
import com.hdfc.service.BankingService;

public class BankingServiceImpl implements BankingService{
	
	private BankAccount [] accounts;
	private int counter;
	
	
	public BankingServiceImpl(int size) {
		this.accounts=new BankAccount[size];
	}

	@Override
	public String openSavingAccount(int actNum, double balance, String custName, String phoneNum, AccountType actType)
			throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String openCurrentAccount(int actNum, double balance, String custName, String phoneNum, AccountType actType)
			throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
