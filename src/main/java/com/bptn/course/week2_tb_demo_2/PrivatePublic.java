package com.bptn.course.week2_tb_demo_2; // Different Package

import com.bptn.course.week2_teachback_demo.ProtectedModifier; //import AccessModifiers2

public class PrivatePublic  extends ProtectedModifier{ // Inherit AccessModifiers2
	
	// Can access protected constructor through inheritance
	protected PrivatePublic(int proInt) {
		super(proInt);
		
	}

	public static void main(String[] args) {
		
		// PROTECTED MODIFIER
		PrivatePublic protect = new PrivatePublic(4); // proInt = 4

		// Print the instance variable
		System.out.println(protect.proInt);

		// Print instance variable using getter
		System.out.println(protect.getProInt());

		// Call print functions
		protect.protectPrint();
		
//		
//		// Public Modifier
		PublicModifier pub = new PublicModifier(6); //pubInt = 6
		
		// Print the instance variable
		System.out.println(pub.pubInt);
		
		// Print instance variable using getter
		System.out.println(pub.getPubInt());
		
		// Call print functions
		pub.publicPrint();

	}

}
