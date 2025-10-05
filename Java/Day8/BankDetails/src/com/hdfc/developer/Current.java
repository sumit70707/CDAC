package com.hdfc.developer;

import com.hdfc.ExeptionHandling.AccountException;

public class Current extends BankAccount {
	//private long cActNum;
	//public static long dcActNum = 1023600;
	private   double overDraftLimit;

	public Current(int crnNum ,double balance , String custName , String phoneNum){
		super(crnNum , balance,custName , phoneNum);
		//this.overDraftLimit=overDraftLimit;
		//cActNum = dcActNum ++ ;
		overDraftLimit=5000;

	}

	public   void deposit(double amount) {

		deposit(amount);
	}

	public  String withdraw(int actNum,double amount) throws AccountException{
		if(getactNum()==actNum) {
			if(getBalance()>amount) {
				double bal=getBalance();
				setBalance(bal-amount);
				return "Amount withdraw:"+amount+" Remaining Balance:"+getBalance();
			}else {
				if(getBalance()+overDraftLimit>amount) {
					double bal=getBalance() - amount;
					setBalance(bal);
					return "Amount withdraw:"+amount+" Remaining Balance:"+getBalance();
				}else {
					//return "Transaction Declined !! Your OverDraft Limit is : "+overDraftLimit;
					throw new AccountException("Transaction Declined !! Your OverDraft Limit is : "+overDraftLimit);
				}
			}
		}else {
			//return "---- Account Number Not Found ----";
			throw new AccountException("---- Account Number Not Found ----");
		}

	}
	@Override
    public String getAccountSummary() {
        return super.getAccountSummary() + "\nOverDraft Limit: " + overDraftLimit;
    }
	@Override
	public String toString() {

		return "Account Number : "+getactNum()+" Account Balance : "+getBalance()+" Customer Name : "
				+getcustName()+" Phone Number : "+getphoneNum()+" OverDraft Limit Of Current Account :"+this.overDraftLimit;

	}

}
