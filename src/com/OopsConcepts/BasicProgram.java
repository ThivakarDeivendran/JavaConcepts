package com.OopsConcepts;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

public class BasicProgram {


	static void testing() {
		System.out.println("testing static method");
	}

	void testing2() {
		System.out.println("testing non static method");
	}
	static DecimalFormat decimalFormat;
	public static void main(String[] args) {
		String s =new String ("Ster");
		/*int num[] = {1,3,4,1,4,2,6,1,3};	
			int length = num.length;
			int temp[] =new int[length];
			int j=0;
			for (int i = 0; i < length-1; i++) {
				if (num[i]!=num[i+1]) {
					temp[j++] =num[i];
				}
			}
			temp[j++]=num[length-1];
			for (int i = 0; i < j; i++) {
				num[i]=temp[i];
			}
			length=j;
			for (int i = 0;i < length;i++) {
			System.out.println(num[i] );
			}
		}*/


		//for continue Keyword
		/*int i = 0;
	    while (i < 10) {
	      if (i == 2) {
	        i=i+5;
	        continue;
	      }
	      System.out.println(i);
	      i++;
	    }*/  

		//exact value in console
		//double d =5.00;
		//Double ddd =5.00;
		//System.out.println("double d value is  "+ddd);

		/*Scanner s =new Scanner (System.in);
		System.out.println("enter");
		double dd = s.nextDouble();
		System.out.println(dd);*/


		//Double dd = new Double(d);
		//System.out.println(dd);

		//String ss = "5.00";
		//float  ds = Float.parseFloat(ss);
		//System.out.println(ds);




		// String value = String.format("%.2f", a);

		//double.format("%.2f", a);
		//System.out.println(value);
		//double dou = Double.parseDouble(value);
		//System.out.println("String value" + dou);


		/*Formatter fm=new Formatter();

		// Format 4 decimal places
		Formatter dmmmm =fm.format("%.2f", 5.000);
		System.out.println("fmmmmmm"+ fm);
		fm.close();

		double d = 5.00;
		final DecimalFormat dfdd = new DecimalFormat("0.00");

		dfdd.format(d);
		String dddd =dfdd.format(d);
		System.out.println(dddd);

		System.out.println("Double upto 2 decimal places: %.2f"+  d);
		double dnumber=5.00;
		NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);


		 decimalFormat= new DecimalFormat("##.00");
		double ddeci = 505;
		double dou = Double.parseDouble(decimalFormat.format(ddeci));
		System.out.println(dou);*/
		
		int i=1;
		for(;;)//infinite loop
			{
			System.out.println(i++);
			System.out.println("testing");
		}
	

	}
}