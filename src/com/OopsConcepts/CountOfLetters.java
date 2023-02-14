package com.OopsConcepts;

public class CountOfLetters {
	
	public static void countOfCapSmallLetters()
	{
		String name ="Welcome 2 QA Test Engineer@#$";
		int smallCount=0,capsCount=0,numberCount=0,countOfSpecialCharacters=0;
		for(int i=0;i<name.length();i++){
			if('a'<= name.charAt(i)&& name.charAt(i)<='z') {
				 smallCount++;
			}else if ('A'<= name.charAt(i)&& name.charAt(i)<='Z') {
				capsCount++;	
			}else if ('0'<= name.charAt(i)&& name.charAt(i)<='9') {
				numberCount++;
			}else {
				countOfSpecialCharacters++;
			}
		}
		System.out.println("total number of Small Letters : " +smallCount);
		System.out.println("total number of Capital Letters : " + capsCount);
		System.out.println("total count of numeric : " + numberCount);
		System.out.println("total number of SpcialCharacters : " +countOfSpecialCharacters);
	}	
	public static void main(String[] args) {
		countOfCapSmallLetters();			
		
	}

}
