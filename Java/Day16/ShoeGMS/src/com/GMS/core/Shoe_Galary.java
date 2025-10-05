package com.GMS.core;

import java.util.Comparator;

public class Shoe_Galary  {
	
	private int shoe_Id;
	private String name;
	private String brand;
	private int ratings;
	private double price;
	private boolean available_in_Galary;
	Shoe_Type type;
	private static int counter;
	
	public Shoe_Galary(int shoe_Id) {
		this.shoe_Id=shoe_Id;
	}
	
	public Shoe_Galary(String brand) {
		this.brand=brand;
	}
	
	public Shoe_Galary( String name, String brand, int ratings, double price, boolean available_in_Galary,
			Shoe_Type type) {
		super();
		this.shoe_Id = counter++;
		this.name = name;
		this.brand = brand;
		this.ratings = ratings;
		this.price = price;
		this.available_in_Galary = available_in_Galary;
		this.type = type;
	}
	public int getShoe_Id() {
		return shoe_Id;
	}
	public void setShoe_Id(int shoe_Id) {
		this.shoe_Id = shoe_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable_in_Galary() {
		return available_in_Galary;
	}
	public void setAvailable_in_Galary(boolean available_in_Galary) {
		this.available_in_Galary = available_in_Galary;
	}
	
	@Override
	public String toString() {
		return "Shoe_Galary [shoe_Id=" + shoe_Id + ", name=" + name + ", brand=" + brand + ", ratings=" + ratings
				+ ", price=" + price + ", available_in_Galary=" + available_in_Galary + ", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Shoe_Galary ) {
			Shoe_Galary s = (Shoe_Galary) o;
			if(this.shoe_Id!=0 && s.shoe_Id!=0) {
				return this.shoe_Id==s.shoe_Id;
			}
			if(this.brand!=null && s.brand!=null)
			{
				return this.brand.equalsIgnoreCase(s.brand);
			}
			
		}
		return false;
	}
	
	
	
	

}
