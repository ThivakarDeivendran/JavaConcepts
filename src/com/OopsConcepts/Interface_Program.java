package com.OopsConcepts;

public class Interface_Program implements Program7, Java_Program{
			public static void main(String[] args) {
				Interface_Program ip =new Interface_Program();
				ip.java_Method();
				ip.javaInterfaceMethod();
			}
			@Override
			public void java_Method() {
			System.out.println("Java_Program Interface");	
			}
			@Override
			public void javaInterfaceMethod() {
				System.out.println("Program7 Interface");
				System.out.println("program to update for github");
			}			
}
interface Program7 extends Java_Program{
	void javaInterfaceMethod();	
}
interface Java_Program{
	  void java_Method();
}