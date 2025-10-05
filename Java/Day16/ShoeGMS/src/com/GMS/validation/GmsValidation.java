package com.GMS.validation;

import java.util.List;

import com.GMS.core.Shoe_Galary;
import com.GMS.core.Shoe_Type;
import com.GMS.exception.GMSException;

public class GmsValidation {
	
	public static Shoe_Galary validateAllInput( String name, String brand, int ratings, double price,
			boolean available_in_Galary, String type,List<Shoe_Galary> list) throws GMSException{
		
		int _rating=validateRatings(ratings);
		Shoe_Type _type= validateShoeType(type,list);
		String _name=validateName(name);
		
		return new Shoe_Galary( _name, brand, _rating, price, available_in_Galary, _type);
	}

	private static String validateName(String name) throws GMSException{
		int length=name.length();
		if(length>=3 && length<=20) {
			return name;
		}else {
			throw new GMSException("Length of Name Should be In 3 To 20");
		}

	}

	private static Shoe_Type validateShoeType(String type, List<Shoe_Galary> list) throws IllegalArgumentException{
		
		Shoe_Type s=Shoe_Type.valueOf(type.toUpperCase());
		
		
		return s;
	}

	private static int validateRatings(int ratings) throws GMSException{
		if(ratings>=1 && ratings<=10) {
			return ratings;
		}else {
			throw new GMSException("Rating Should Be in 1-10");
		}
		
	}

}
