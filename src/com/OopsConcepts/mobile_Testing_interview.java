package com.OopsConcepts;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

public class mobile_Testing_interview {

     public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	    
	        long m = scanner.nextLong();
	        long n = scanner.nextLong();
	      
	        int count = countNumbers(m, n);
	        System.out.println(count);
	        
	        scanner.close();
	    }
	    
	    public static int countNumbers(long m, long n) {
	        int count = 0;
	        
	        for (long i = m; i <= n; i++) {
	            if (isPerfectSquare(i) && hasDigitPattern(i)) {
	                count++;
	            }
	        }  
	        return count;
	    }
	    
	    public static boolean isPerfectSquare(long num) {
	        long sqrt = (long) Math.sqrt(num);
	        return sqrt * sqrt == num;
	    }
	    
	    public static boolean hasDigitPattern(long num) {
	        String digits = String.valueOf(num);
	        int length = digits.length();
	        
	        for (int i = 0; i < length - 1; i++) {
	            int digit1 = digits.charAt(i) - '0';
	            int digit2 = digits.charAt(i + 1) - '0';
	            
	            if (i % 2 == 0 && digit1 >= digit2) {
	                return false;
	            } else if (i % 2 != 0 && digit1 <= digit2) {
	                return false;
	            }
	        }
	    
	        return true;
	    }

//	public static int solve(long M, long N) {
//		int count = 0;
//		for (long i = M; i <= N; i++) {
//			if (isPerfectSquare(i) && hasDigitPattern(i)) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static boolean isPerfectSquare(long num) {
//		long sqrt = (long) Math.sqrt(num);
//		return sqrt * sqrt == num;
//	}
//
//	public static boolean hasDigitPattern(long num) {
//		String digits = String.valueOf(num);
//		int length = digits.length();
//
//		for (int i = 0; i < length - 1; i++) {
//			int digit1 = digits.charAt(i) - '0';
//			int digit2 = digits.charAt(i + 1) - '0';
//
//			if (i % 2 == 0 && digit1 >= digit2) {
//				return false;
//			} else if (i % 2 != 0 && digit1 <= digit2) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		long M = Long.parseLong(bufferedReader.readLine().trim());
//		long N = Long.parseLong(bufferedReader.readLine().trim());
//
//		int outcome = solve(M, N);
//
//		bufferedWriter.write(outcome + "\n");
//
//		bufferedReader.close();
//	}
}
