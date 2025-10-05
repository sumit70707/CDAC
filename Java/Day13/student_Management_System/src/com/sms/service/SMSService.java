package com.sms.service;

import com.sms.exceptionhandling.SMSException;

public interface SMSService {
	
	String admitStudent(String name , String email , int marks , String course , String date) throws SMSException;
	String cancelAdmission(String email) throws SMSException ;
	String searchByEmail(String email)throws SMSException ;
	String displayAllStudent();
	String displayStudentByCourse(String CourseName) throws SMSException, IllegalArgumentException;
	
}

