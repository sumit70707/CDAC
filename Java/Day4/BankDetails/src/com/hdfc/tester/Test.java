package com.hdfc.tester;

import com.hdfc.developer.Saving;
import com.hdfc.developer.Current;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Saving s3=new Saving();
//		Saving s1 = new Saving(5000,100.00,"John","876554564");
//		
//		long act = s1.getActNum();
//		System.out.println(act); 
//		Saving s2 = new Saving(50000,1080.00,"Johdrn","87657854564");
//		long act1 = s2.getActNum();
//		System.out.println(act1); 
		Current c1=new Current(50000,1080.00,"Johdrn","87657854564");
		c1.withdraw();
	}

}
