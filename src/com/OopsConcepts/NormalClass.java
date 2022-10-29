package com.OopsConcepts;


abstract class AbstractClass {
     abstract void firstMethod();
}
 abstract class AbstractClassTwo extends AbstractClass{
     abstract void secondMethod();
   
}
 public class NormalClass extends AbstractClassTwo {
	 public static void main (String[] args) {
		 NormalClass normal =new NormalClass();
		 normal.firstMethod();
		 normal.secondMethod();
	 }
	 @Override
		void firstMethod() {
				System.out.println("firstMethod in AbstractClass");
		}
	@Override
	void secondMethod() {
		System.out.println("secondMethod in AbstractClassTwo");
	}
	
	
 }
	
