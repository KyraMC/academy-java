package com.bptn.course.week4_selfLed;

public class Mystery {

//	public static int mystery(int n) {
//		if (n == 0)
//			return 1;
//		else
//			return 2 * mystery(n - 1);
//	}

	public static void mystery(int x) {
		System.out.print(x % 10);

		if ((x / 10) != 0) {
			mystery(x / 10);
		}
		System.out.print(x % 10);
	}

	public static int mystery(int n, int a) {
		if (n == 1)
			return a;
		return a * mystery(n - 1, a);
	}

	public static int mystery(String str) {
		if (str.length() == 1)
			return 0;
		else {
			if (str.substring(0, 1).equals("y"))
				return 1 + mystery(str.substring(1));
			else
				return mystery(str.substring(1));
		}
	}

	public static void main(String[] args) {
//		System.out.println(mystery(5));
		System.out.println(mystery(4, 3));
//		mystery(1234);
//		System.out.println(mystery("xyzxyxy"));

	}

}
