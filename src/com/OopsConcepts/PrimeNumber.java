package com.OopsConcepts;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner inputnumber = new Scanner(System.in);
		System.out.println("input the number");
		int number =inputnumber.nextInt();
		int tempnumber =0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				tempnumber =1;
				break;
			}	
		}
		System.out.println(number + ((tempnumber==1)?" is not a prime number":" is a prime number"));
	}
	 
 }
