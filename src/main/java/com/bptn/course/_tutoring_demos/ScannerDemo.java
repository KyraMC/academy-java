package com.bptn.course._tutoring_demos;

import java.util.Scanner; //Step 1

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Step 2 - Create scanner object
		
		System.out.println("Enter your name: "); // Step 3 - Tell user what to input
		
		String name = scanner.nextLine(); // Step 4 - Get user input and save it
		
		System.out.println("Enter your age: ");
		
		int age = scanner.nextInt(); 
		
		System.out.println("Enter your last name: "); // Step 3 - Tell user what to input
		
		scanner.nextLine(); // Use this when switching input type to a string Ex. int to a string, double to a string, etc
		
		String lastName = scanner.nextLine(); // Step 4 - Get user input and save it
		
		System.out.println("Enter true or false: ");
		
		boolean trueOrFalse = scanner.nextBoolean();
		
		System.out.println("Enter a price: ");
		
		double price = scanner.nextDouble();
		
		System.out.println("This is your input: " + name + age + trueOrFalse + price + lastName);
		
		// Last step - Always close your scanner
		scanner.close();		
		 

	}

}
