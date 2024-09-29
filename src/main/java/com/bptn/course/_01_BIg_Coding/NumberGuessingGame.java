package com.bptn.course._01_BIg_Coding;


import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// Initialize target number
		int targetNumber = 23; //23 for test cases
		
		// Get an integer user input of what their guess is
		System.out.println("Enter a guess between 1 and 100: ");
		int guess = scan.nextInt();
		
		// If the guess is the same as the target 
		if (guess == targetNumber) {
			System.out.println("Congratulations! You guessed the number correctly!");
		} else if (guess < 1 || guess > 100) { // if guess is out of bounds, below 1 or above 100
			System.out.println("Please enter a number between 1 and 100.");
		} else if (guess < targetNumber) { // if guess is less than target
			System.out.println("Too low! Try again.");
		} else if (guess > targetNumber) { // if guess is more than target
			System.out.println("Too high! Try again.");
		}
				
		scan.close(); // close scanner to avoid leaks
	}

}

/* SUMMARY
 * 
 * In this program we had to make a simple game where we ask the user for an integer input and compare it to a target.
 * And depending on what the guess and target is, we print out different responses. This was performed through a series of
 * if-else-if statements that compared the different conditions.
 * 
 * Something that is important and useful for the future is optimizing your conditions by placing it in a certain order.
 * By placing the condition that looks if the guess is in bounds before comparing it to the target, we avoid extra steps. 
 * For example, if it was after comparing to the target, it may say a 0 is too low, when it should print 
 * "Please enter a number between 1 and 100.". And the same would happen if the number was above 100. And this could be 
 * avoided as well if you did 
 * else if (guess < targetNumber && guess >= 1){}
 * but then you also have to do an and condition for when guess is more than target. But doing it in the right order, keeps
 * from having to write long conditions and allows for the right statement to be output.
 */
