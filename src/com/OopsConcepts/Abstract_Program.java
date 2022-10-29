package com.OopsConcepts;

public class Abstract_Program extends Program12{
	public static void main(String[] args) {
		Abstract_Program ap= new Abstract_Program();
		   ap.methodabstract();
		   ap.methodProgram();
	}
	@Override
	public void methodabstract() {
		System.out.println("methodabstract in class Program12");
	}
	@Override
	public void methodProgram() {
		System.out.println("methodProgram in class Program2");
	}
}
 abstract class Program12 extends program2{
	 public abstract void  methodabstract();	
}
abstract class program2{
	public abstract void methodProgram();
}
