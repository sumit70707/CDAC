import java.util.Scanner;
public class Calculator{

public static void main(String [] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter Value for Num1: ");
int num1=sc.nextInt();
System.out.println("Enter Value for Num2: ");
int num2=sc.nextInt();
System.out.println("1. Addition 2. Substraction 3. Multiplication 4. Division 5. Exit ");
boolean flag=false;
while(!flag){
System.out.println("Enter Your Choice : ");
switch(sc.nextInt())
{
case 1 : System.out.println("Addition of " + num1+" & "+ num2+ " is :"+(num1+num2));
break;
case 2 : System.out.println("Substraction of " + num1+" & "+ num2+ " is :"+(num1-num2));
break;
case 3 : System.out.println("Miltiplication of " + num1+" & "+ num2+ " is :"+(num1*num2));
break;
case 4 : System.out.println("Division of " + num1+" & "+ num2+ " is :"+(num1/num2));
break;
default : System.out.println("Exit From Calculator");
	flag=true;
break;
}
}
sc.close();
}
}

