package com.bptn.course._01_BIg_Coding;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		//initialize scanner 
		Scanner scan = new Scanner(System.in);
		
		// ask user for an integer and word they would like to pluralize
		System.out.println("# in: ");
		int amt = scan.nextInt();
		scan.nextLine();
		System.out.println("word: ");
		String word = scan.nextLine();
		
		// create variables of the last 2 letters or the last letter of the string, so easier to compare
		String last2Letters = word.substring(word.length() - 2);
		String last1Letter = word.substring(word.length() - 1);
		
		// String that will hold the pluralized version of the input
		String plural;
		
		// If the amount is 1, don't pluralize the word
		if (amt == 1) {
			System.out.println(amt + " " + word);
		
		// If amount is a non-negative
		}else if(amt >= 0) {
			
			// if it ends in fe
			if(last2Letters.equals("fe")) {
				plural = word.replace(last2Letters, "ves");
				System.out.println(amt + " " + plural);
				
			// if it ends in sh or ch
			}else if (last2Letters.equals("sh") || last2Letters.equals("ch")) {
				plural = word + "es";
				System.out.println(amt + " " + plural);
			
			//if it ends in us
			}else if (last2Letters.equals("us")) {
				plural = word.replace(last2Letters, "i");
				System.out.println(amt + " " + plural);
				
			// if it ends in ay or oy or ey or uy
			}else if (last2Letters.equals("ay") || last2Letters.equals("oy") || last2Letters.equals("ey") || last2Letters.equals("uy")) {
				plural = word + "s";
				System.out.println(amt + " " + plural);
				
			// if it ends in y
			}else if(last1Letter.equals("y")) {
				plural = word.replace(last1Letter, "ies");
				System.out.println(amt + " " + plural);
			
			// if it doesn't meet any other conditions just add an s to the end
			}else {
				plural = word + "s";
				System.out.println(amt + " " + plural);
			}
			
		}
		scan.close(); // close scanner to avoid leaks

	}

}

/* SUMMARY
 * 
 * This program takes an amount and a string input and pluralizes the word based on the amount and grammar conventions.
 * It does this through if statements and nested if statements. This task had new concepts because the ending of the string
 * had to be changed to match the proper pluralization technique, and to accomplish this I used the .replace() method. In the 
 * past we altered a string by creating an empty string and looping through the original's characters and appending each letter
 * to the empty string while we performed the modification. Using the replace method allowed us to skip having to looping through
 * characters that didn't need modification and just change the ending of the word. An issue I ran into along the way was comparing
 * the strings using == instead of .equals(). Doing this was creating false negatives, and I was quickly able to rectify the mistake.
 * In the future I will remember to always be conscious of whether == or .equals() would be appropriate when comparing strings.
 */
