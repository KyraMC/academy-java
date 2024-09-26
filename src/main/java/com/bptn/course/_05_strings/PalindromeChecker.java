package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// Ask the user for input and define a new string variable as the input
		System.out.println("Enter the string to check for palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Empty string will store the reverse of the input
        String reverseInput = "";
        
        // Loop through each index of the input starting at the last character and working down to index 0 and add the character to reverseInput
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }
        
        // if the reverse equals the original input, it's a palindrome. Otherwise it's not.
        // Make sure case (upper or lower) is the same when comparing so that it compares characters correctly
        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
            System.out.println("Input string is palindrome");
        } else {
            System.out.println("Input string is not palindrome");
        }

	}

}

/* SUMMARY
The PalindromeChecker class takes a String input from the user and compares the input to the reverse
of the String to check whether it's a palindrome. It finds the reverse by looping through the indexes 
of the input starting from the end and working it's way towards the beginning character, and adding each
index to the String reverseInput. What's new about this program is we are looping through indexes starting at
the end. Usually we work our way up from index 0 but this program required us knowing what was at the end of the
string. From this lesson I will remember to always check the case. It is importnt when comparing Strings that you take
into account whether it is upper or lowercase because that will affect the results. Here the case didn't matter to us
so we converted both strings to lowercase so that we would be able to compare the characters fairly. 

*/