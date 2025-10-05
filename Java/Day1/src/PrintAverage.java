import java.util.Scanner;
class PrintAverage{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 Double Values : ");
double num1=sc.nextDouble();
double num2=sc.nextDouble();
double num3=sc.nextDouble();
double num4=sc.nextDouble();
double num5=sc.nextDouble();

double average=(num1+num2+num3+num4+num5)/5;

System.out.println("Average of Numbers is : "+ average);
sc.close();
}
}


