package com.sms.service.impl;
import static com.sms.validation.SMSValidation.validateALL;

import java.util.ArrayList;
import java.util.List;

import com.sms.constant.Coursefield;
import com.sms.core.Student;
import com.sms.exceptionhandling.SMSException;
import com.sms.service.SMSService;


public class SMSServiceImpl implements SMSService {

	List<Student> students; 

	public SMSServiceImpl(int size) {
		students = new ArrayList<>(size); 
	}


	@Override
	public String admitStudent(String name, String email, int marks, String course, String date) throws SMSException {

		Student s =validateALL( name,email,marks,course,date,students);
		students.add(s);
		Coursefield c=Coursefield.valueOf(course.toUpperCase());
		c.setMaxCapacity(c.getMaxCapacity()-1);
		System.out.println("Capacity is="+c.getMaxCapacity());
		return "--- Student Admitted Succefully ---";
	}


	@Override
	public String cancelAdmission(String email) throws SMSException {

		Student s=new Student(email);
		if(students.contains(s)) {
			int indx=students.indexOf(s);
			Student s1=students.get(indx);
			s1.getCourse().setMaxCapacity(s1.getCourse().getMaxCapacity()+1);
			//System.out.println(s1.getCourse().getMaxCapacity());
			students.remove(s);
			//c.setMaxCapacity(c.getMaxCapacity()-1);
			

			return "--- Admission Cancelled ---";
		}
		throw new SMSException("Email Not Found !!!");
	}

	@Override
	public String searchByEmail(String email) throws SMSException {

		Student s=new Student(email);
		if(students.contains(s)) {
			int indx=students.indexOf(s);
			System.out.println( students.get(indx));
		}else {
			throw new SMSException(" Email Not Found !!!");
		}

		return null;

	}

	@Override
	public String displayAllStudent() {

		System.out.println(students.toString());

		return null;
	}

	@Override
	public String displayStudentByCourse(String CourseName) throws SMSException,IllegalArgumentException{

		Coursefield c=Coursefield.valueOf(CourseName.toUpperCase());
		for(Student s1: students) {
			if(s1.getCourse().equals(c)) {
				System.out.println(s1.toString());
			}
		}

		return null;
	}

}
