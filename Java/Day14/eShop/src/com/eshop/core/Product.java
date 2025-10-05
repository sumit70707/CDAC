package com.eshop.core;

import java.util.Objects;

public class Product {
	private int id;
	private String name;
	private String category;
	private int stock;
	private double price;

	public Product(int id, String name, String category, 
			int stock, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.stock = stock;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", stock=" + stock + ", price="
				+ price + "]";
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("In Products Equal");
		if(obj instanceof Product) {
			Product p=(Product)obj;
			return this.id==p.id && this.category.equals(p.category);
					
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("In Products Hash");
		int result=(29*id)+(category.hashCode());
		return result;
	}
	

}
