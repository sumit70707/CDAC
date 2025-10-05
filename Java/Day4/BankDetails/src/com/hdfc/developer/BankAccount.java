package com.hdfc.developer;

public class BankAccount {
	private int crnNum;
	private double balance;
	private String custName;
	private String phoneNum;
	
	public BankAccount(int crnNum , double balance , String custName , String phoneNum){
		this.crnNum = crnNum ;
		this.balance = balance;
		this.custName = custName;
		this.phoneNum = phoneNum;
	}
	
	BankAccount(){}
	void deposit(double amount) {
		
		this.balance += amount;
	}
	
	String withdraw(double amount)
	{
		if(this.balance > amount) {
			this.balance -= amount;
			return "amount withdraw:"+amount+" Remaining Balance:"+balance;
		}
		return "low balance";
	}
	
	String getAccountSummary(){
		
		return "Customer Recognition Number "+crnNum+
				"\n Current Balance: "+ balance+"\n Phone Number: "+phoneNum+
				"\n Customer Name :"+custName;
	}

	double getBalance() {
		return balance;
	}
	
	void setBalance(double amt) {
		this.balance += amt; 
	}
	
}



