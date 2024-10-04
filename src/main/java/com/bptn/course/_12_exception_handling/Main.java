package com.bptn.course._12_exception_handling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			//code that might throw an exception goes here
			System.out.println("How many elements do you want in the array?");
			int count = scanner.nextInt();
			
			int[] numbers = new int[count];
			
			for(int i = 0; i < count; i++) {
				System.out.println("Enter a number: ");
				numbers[i] = scanner.nextInt();
			}
			
			System.out.println("Enter 2 more numbers or division: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println("Result: " + result);
			System.out.println("Element at index 10 is: " + numbers[10]);
		} catch(InputMismatchException e) {
			System.out.println("Please enter valid numbers!");
		}catch(ArithmeticException e) {
			// code to handle the exception
			System.out.println("Cannot divide by zero!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array only contains _ items");
		}finally {
			// code that will always execute
			System.out.println("Program ended!");
		}

	}

}
