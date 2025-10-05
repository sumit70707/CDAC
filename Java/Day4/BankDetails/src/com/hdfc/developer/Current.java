package com.hdfc.developer;
import com.hdfc.developer.BankAccount;

public class Current extends Saving {
	private long cActNum;
	public static long dcActNum = 1023600;
	public Current(int crnNum ,double balance , String custName , String phoneNum){
		super(crnNum , balance,custName , phoneNum);
		cActNum = dcActNum ++ ;	
		
	}
	
	public void withdraw() {
//		if( getBalance() < amt ) {
		
		System.out.print(getbalance());	
//		}
		
	}

}
