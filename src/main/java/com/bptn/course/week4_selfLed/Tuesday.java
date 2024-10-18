package com.bptn.course.week4_selfLed;

public class Tuesday {

	public static void main(String[] args) {
//		int var1 = 0;
//		int var2 = 2;
//
//		while ((var2 != 0) && ((var1 / var2) >= 0)) {
//			var1 = var1 + 1;
//			var2 = var2 - 1;
//		}
//		System.out.println(var1 + " " + var2);

//		int x = 2;
//		int y = 5;
//
//		while (y > 2 && x < y) {
//			x = x + 1;
//			y = y - 1;
//		}
//		System.out.println(x + " " + y);

//		for (int i = 3; i < 8; i++) {
//			for (int y = 1; y < 5; y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 2; i < 8; i++) {
//			for (int y = 1; y <= 5; y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 3; i <= 9; i++) {
//			for (int j = 6; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		int i = 0;
//		while (i <= 4) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println("Hi!");
//			}
//			i++;
//		}
		int[] elements = { 1, 4, 6, 3, 7 };

		for (int j = 0; j < elements.length - 1; j++) { // line 1
			int minIndex = j; // line 2
			for (int k = 0; k < elements.length; k++) { // line 3
				if (elements[k] < elements[minIndex]) { // line 4
					minIndex = k; // line 5
				}
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp;
		}
		for (int elem : elements) {
			System.out.println(elem);
		}
	}

}
