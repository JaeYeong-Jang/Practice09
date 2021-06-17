package com.javaex.ex03;

public class Goods {
	
	//fields
	private String name;
	private int price;
	private int count;
	
	//constructors
	public Goods() {
		
	}
	
	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
		
	}
	
	//method g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	//method
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
}
