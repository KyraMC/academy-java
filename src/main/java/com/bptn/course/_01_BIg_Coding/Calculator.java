package com.bptn.course._01_BIg_Coding;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// creating an integer that will be our do while condition
        int continueCalc = 0;
        
        
        // Initializing variables to do our calculations with
        double num1;
        double num2;
        
        do {
        // Print calculator menu and get user input of what they want to select
        	System.out.println("/... Calculator Menu .../ \n"
         		+ "Press 1 for addition \n"
         		+ "Press 3 for subtraction \n"
         		+ "Press 3 for multiplication \n"
         		+ "Press 4 for division \n"
         		+ "Press 5 to square a number \n"
         		+ "Press 6 to find a square root \n"
         		+ "Press 7 to find the reciprocal");
        	int menuItem = scan.nextInt();
        	
        
        	//switch(menuItem) {
        	
        	// Addition 
					if(menuItem==1){
        	//case 1:
        		// Ask users what 2 numbers they want to add
        		System.out.println("Enter the first number: ");
        		num1 = scan.nextDouble();
        		
        		System.out.println("Enter the second number: ");
        		num2 = scan.nextDouble();
        		
        		// Print out the sum
        		System.out.println("The  sum of the numbers " + num1 +" and " + num2 + " is = " + (num1+num2));
        		
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
					}
        		//break;
        	
        	// Subtraction
        	else if(menuItem ==2){//case 2:
        		// Ask users what 2 numbers they want to subtract
        		System.out.println("Enter the first number: ");
        		num1 = scan.nextDouble();
        		
        		System.out.println("Enter the second number: ");
        		num2 = scan.nextDouble();
        		
        		// Print out the difference
        		System.out.println("The  difference of the numbers " + num1 +" and " + num2 + " is = " + (num1-num2));
        		
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
        	
        		
        	// Multiplication
        	else if (menuItem == 3){ //case 3:
        		// Ask users what 2 numbers they want to multiply
        		System.out.println("Enter the first number: ");
        		num1 = scan.nextDouble();
        		
        		System.out.println("Enter the second number: ");
        		num2 = scan.nextDouble();
        		
        		// Print out the product
        		System.out.println("The  product of the numbers " + num1 +" and " + num2 + " is = " + (num1*num2));
        	
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
        	
        	//Division
        	else if (menuItem ==4){ //case 4:
        		// Ask users what 2 numbers they want to divide
        		System.out.println("Enter the first number: ");
        		num1 = scan.nextDouble();
        		
        		System.out.println("Enter the second number: ");
        		num2 = scan.nextDouble();
        		
        		// Print out the quotient and the remainder
        		System.out.println("Dividing " + num1 +" by " + num2 + "  the quotient is " + (num1/num2));
        		System.out.println("The remainder is " + (num1 % num2));
        	
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
        		
        	//Square
        	else if (menuItem == 5) {//case 5:
        		// Ask users what number they want to square
        		System.out.println("Enter the number to find Square: ");
        		num1 = scan.nextDouble();
        		
        		// Print out the square
        		System.out.println("The  square of the number " + num1 + " is = " + (num1*num1));
        		
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
        		
        	// Square Root
        	else if (menuItem == 6) {//case 6:
        		// Ask users what number they want to square root
        		System.out.println("Enter the number to find Square Root: ");
        		num1 = scan.nextDouble();
        		
        		// Print out the square root
        		System.out.println("The  square root of the number " + num1 + " is = " + (Math.sqrt(num1)));
        		
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
        	
        	//Reciprocal
        	else if (menuItem == 7) {//case 7:
        		// Ask users what number they want to find reciprocal of
        		System.out.println("Enter the number to find reciprocal: ");
        		num1 = scan.nextDouble();
        		
        		// Print out the reciprocal
        		System.out.println("The  reciprocal of the number " + num1 + " is = " + (1/num1));
        		
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
        	
        	// If user does not enter a valid number
        	else{ //default:
        		System.out.println("Invalid Choice! Please make a valid choice.");
        		
        		// Ask user if they want to continue and set continueCalc to their input
        		System.out.println("If you would like to continue press 1, otherwise press any other number.");
        		continueCalc = scan.nextInt();
        		
						}	//break;
  
        		
        	//}
        }while(continueCalc == 1); // If user pressed 1, continue the loop
        
        scan.close(); // Close Scanner to avoid leaks

        
    }
}
/* SUMMARY
This program uses a do-while loop and if-else statements in order to create a calculator. We show users the menu 
options and then based on their selection, we ask them what number(s) they would like to use and then we
perform that specific calculation. After we have output the calculation, we ask them if they would like
to continue and if they do we restart by asking them for a new menu selection. If they don't want to continue,
the program ends. 

This task is very similar to the Vending Machine Selection challenge we had as we had to present a menu
and based on the users input we performed a task and either presented the menu again or exited. This task
is slightly different because we don't have to check if the numbers input are greater than, less than or equal
to like we did when giving change, because it does not affect our calculations. But we did have to do more calculations
as that program only required subtraction, whereas this used various operations.
*/