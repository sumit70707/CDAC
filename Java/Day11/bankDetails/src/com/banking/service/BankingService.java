package com.banking.service;

import com.banking.core.BankAccount;
import com.banking.custom_exceptions.BankingException;

public interface BankingService {
	String openAccount(int accountNumber, double balance, String customerName, String phoneNumber, String acType,
			String dob, double rateOrLimit) throws BankingException;
	BankAccount getSummary(int accountNo) throws BankingException;
	void withdraw(int accountNo, double amount) throws BankingException;
	void deposit(int accountNo, double amount) throws BankingException;

}
