package com.GMS.service;

import com.GMS.exception.GMSException;

public interface GmsService {

	void addShoeDetails( String name, String brand,
			int ratings,double price,boolean available_in_Galary,
			String type) throws GMSException;
	void displayAllShoeDetails();
	void displayShoeDetailsById(int id) throws GMSException;
	void searchExpensiveShoe();
	void removeShoe(int id)throws GMSException;
	void updateShoePrice(String brand,double price) throws GMSException;
	void sortShoeOnPrice();
	
}
