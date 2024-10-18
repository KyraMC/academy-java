package com.bptn.course._15_generics;

public class GenericsDemo2 {

	// Find maximum between 2 integers
	public static <T extends Comparable<T>> T findMaxGeneric(T num1, T num2) {
		if (num1.compareTo(num2) > 0) {
			return num1;
		} else {
			return num2;
		}
	}

	// Find maximum between 2 integers
	public static int findMax(int num1, int num2) {
//		if(num1 > num2) {
//			return num1;
//		}else {
//			return num2;
//		}

		return (num1 > num2) ? num1 : num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Max of 10 and 20: " + findMax(10, 20));
		System.out.println("Max of 10 and 20: " + findMaxGeneric(10, 20));
		System.out.println("Max of 10.8 and 20.02: " + findMaxGeneric(10.8, 20.02));

	}

}
