import java.util.Scanner;

class Hotel{

public static void main(String args[]){

Scanner sc =new Scanner(System.in);
int qty;
int ch;
int totalBill=0;
System.out.println(" Items ------ Price \n 1. Dosa ---- 70 Rs. \n 2. Idli ---- 30 Rs. \n 3. Samosa ---- 20 Rs. \n 4. Vadapao ---- 15 Rs. \n 0. Generate Bill \n 5. Exit ");

boolean flag=false;
while(!flag){

System.out.println("Enter Your Choice :");
ch=sc.nextInt();
switch(ch){

case 1: System.out.println("Enter Your Qunatity For Dosa - ");
	qty=sc.nextInt();
	totalBill=totalBill+(qty*70);
	System.out.println("Hey Your Order For Dosa  With Qunatity "+qty+" is Ready !!");
break;
case 2: System.out.println("Enter Your Qunatity For Idli - ");
	qty=sc.nextInt();
	totalBill=totalBill+(qty*30);
	System.out.println("Hey Your Order For Idli  With Qunatity "+qty+" is Ready !!");
break;
case 3: System.out.println("Enter Your Qunatity For Samosa - ");
	qty=sc.nextInt();
	totalBill=totalBill+(qty*20);
	System.out.println("Hey Your Order For Samosa  With Qunatity "+qty+" is Ready !!");
break;
case 4: System.out.println("Enter Your Qunatity For Vadapao - ");
	qty=sc.nextInt();
	totalBill=totalBill+(qty*15);
	System.out.println("Hey Your Order For Vadapao  With Qunatity "+qty+" is Ready !!");
break;
case 0:	System.out.println("Hey Your Total Bill is --:"+totalBill);
default:System.out.println("****** Thank You Please Visit Again ******");
	flag=true;
break;
}
}
sc.close();
}
}




	


