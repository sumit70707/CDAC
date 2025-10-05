package com.cms.tester;

import java.util.Scanner;

import com.cms.Exception.CMSException;
import com.cms.service.CMSService;
import com.cms.service.impl.CMSServiceImpl;

public class User {

	public static void main(String [] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter nu of Customer to Service..");
			CMSService service=new CMSServiceImpl(sc.nextInt());

			boolean flag=false;
			while(!flag) {
				System.out.println("1. Register Customer \n" 
						+ "2. Display All \n"
						+ "3. Sign In \n"
						+ "4. Change Password \n"
						+ "5. Unsubscribe Customer \n"
						+ "6. Search By Plan & Dob \n"
						+ "7. Sort customers as per email \n" 
						+ "0.Exit\n");
				System.out.println("Choose option");

				try {
					switch(sc.nextInt()) {

					case 1:
						System.out.println("Enter customer details - firstName,  lastName, email,  password,  regAmount,dob,  plan");

						//invoke serviceimpl for business logic
						System.out.println("Status : "+service.registerCustomer(sc.next(), 
								sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next()));

						break;
					case 2:
						System.out.println("All Customer Details");
						service.displayCustomerDetail();
						break;
					case 0:
						flag=true;
						break;
					}
				}catch(CMSException e) {
					sc.nextLine();
					System.out.println(e);
				}

			}
		}

	}

}
