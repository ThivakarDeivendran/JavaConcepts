package com.OopsConcepts;

public class Constructor_Overloading_Class {
		Constructor_Overloading_Class(){
			System.out.println("Constructor_Overloading_Class without parameter");
		}
		Constructor_Overloading_Class(int i){
			this();
			System.out.println("Constructor_Overloading_Class with int parameter: " +i);
		}
		Constructor_Overloading_Class(boolean b, char c){
			this(5);
			System.out.println("Constructor_Overloading_Class with boolean and char parameter: " + b +  c);
		}
		Constructor_Overloading_Class(String s){
			this(true,'T');
		System.out.println("Constructor_Overloading_Class with String parameter: " + s);
		
		}
		public static void main(String[] args) {
			Constructor_Overloading_Class COC = new Constructor_Overloading_Class("Greens");
		}
}
