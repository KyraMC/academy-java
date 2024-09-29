package com.bptn.course._01_BIg_Coding;

import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scan2 = new Scanner(System.in);
				
		// creating an integer that will be our do while condition
		int continueOp = 0;
		
		do {
			// Print string menu and get user input of what they want to select
			System.out.println("/...String Menu.../ \n"
					+ "Press 1 for Palindrome Check \n"
					+ "Press 2 to reverse a String \n"
					+ "Press 3 to Concatenate two Strings \n"
					+ "Press 4 for  String Comparison \n"
					+ "Press 5 to Calculate the Length of String \n"
					+ "Enter the option: ");
			int menuItem = scan2.nextInt();
			
			// Initializing string variables that we will be using for our operations
			String string1;
			String string2 = "";
			
			switch(menuItem) {
			
			// Palindrome Check
			case 1: 
				// Ask users what string they want to check
				System.out.println("Palindrome Check");
				System.out.println("Enter a string:");
				scan2.nextLine(); // Add this to consume the rest of the line from the scan2.nextInt();
				string1 = scan2.nextLine();
				
				// Loop through each index of the input starting at the last character and working down to index 0
		        // and add the character to string2
				for(int i = string1.length() - 1; i >= 0; i--) {
					string2 += string1.charAt(i);
				}
				
				// if the reverse equals the original input, it's a palindrome. Otherwise it's not.
		        // Make sure case (upper or lower) is the same when comparing so that it compares characters correctly
				if (string1.toLowerCase().equals(string2.toLowerCase())) {
		            System.out.println(string1 + " is a palindrome ");
		        } else {
		            System.out.println(string1 + " is not a palindrome");
		        }
				
				// Ask user if they want to continue and set continueOp to their input
				System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueOp = scan2.nextInt();
        		
        		break;
        		
    		// Reverse String
			case 2: 
				// Ask users what string they want to check
				System.out.println("Reverse a String \n"
						+ "Enter a string:");
				scan2.nextLine(); // Add this to consume the rest of the line from the scan2.nextInt();
				string1 = scan2.nextLine();
				
				// Loop through each index of the input starting at the last character and working down to index 0
		        // and add the character to string2
				for(int i = string1.length() - 1; i >= 0; i--) {
					string2 += string1.charAt(i);
				}
				
				// Print the reverse
				System.out.println("The reverse is " + string2);
				
				// Ask user if they want to continue and set continueOp to their input
				System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueOp = scan2.nextInt();
        		
        		break;
        	
        	// Concatenate 2 Strings
			case 3: 
				System.out.println("Concatenate two Strings");
				// Ask users what strings they want to concatenate
				System.out.println("Enter First String:");
				scan2.nextLine(); // Add this to consume the rest of the line from the scan2.nextInt();
				string1 = scan2.nextLine();
				System.out.println("Enter Second String: ");
				string2 = scan2.nextLine();
				
				// Print the concatenate of the 2 strings
				System.out.println(string1 + string2);
				
				// Ask user if they want to continue and set continueOp to their input
				System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueOp = scan2.nextInt();
        		
        		break;
        		
        	// String Comparison
			case 4: 
				
				System.out.println("String Comparison");
				
				// Ask users what strings they want to compare
				System.out.println("Enter First String:");
				scan2.nextLine(); // Add this to consume the rest of the line from the scan2.nextInt();
				string1 = scan2.nextLine();
				
				System.out.println("Enter Second String: ");
				string2 = scan2.nextLine();
				
				// Check whether strings are equal and print out results based on it
				if (string1.equals(string2)) {
					System.out.println("The entered strings are equal.");
				}else {
					System.out.println("The entered strings are not equal.");
				}
				
				// Ask user if they want to continue and set continueOp to their input
				System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueOp = scan2.nextInt();
        		
        		break;
        	
        	// Length of string
			case 5: 
				System.out.println("Length of a string");
				
				// Ask users what strings they want to compare
				System.out.println("Enter a string:");
				scan2.nextLine(); // Add this to consume the rest of the line from the scan2.nextInt();
				string1 = scan2.nextLine();
				
				// 
				System.out.println("The length of the entered string is: " + string1.length());
				
				// Ask user if they want to continue and set continueOp to their input
				System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueOp = scan2.nextInt();
        		
        		break;
        	
			default:
        		System.out.println("Invalid choice! Please make a valid choice.");
			}
			
		}while(continueOp == 1); //If they press 1, resend the menu for selection
		
		scan2.close(); // Close Scanner to avoid leaks
	}

}
/* SUMMARY
This progam uses a do while loop and switch cases to perform various string operations.  We show users the menu 
options and then based on their selection, we ask them what string(s) they would like to use and then we
perform that specific task. After we have output the results, we ask them if they would like
to continue and if they do we restart by asking them for a new menu selection. If they don't want to continue,
the program ends. 

This program is similar to the calculator one but instead of doing arithmetic operations on doubles we are instead doing
String operations. An issue I ran into was when I was trying to get a string user input, it was skipping the command to scan
the String input from the user. After troubleshooting I learned that it was because when switching from nextInt() to nextLine(), 
you need to consume the last line scanned. To do this you add a nextLine(); but don't set to a variable and then you scan the
actual user input.
*/
