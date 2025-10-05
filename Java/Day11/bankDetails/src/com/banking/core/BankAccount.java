package com.banking.core;

import java.time.LocalDate;

import com.banking.custom_exceptions.BankingException;

/*
 * accountNumber (int), balance (double) , customer name (String) 
 * , phone number (String)

 */
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String phoneNumber;
	private AccountType actType;
	private LocalDate date;
	// add account type : enum & dob - customer : LocalDate here

	public BankAccount(int accountNumber, double balance, String customerName, 
			String phoneNumber,AccountType actType,LocalDate date) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.actType=actType;
		this.date=date;
	}

	public BankAccount(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public void withdraw(double amount) throws BankingException {
		if (amount > balance)
			throw new BankingException("Withdraw Failed - Insufficient Funds !!!!");
		balance -= amount;
		System.out.println("Withdrawn  " + amount + ". New balance = " + balance);
	}

	public void deposit(double amount) throws BankingException {
		if (amount <= 0)
			throw new BankingException("Deposit Failed - Invalid deposit amount");
		balance+=amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getActNumber() {
		return accountNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount)
		    return this.accountNumber==((BankAccount)obj).accountNumber;
		return false;
	}

}
