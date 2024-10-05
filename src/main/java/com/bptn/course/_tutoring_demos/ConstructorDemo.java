package com.bptn.course._tutoring_demos;

public class ConstructorDemo {
	// Step 1 - Class variables / Attributes
	private String name;
	private String author;
	private String publisher;
	private int copies;
	private double price;
	
	// Step 2 - create constructor heading with same name as class
	// Access Modifier for the constructor should depend on where you use it 
	// public = anywhere, protected = Same package, or different package if it's a subclass, 
	// default = any class in the same package, private = same class
	// Make parameters, with what you know when object is created
	public ConstructorDemo(String name, String author, String publisher) {
		// We use this to show ownership of the attributes by the object
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = 0; // Price is 0 by default, but can be set later
		this.copies = 0; //Copies is 0 by default, but can be set later
	}
	
	// Setters - collect information from the user and save it
	public void setCopies(int copies) {
		this.copies = copies;
		// Class variable copies = parameter copies
	}
	
	public void setPrice(double price) {
		this.price = price;
		// Class variable copies = parameter price that it gets from the user
	}
	
	// Method to increase the current price by priceIncrease
	public void raisePrice(double priceIncrease) {
		this.price = this.price + priceIncrease; // price = 14.75 + 1.25 = 16.00
	}
	
	// Getters - Give out information
	public double getPrice() {
		return this.price;
	}
	
	public String print() {
		return "This is " + author + "'s book. The price is " + price + ".";
	}
	
}
