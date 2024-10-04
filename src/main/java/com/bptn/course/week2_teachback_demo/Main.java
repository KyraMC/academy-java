package com.bptn.course.week2_teachback_demo;

import com.bptn.course.week2_tb_demo_2.PublicModifier;
import com.bptn.course.week2_tb_demo_2.PrivatePublic;

public class Main {

	public static void main(String[] args) {

		// DEFAULT AND PRIVATE
		// Create AccessModifiers1 object
		DefaultPrivate defpriv = new DefaultPrivate(10, 15); // defaultInt = 10, privInt = 15

		// Print the instance variables
		System.out.println(defpriv.defaultInt);
//		System.out.println(defpriv.privInt);

		// Print instance variables using getters
		System.out.println(defpriv.getDefaultInt());
//		System.out.println(defpriv.getPrivInt());

		// Call print functions
		defpriv.defaultPrint(); 
//		defpriv.privPrint();

		
		// PROTECTED
		// Create AccessModifiers2 object
//		ProtectedModifier protect = new ProtectedModifier(4); // proInt = 4
//
//		// Print the instance variable
//		System.out.println(protect.proInt);
//
//		// Print instance variable using getter
//		System.out.println(protect.getProInt());
//
//		// Call print functions
//		protect.protectPrint();
////		

		
		// PUBLIC
		PublicModifier pub = new PublicModifier(6); // pubInt = 6

		// Print the instance variable
		System.out.println(pub.pubInt);

		// Print instance variable using getter
		System.out.println(pub.getPubInt());

		// Call print functions
		pub.publicPrint();

	}

}
