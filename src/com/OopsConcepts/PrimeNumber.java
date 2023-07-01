package com.OopsConcepts;

import java.util.Scanner;

//public class PrimeNumber {
//	public static void main(String[] args) {
//		Scanner inputnumber = new Scanner(System.in);
//		System.out.println("input the number");
//		int number =inputnumber.nextInt();
//		int tempnumber =0;
//		for(int i=2;i<number;i++) {
//			if(number%i==0) {
//				tempnumber =1;
//				break;
//			}	
//		}
//		System.out.println(number + ((tempnumber==1)?" is not a prime number":" is a prime number"));
//	}
//}
public class PrimeNumber{
//    public static int changeAds(int base10) {
//        String binary = Integer.toBinaryString(base10);
//        binary = binary.replaceAll("1*$", ""); 
//
//        StringBuilder flippedBinary = new StringBuilder();
//        for (char bit : binary.toCharArray()) {
//            if (bit == '0') {
//                flippedBinary.append('1');
//            } else {
//                flippedBinary.append('0');
//            }
//        }
//
//        return Integer.parseInt(flippedBinary.toString(), 2); 
//    }
//
//    public static void main(String[] args) {
//        // Test cases
//        System.out.println(changeAds(50)); 
//        System.out.println(changeAds(100));;}
	
	
	    public static void main(String[] args) {
	        int[] numbers1 = {1, 1, 1, -5};
	        int[] numbers2 = {0, 0, 2, 3, 7, 1};
	        
	        int sum1 = calculateSum(numbers1);
	        int sum2 = calculateSum(numbers2);
	        
	        System.out.println(sum1); // Output: -2
	        System.out.println(sum2); // Output: 13
	    }
	    
	    public static int calculateSum(int[] arr) {
	        int sum = 0;
	        
	        for (int num : arr) {
	            sum += num;
	        }
	        
	        return sum;
	    }
}
//	class Test{
//
//		 static{
//
//		System.out.println("Hi there");
//
//		
//
//		System.exit(0);
//		 }
// }



//import java.util.*;
//
//class stack
//
//{
//
//	public static void main(String args[]) {
//
//		Stack<Integer> obj = new Stack<>();
//
//		obj.push(3);
//
//		obj.push(2);
//
//		obj.pop();
//
//		obj.push(5);
//
//		System.out.println(obj);
//	}
//}