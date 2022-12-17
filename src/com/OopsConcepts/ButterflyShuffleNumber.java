package com.OopsConcepts;

public class ButterflyShuffleNumber extends BasicProgram {

	/*@Override
	static void testing() {
		super.testing();
	 System.out.println("thivakar");	
	}*/

	@Override
	void testing2()
	{
		super.testing2();
	}	


	public static void main(String[] args) {

		int a[] = {1,3,5,7,9,11,13,15};
		int halfLength = a.length/2;
		for(int i=a.length-1;i>=halfLength;i--) {
			System.out.println(a[i]);
		}
		for(int i=0;i<=halfLength-1;i++) {
			System.out.println(a[i]);
		}
	}
}
