package com.tester;

import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;


public class Test1 {
	
	public static void main(String [] args) {
		
		//List<Student> studentList=populateList();
		
		Map<String,Student> studentMap=populateMap(populateList());
		Comparator<Student> comp=((p1,p2) ->(p1.getDob()).compareTo(p2.getDob()));
		List<Student> list=new ArrayList<>();
		//List<Student> studentList=populateList();
//		studentMap.values().stream()
//				.forEach((v) -> System.out.println(v));
//studentMap.forEach((k,v) -> System.out.println(v));
		
//		Subject subject=Subject.DBT;
//		
//		studentMap.values()
//			.stream()
//			.filter(p -> p.getSubject()==subject)
//			.forEach(p -> System.out.println(p));
		
		
//		3.2 Print sum of  marks of students of all students from the specified state
//		i/p : name of the state
		String add="MH";
		
//		double sum=studentMap.values().stream()
//					.filter(s -> s.getAddress().getState().endsWith(add))
//					.mapToDouble(p -> p.getGpa())
//					.sum();
//		System.out.println(""+ sum);
		
//		3.3 Print name of specified subject  topper
//		i/p : subject name
		
		Subject subject=Subject.DBT;
		double marks=9.0;
//		
//		System.out.println( studentMap.values().stream()
//			.filter(s -> s.getSubject()==subject)
//			.max(comp));
		
//		3.4 Print number  of  failures for the specified subject chosen  from user.
//		i/p : subject name
//		(failure is GPA < 5.0 , out of 1-10)
//		
//		System.out.println(studentMap.values()
//			.stream()
//			.filter(p -> p.getSubject()==subject )
//			.filter(p -> p.getGpa()<9.0)			
//			.count());
			
//		3.5 Display names of students enrolled in a specified subject , securing marks > specified marks
//		i/p : subject name , marks

//		studentMap.values()
//				.stream()
//				.filter(p -> p.getSubject()==subject )
//				.filter(p -> p.getGpa()<marks)
//				.forEach(p -> System.out.println(p.getName()));
//		3.6 Suppose a particular subject faculty is unavailable for few days. So you have to infor the students of specified subjec. 
//		Collect the specified subject students into the list n display it.
//		i/p : subject name
		
//		System.out.println(studentMap.values()
//		.stream()
//		.filter(p -> p.getSubject()==subject )
//		.toList());
		
		//3.7 Display  student details for specified subject , sorted as per DoB
		
		System.out.println(studentMap.values()
				.stream()
				.filter(p -> p.getSubject()==subject )
				.sorted(comp)
				.toList());

	
		
	}

}
