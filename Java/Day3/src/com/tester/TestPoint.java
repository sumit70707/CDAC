package com.tester;
import com.developers.geometry.Point2D;
import java.util.Scanner;
class TestPoint{

public static void main(String [] args){

Scanner sc=new Scanner(System.in);


System.out.println("Enter Point Cordinate For 1st Point :");
Point2D t1=new Point2D(sc.nextDouble(),sc.nextDouble());

System.out.println("Enter Point Cordinate For 2st Point :");
Point2D t2=new Point2D(sc.nextDouble(),sc.nextDouble());

System.out.println(t1.show());
System.out.println(t2.show());

System.out.println("Is The Two Points Are Same .? : "+t1.isEqual(t2));

System.out.println("Distance Between Two Point is : "+t1.calculateDistance(t2));

}

}