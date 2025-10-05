package com.banking.tester;

import java.util.Scanner;

import com.banking.custom_exceptions.BankingException;
import com.banking.service.BankingService;
import com.banking.service.impl.BankingServiceImpl;

public class Customer {

	public static void main(String[] args) {

		BankingService service=new BankingServiceImpl();
		boolean flag=true;

		try(Scanner sc=new Scanner(System.in)){

			System.out.println("**** Welcome To State Bank Of India ***\n");
			do {

				System.out.println("1. Open Saving Account \n"
						+ "2. Open Current Account \n"
						+ "3. Get Account Summary \n"
						+ "4. Withdraw Money \n"
						+ "5. Deposit Money \n"
						+ "0. Exit \n");
				System.out.println("Please Enter Your Choice ..");

				try {

					switch(sc.nextInt()) {

					case 1:
						System.out.println(" Please Enter Account Details " +""
								+ "\n accountNumber, balance, customerName, phoneNumber, actType, date(YYYY-MM-DD), interestRate");
						System.out.println(service.openAccount(sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble()));

						break;
					case 2:
						System.out.println(" Please Enter Account Details " +""
								+ "\n accountNumber, balance, customerName, phoneNumber, actType, date(YYYY-MM-DD), overdraftLimit");
						System.out.println(service.openAccount(sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble()));

						break;
					case 3:
						System.out.println("Please Enter Account Number ..");

						System.out.println(service.getSummary(sc.nextInt()));

						break;
					case 4:
						System.out.println("Please Enter Account Number & Money To Withdraw..");

						service.withdraw(sc.nextInt(), sc.nextDouble());

						break;
					case 5:
						System.out.println("Please Enter Account Number & Money To Deposit..");

						service.deposit(sc.nextInt(), sc.nextDouble());

						break;
					case 0:
						flag=false;
						
						break;
					default :
						flag=false;
						throw new BankingException("Invalid Input..");
			
					}
				}catch(BankingException e) {
					System.out.println(e);

				}
				sc.nextLine();
			}while(flag);

		}

	}

}
