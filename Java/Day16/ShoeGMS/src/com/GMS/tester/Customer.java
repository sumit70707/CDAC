package com.GMS.tester;

import java.util.Scanner;

import com.GMS.exception.GMSException;
import com.GMS.service.GmsService;
import com.GMS.service.impl.ServiceImpl;

public class Customer {

	public static void main(String [] args) {
		GmsService service=new ServiceImpl();

		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int id;
		System.out.println(" **** Welcome Show Galary Management System **** ");

		while(flag) {

			System.out.println("1. Add Shoe Details");
			System.out.println("2. Display All Shoe Details");
			System.out.println("3. Display Shoe Details By ID");
			System.out.println("4. Search Expensive Shoe");
			System.out.println("5. Remove Shoe");
			System.out.println("6. Update Shoe Price on Brand");
			System.out.println("7. Sort Shoe on Price");
			System.out.println("8. Exit");
			System.out.println("Please Enter Your Choice");
			choice=sc.nextInt();

			try {

				switch(choice) {
				case 1:
					System.out.println("Please Enter Shoe Details __\n"
							+ "sname,  brand,  ratings,  price,  available_in_Galary, type");
					service.addShoeDetails( sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextBoolean(), sc.next());
					
					break;
				case 2:
					service.displayAllShoeDetails();
					break;
				case 3:
				
					System.out.println("Enter Id :");
					id=sc.nextInt();
					service.displayShoeDetailsById(id);
					
					break;
				case 4:
					service.searchExpensiveShoe();
					break;
				case 5:
					System.out.println("Enter Id :");
					id=sc.nextInt();
					service.removeShoe(id);
					break;
				case 6:
					
					System.out.println("Enter Brand Name And Price Of Product :");
					service.updateShoePrice(sc.next(), sc.nextDouble());
					break;
				case 7:
					service.sortShoeOnPrice();
					break;
				case 8:
					flag=false;
					System.out.println("---- Thank You Visit Again ----");
					break;
				default :
					//flag=false;
					throw new GMSException("Invalid Choice");
					
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}


}
