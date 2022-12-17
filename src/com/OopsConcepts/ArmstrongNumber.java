package com.OopsConcepts;

public class ArmstrongNumber {
	public static void checkArmStrongNumber(int a) {
		int num = a; 
		int newnum=0;
		int temp= num;
		while(num>0) {
			int reverse = num %10;
			newnum =newnum + (reverse*reverse*reverse);
			num =num/10;
		}
		if(temp==newnum) {
			System.out.println(temp +" is a armstrongNumber");

		}
		else {
			System.out.println(temp +" is  not a armstrongNumber");
		}
	}
	public static void main(String[] args) {
		checkArmStrongNumber(407);
		checkArmStrongNumberRange();
	}

	public static void checkArmStrongNumberRange() {
		int count =0;
		for(int i=1;i<10000;i++) {
			int num =i;
			int newNumber =0;
			while (num>0) {
				int reverse =num%10;
				newNumber =newNumber +(reverse*reverse*reverse*reverse);
				num=num/10;
			}if(newNumber==i) {
				System.out.println("The armstrongNumber is " + i);
				count++;
			}
		}
		System.out.println("The armStrongNumber is " + count );
	}
}
