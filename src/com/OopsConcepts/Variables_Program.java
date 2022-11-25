package com.OopsConcepts;

public class Variables_Program {
	int num =2;
	static int number =12;
	void numberMethod() {
		num=45;
		System.out.println(num);
		System.out.println(number);
	}
	void localVariableMethod() {
		String s= "Local Variable";
		System.out.println(s);
	}
	static void staticmethod() {
		boolean b= false;
		System.out.println(b);
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		Variables_Program variableName = new Variables_Program();
		System.out.println(number);
		System.out.println(variableName.num);
		variableName.numberMethod();
		Variables_Program.staticmethod();
		
		System.out.println("git updation");
	}
}
