package com.bptn.course._tutoring_demos;

public class Library {

	public static void main(String[] args) {
		// Create an object of the ConstructorDemo
		// Format for creating an object - ClassName variableName = new
		// ClassName(parameters);
		ConstructorDemo book = new ConstructorDemo("book 1", "Ola", "BPTN");
		// Calling the setter setCopies
		book.setCopies(25);
		// Getting the book price using the getPrice() getter method and printing it out
		System.out.println(book.getPrice());
		// Call the setter setPrice
		book.setPrice(14.75);
		System.out.println(book.getPrice());
		book.raisePrice(1.25);
		System.out.println(book.getPrice());

		// The class variable is private so we can't access it and get an error
		// book.price;

		// Calling the print method in the ConstructorDemo class for Ola's book,
		// and printing what it returns
		System.out.println(book.print());

		ConstructorDemo book2 = new ConstructorDemo("book 2", "Kyra", "BPTN");
		System.out.println(book2.getPrice());
		book2.setPrice(18.99);
		System.out.println(book2.getPrice());

	}

}
