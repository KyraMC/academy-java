package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class VendingMachineSimulation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What product would you like? \n"
				+ "1. Chips - $2.25 \n"
				+ "2. Pretzels - $1.75 \n"
				+ "3. Juice - $2.75 \n"
				+ "4. Water - $2.50 \n"
				+ "5. Exit");
		
		int product = scan.nextInt();

		double money;
		boolean isRestart = false;
		String yesNo;
		
		do {
			switch(product) {
			case 1:
				System.out.println("How much money would you like to pay?");
				money = scan.nextDouble(); 
				
				if (money >= 2.25) {
					System.out.println("Your change is : $" + (money - 2.25));
					System.out.println("Enjoy your chips!");
				}else {
					System.out.println("Insuficient funds!");
				}
				System.out.println("Would you like to continue (y/n): ");
				yesNo = scan.next();
				if (yesNo == "y") {
					isRestart = true;
				}
				break;
				
			case 2:
				System.out.println("How much money would you like to pay?");
				money = scan.nextDouble();
				
				if (money >= 1.75) {
					System.out.println("Your change is : $" + (money - 1.75));
					System.out.println("Enjoy your pretzels!");
				}else {
					System.out.println("Insuficient funds!");
				}
				System.out.println("Would you like to continue (y/n): ");
				yesNo = scan.next();
				if (yesNo == "y") {
					isRestart = true;
				}
				break;
				
			case 3:
				System.out.println("How much money would you like to pay?");
				money = scan.nextDouble();
				
				if (money >= 2.75) {
					System.out.println("Your change is : $" + (money - 2.75));
					System.out.println("Enjoy your juice!");
				}else {
					System.out.println("Insuficient funds!");
				}
				System.out.println("Would you like to continue (y/n): ");
				yesNo = scan.next();
				if (yesNo == "y") {
					isRestart = true;
				}
				break;
				
				
			case 4:
				System.out.println("How much money would you like to pay?");
				money = scan.nextDouble();
				
				if (money >= 2.50) {
					System.out.println("Your change is : $" + (money - 2.50));
					System.out.println("Enjoy your juice!");
				}else {
					System.out.println("Insuficient funds!");
				}
				System.out.println("Would you like to continue (y/n): ");
				yesNo = scan.next();
				if (yesNo == "y") {
					isRestart = true;
				}
				break;
				
			case 5:
				System.out.println("Thanks or stopping by!");
				break;
				
			default:
				System.out.println("Not a valid Selection, try again!");
			}
		} while(isRestart);
		
		scan.close();
		
	}

}
