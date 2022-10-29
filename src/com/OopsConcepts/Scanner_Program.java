package com.OopsConcepts;

import java.util.Scanner;

public class Scanner_Program {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Pin number: ");
		int pinnumber =scan.nextInt();
		System.out.println("Enter the amount: ");
		int amount =scan.nextInt();
		System.out.println("Confirm Message: ");
		boolean message =scan.nextBoolean();
		System.out.println("Amount Withdrawl succefully ");
	}


}
