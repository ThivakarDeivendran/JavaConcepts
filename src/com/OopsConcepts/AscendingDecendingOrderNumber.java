package com.OopsConcepts;

public class AscendingDecendingOrderNumber {
	int a[]= {14,1,78,98,36,52,5,9,27};
	public void ascendingOrderNumber() {
		int temp;
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order");

		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]); 
			}

		/*for(int k=a.length-1;k>=0;k--) {
			System.out.println(a[k]);	
		}*/

		System.out.println("The Second largest number in Array is  " + a[a.length-2]);
		int middlenumber = a.length/2;
		System.out.println("The Middle number in Array is  " + a[middlenumber]);
	}
	public void decendingOrderNumber() {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]= temp;
				}
			}
		}
		System.out.println("Descending Order");
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}
	public static void main(String[] args) {
		AscendingDecendingOrderNumber a =new AscendingDecendingOrderNumber();
		//a.ascendingOrderNumber();
		//a.decendingOrderNumber();	
		double temp;
		double b[]= {1.24,2.26,0.28,8.89,8.00,9.26,1.55};
		for(int i=0;i<b.length;i++) {
			for(int j =i+1;j<b.length;j++) {
				if(b[i] > b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int m=0;m<b.length;m++) {
			System.out.println(b[m]);
		}
	}
}
