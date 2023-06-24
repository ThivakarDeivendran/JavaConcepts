package com.OopsConcepts;
import java.util.Scanner;

public class Delotile_Task_Program {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of digits (N): ");
	        int N = scanner.nextInt();

	        System.out.print("Enter the digit (d): ");
	        int d = scanner.nextInt();

	        int result = sumNDigitPrimesWithMostOccurrences(N, d);
	        System.out.println("Sum of all " + N + "-digit prime numbers where " + d + " appears the most: " + result);

	        scanner.close();
	    }

	    public static int sumNDigitPrimesWithMostOccurrences(int N, int d) {
	        int sumPrime = 0;
	        int maxCount = 0;

	        int start = (int) Math.pow(10, N - 1); // Smallest N-digit number
	        int end = (int) Math.pow(10, N); // Largest N-digit number

	        for (int number = start; number < end; number++) {
	            if (isPrime(number)) {
	                int digitCount = countDigit(number, d);
	                if (digitCount > maxCount) {
	                    maxCount = digitCount;
	                    sumPrime = number;
	                } else if (digitCount == maxCount) {
	                    sumPrime += number;
	                }
	            }
	        }

	        return sumPrime;
	    }

	    public static boolean isPrime(int number) {
	        if (number < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static int countDigit(int number, int digit) {
	        int count = 0;
	        while (number != 0) {
	            int remainder = number % 10;
	            if (remainder == digit) {
	                count++;
	            }
	            number /= 10;
	        }
	        return count;
	    }

}
