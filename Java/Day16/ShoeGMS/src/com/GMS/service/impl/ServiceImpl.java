package com.GMS.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.GMS.core.Shoe_Galary;
import com.GMS.exception.GMSException;
import com.GMS.service.GmsService;
import static com.GMS.validation.GmsValidation.validateAllInput;;

public class ServiceImpl implements GmsService {

	List<Shoe_Galary> list=new ArrayList<>();
	Comparator<Shoe_Galary> comp=(p1,p2)-> ((Double)p1.getPrice()).compareTo(p2.getPrice());


	@Override
	public void addShoeDetails( String name, String brand, int ratings, double price,
			boolean available_in_Galary, String type) throws GMSException {

		Shoe_Galary shoe=validateAllInput(name,brand,ratings,price,available_in_Galary,type,list);

		list.add(shoe);
		System.out.println("Shoe Details Added Seccessfully !!!");
	}

	@Override
	public void displayAllShoeDetails() {

		for(Shoe_Galary s:list) {
			System.out.println(s.toString());
		}

	}

	@Override
	public void displayShoeDetailsById(int id) throws GMSException{
		Shoe_Galary s=new Shoe_Galary(id);

		if(list.contains(s)) {
			int idx=list.indexOf(s);
			Shoe_Galary s1=list.get(idx);
			System.out.println( s1.toString());
		}else {
			throw new GMSException("Invalid ID");
		}

	}

	@Override
	public void searchExpensiveShoe() {

		list.sort(comp);
		System.out.println(list.get(list.size()-1));
	}

	@Override
	public void removeShoe(int id) throws GMSException{

		Shoe_Galary s=new Shoe_Galary(id);

		if(list.contains(s)) {
			int idx=list.indexOf(s);
			list.remove(list.get(idx));
			System.out.println(id+" Removed Successfully");
		}else {
			throw new GMSException("Invalid ID");
		}

	}

	@Override
	public void updateShoePrice(String brand,double price) throws GMSException{
		Shoe_Galary s2=new Shoe_Galary(brand);

		if(list.contains(s2)) {
			int idx=list.indexOf(s2);
			Shoe_Galary s3=list.get(idx);
			s3.setPrice(price);
			System.out.println(s3.toString());
		}else {
			throw new GMSException("Invalid ID");
		}
		
	}

	@Override
	public void sortShoeOnPrice() {
		list.sort(comp);
		for(Shoe_Galary s:list) {
			System.out.println(s.toString());
		}
		
	}


}
