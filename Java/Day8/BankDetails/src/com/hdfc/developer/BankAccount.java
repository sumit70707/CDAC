package com.hdfc.developer;

import com.hdfc.ExeptionHandling.AccountException;

public class BankAccount {
	private  int actNum;
	private   double balance;
	private   String custName;
	private   String phoneNum;

	public BankAccount(int actNum , double balance , String custName , String phoneNum){
		this.actNum = actNum ;
		this.balance = balance;
		this.custName = custName;
		this.phoneNum = phoneNum;
	}

	BankAccount(){}// check this
	public  void deposit(double amount) {

		this.balance += amount;
		System.out.println("Amount Added to Your Account :"+amount+
				"\n Current Balance :"+this.balance);
	}

	public String withdraw(int actNum,double amount) throws AccountException
	{
		//		if(this.balance > amount) {
		//			if(this.balance - amount<=500) {
		//				return "Can't Process The Transaction Amount<500";
		//			}
		//			this.balance -= amount;
		//			return "amount withdraw:"+amount+" Remaining Balance:"+balance;
		//		}
		return "Withdraw From BankAccount";
	}

	public String getAccountSummary(){
        return "Customer Account Number: " + actNum +
               "\nCustomer Name: " + custName +
               "\nCurrent Balance: " + balance +
               "\nPhone Number: " + phoneNum;
    }

	public  double getBalance() {
		return balance;
	}

	public   void setBalance(double amt) {
		this.balance=amt; 
	}

	public  double getactNum() {
		return actNum;
	}

	public String getcustName() {
		return custName;
	}

	public String getphoneNum() {
		return phoneNum;
	}

	@Override
	public String toString() {
		return "Account Number : "+actNum+" Account Balance : "+balance+" Customer Name : "
				+custName+" Phone Number : "+phoneNum;

	}

}



