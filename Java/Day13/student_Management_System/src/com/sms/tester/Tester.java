package com.sms.tester;

import java.util.Scanner;

import com.sms.service.SMSService;
import com.sms.service.impl.SMSServiceImpl;

public class Tester {

	public static void main(String[] args) {
		boolean flag =true;
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("*** Welcome To Student Management System *** \n");
			System.out.println("Enter The Size Of Student :");
			SMSService service = new SMSServiceImpl(sc.nextInt());
			
			while(flag) {
				System.out.println("1. Admit Student \n"
						+ "2. Cancel Admission \n"
						+ "3. Search Student By Email \n"
						+ "4. Display All Students \n"
						+ "5. Display Students By Course\n"
						+ "0. Exit");
				System.out.println("Enter Your Choice..");
				try {
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter The Fields Name,Email,Marks,Course,Date");
						System.out.println(service.admitStudent("John", "john123@gmail.com", 70, "CORE_JAVA", "2007-12-05"));
						System.out.println(service.admitStudent("John", "john13@gmail.com", 70, "PYTHON", "2007-12-05"));
						System.out.println(service.admitStudent("John", "john23@gmail.com", 70, "CORE_JAVA", "2007-12-05"));
						System.out.println(service.admitStudent("John", "john22@gmail.com", 70, "PYTHON", "2007-12-05"));
						break;

					case 2:
						System.out.println("Enter Email Of Student ..");
						System.out.println(service.cancelAdmission(sc.next()));
						break;
					case 3:
						System.out.println("Enter Email Of Student ..");
						service.searchByEmail(sc.next());
						break;
					case 4:
						service.displayAllStudent();
						break;
					case 5:
						System.out.println("Enter Course Name ..");
						service.displayStudentByCourse(sc.next());
						break;
					case 0:
						flag=false;
						break;
					}
				}catch(Exception  e ) {
					//e.printStackTrace();
					System.out.println(e);
				}

				sc.nextLine();
			}
		}


	}

}
