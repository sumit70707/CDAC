package com.hdfc.developer;

public class Saving extends BankAccount {
	private double interestRate;
	private  long actNum;
	public static long dAct=105631; 
	

	public Saving (int crnNum , double balance , String custName , String phoneNum){
		//actNum++;
		super(crnNum ,balance ,custName , phoneNum);
		actNum=dAct++;
		interestRate = 0.05;
		
	}

	
	double applyInterest() {
		setBalance(getBalance()* interestRate);
		return getBalance() ;
	}
	
	String withdraw(double amt) {
		return super.withdraw(amt);
	}
	public long getActNum() {
		return actNum;
	}
	double getbalance() {
		return getBalance();
	}
}
