package com.OopsConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class Oops_Day3 {

	public void Nike() {
		System.out.println("Nike Basketball shoe");
	}
	public void Reebok() {
		System.out.println("Reebok company");
		}
	public void Adidas() {
		System.out.println("Adidas Track");
	}
	public void Swiggy() {
		System.out.println("Swiggy Food");
	}
	public void Flipkart() {
		System.out.println("Flipkart Product");
	}
	
	
	public static void main(String[] args) {
		Oops_Day3 onlineShopping =new Oops_Day3();
//		onlineShopping.Flipkart();
//		onlineShopping.Swiggy();
//		onlineShopping.Adidas();
//		onlineShopping.Reebok();
//		onlineShopping.Nike();
		
		arrayList();

	}
	
	
	
	public static void arrayList()
	{
		Integer arr[] = {1,2,3,4,5,6};  
		//System.out.println("Array:"+Arrays.toString(arr));  
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));  
		arrayList.add(7);  
		System.out.println("fjndknfadj"+arrayList);
		arr = arrayList.toArray(arr);  
		System.out.println(arr);
		//System.out.println("Array after adding element: "+Arrays.toString(arr));  
		  
	}
}
