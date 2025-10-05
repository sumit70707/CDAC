package com.hdfc.service;

import com.hdfc.ExeptionHandling.BankException;
import com.hdfc.core.AccountType;

public interface BankingService {
	
	public String openSavingAccount(int actNum , double balance , String custName , String phoneNum,AccountType actType) throws BankException;
	public String openCurrentAccount(int actNum , double balance , String custName , String phoneNum,AccountType actType)throws BankException;

}
