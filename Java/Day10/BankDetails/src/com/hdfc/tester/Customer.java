package com.hdfc.tester;

import java.util.Scanner;

import com.hdfc.ExeptionHandling.BankException;
import com.hdfc.core.BankAccount;
import com.hdfc.core.Current;
import com.hdfc.core.Saving;
import com.hdfc.validations.BankValidation;

public class Customer {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		BankAccount[] accounts = new BankAccount[100]; // up to 100 accounts
		int counter = 0;
		boolean flag = false;
		try (Scanner sc = new Scanner(System.in)) {

			do {
				System.out.println(" ** Welcome To HDFC Bank ** "
						+ "\n Please Select The Option "
						+ "\n 1. Open Saving Account"
						+ "\n 2. Open Current Account"
						+ "\n 3. Display Account Summary"
						+ "\n 4. Withdraw"
						+ "\n 5. Deposit"
						+ "\n 6. Exit");
				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						if(counter < accounts.length) {
							System.out.println("** Opening Saving Account **");
							System.out.print("Enter Account Number: ");
							int num = sc.nextInt();
							System.out.print("Enter Balance: ");
							double bal = sc.nextDouble();
							sc.nextLine();
							System.out.print("Enter Name: ");
							String name = sc.nextLine();
							System.out.print("Enter Phone: ");
							String phone = sc.nextLine();

							BankValidation.validateAllInputs(num, bal, name, 
									phone, accounts);
							accounts[counter++] = new Saving(num, bal, name, phone);
							System.out.println("** Saving Account Created Successfully! **");
						}
						break;

					case 2:
						if(counter < accounts.length) {
							System.out.println("** Opening Current Account **");
							System.out.print("Enter Account Number: ");
							int num = sc.nextInt();
							System.out.print("Enter Balance: ");
							double bal = sc.nextDouble();
							sc.nextLine();
							System.out.print("Enter Name: ");
							String name = sc.nextLine();
							System.out.print("Enter Phone: ");
							String phone = sc.nextLine();

							BankValidation.validateAllInputs(num, bal, name, 
									phone, accounts);
							accounts[counter++] = new Current(num, bal, name, phone);
							System.out.println("** Current Account Created Successfully! **");
						}
						break;

					case 3:
						System.out.print("Enter Account Number: ");
						BankAccount act=new BankAccount(sc.nextInt());
						boolean found = false;
						for (BankAccount acc : accounts) {
							if (acc != null && acc.equals(act)) {
								System.out.println(acc.getAccountSummary());
								found = true;
								break;
							}
						}
						if (!found) {
							throw new BankException("---- Account Number Not Found ----");
						}
						break;

					case 4:
//						System.out.print("Enter Account Number: ");
//						int actW = sc.nextInt();
						System.out.print("Enter Account Number: ");
						BankAccount act1=new BankAccount(sc.nextInt());
						System.out.print("Enter Amount to Withdraw: ");
						double amtW = sc.nextDouble();
						found = false;
						for (BankAccount acc : accounts) {
							if (acc != null && acc.equals(act1)) {
								System.out.println(acc.withdraw(act1.getactNum(),amtW));
								found = true;
								break;
							}
						}
						if (!found) {
							throw new BankException("---- Account Number Not Found ----");
						}
						break;

					case 5:
//						System.out.print("Enter Account Number: ");
//						int actD = sc.nextInt();
						System.out.print("Enter Account Number: ");
						BankAccount act2=new BankAccount(sc.nextInt());
						System.out.print("Enter Amount to Deposit: ");
						double amtD = sc.nextDouble();
						found = false;
						for (BankAccount acc : accounts) {
							if (acc != null && acc.equals(act2)) {
								acc.deposit(amtD);
								found = true;
								break;
							}
						}
						if (!found) {
							throw new BankException("---- Account Number Not Found ----");
						}
						break;

					case 6:
						System.out.println("** Thank You Please Visit Again **");
						flag = true;
						break;

					default:
						throw new BankException("** Invalid Input **");
					}
				}catch(BankException e) {
					System.out.println(e);
					//e.printStackTrace();

				}


			} while (!flag);
		} 
	}
}
