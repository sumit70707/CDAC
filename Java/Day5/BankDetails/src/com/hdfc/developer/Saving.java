package com.hdfc.developer;

public class Saving extends BankAccount {
	private  double interestRate;
	//private  long actNum;
	//public static long dAct=105631; 


	public Saving (int actNum , double balance , String custName , String phoneNum){
		//actNum++;
		super(actNum ,balance ,custName , phoneNum);
		//actNum=dAct++;
		interestRate = 0.05;

	}


	public  void deposit(double amount) {

		deposit(amount);
	}

	public double applyInterest() {
		setBalance(getBalance()* interestRate);
		return getBalance() ;
	}

	public   String withdraw(int actNum,double amount) {
		//return super.withdraw(amt);
		if(getactNum()==actNum) {
			if(getBalance()> amount) {
				if(getBalance() - amount<=500) {
					return "Can't Process The Transaction Amount<500";
				}
				double bal=getBalance();
				setBalance(bal-amount);
				return "Amount withdraw:"+amount+" Remaining Balance:"+getBalance();
			}
			return "low balance";
		}else {
			return "---- Account Number Not Found ----";
		}
	}

	//	//@Override
	//	public double getActNum() {
	//		return getactNum();
	//	}

	//	//@Override
	//	public double getbalance() {
	//		return getBalance();
	//	}
	@Override
    public String getAccountSummary() {
        return super.getAccountSummary() + "\nInterest Rate: " + interestRate;
    }

	@Override
	public String toString() {

		return "Account Number : "+getactNum()+" Account Balance : "+getBalance()+" Customer Name : "
				+getcustName()+" Phone Number : "+getphoneNum()+" Intrest Rate for Saving Account :"+this.interestRate;

	}
}
