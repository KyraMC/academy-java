package com.bptn.course._01_BIg_Coding;


import java.util.Scanner; 

public class WordEncryption {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scan = new Scanner(System.in);
		
		//Ask user what word they want to encrypt
		System.out.println("Enter the word you would like to encrypt: ");
		String word = scan.nextLine();
		String encrypted = "";
		
		// Loop through each character in the string
		for (int i = 0; i < word.length(); i++) {
			// stores the letter we are currently indexed at
			char oldLetter = word.charAt(i);
			
			//if the letter is [A-Z) or [a-z)
			if((oldLetter >='A' && oldLetter <'Z') || (oldLetter >= 'a' && oldLetter <'z')) {
				// Add 1 to the ASCII value and turn it back into a char and append that to the String encrypted
				encrypted += (char)(oldLetter + 1);
			// If the letter is a Z, add an A to encrypted
			} else if (oldLetter == 'Z') {
				encrypted += 'A';
			//If the letter is a z, add an a to encrypted
			} else if (oldLetter == 'z') {
				encrypted += 'a';
			//if the character is non-alphabetic, add it on to encrypted as is.
			} else {
				encrypted += oldLetter;
			}
		}
		
		System.out.println("Encrypted word: " + encrypted); // print encrypted word
		scan.close(); // close scanner to avoid leaks

	}

}

/* SUMMARY
In this program we had to encrypt a word by shifting each letter of the word up one position of the alphabet, and if the character was
non-alphabetic we did not change it. We performed this task by looping through the the index of each character in the string and determining 
if it was alphabetic or not. If it was alphabetic, we would shift the letter by adding 1 to the character as Java will read that as adding 1
to the ASCII value. We then turn the ASCII back into a character and append that to the string we will output. There are special cases if 
the letter is a z or Z and that is because adding 1 to the ASCII will not bring it back to a or A. In these cases, we instead tell the program to 
append an a if the character was z and an A if it was Z. And if the character is non-alphabetic, we append it as is.

This program is different because previously when working with ASCII we did not have to take in the end cases of whether the character was alphabetic
or not. In the future, I will always make sure to check whether the type of character matters so that I can account for these special cases.
 */
