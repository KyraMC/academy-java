package com.bptn.course.week2_tb_demo_2;

public class PublicModifier {
	
	public int pubInt;
	
	public PublicModifier(int pubInt) {
		this.pubInt = pubInt;
	}
	
	public int getPubInt() {
		return pubInt;
	}
	
	public void publicPrint() {
		System.out.println("This is pubInt: " + pubInt);
	}

}
