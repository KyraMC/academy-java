package com.bptn.course._05_strings;

//new comment
public class Strings {

	public static void main(String[] args) {
		//String userName = "testuser";
		String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
		int index = 1;
		System.out.println(names[index]); 
		System.out.println(names[index-1]);    
		index++;
		System.out.println(names[index]);  
		index--;
		System.out.println(names[index]);
		System.out.println(names[names.length-1]);
		
		for (int i = 0; i < names.length; i++) {
            		System.out.println(names[i]);
        }
	}
}
