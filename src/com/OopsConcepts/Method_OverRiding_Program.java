package com.OopsConcepts;

public class Method_OverRiding_Program extends Program {
	public static void main(String[] args) {
		Method_OverRiding_Program m = new Method_OverRiding_Program();
		m.methodTesting();
		m.overRideMethod();
		m.checkMethod("MethodOverRide involving checkMethod");
	}

	@Override
	void methodTesting() {
		System.out.println("Class having methodOVerRide Method");
	}

	@Override
	void overRideMethod() {
		System.out.println("Method Changed ");
	}

	@Override
	void checkMethod(String s) {
		super.checkMethod(s);
	}
}

abstract class Program {
	void overRideMethod() {
		System.out.println("overRide to other Method");
	}

	abstract void methodTesting();

	void checkMethod(String string) {
		System.out.println(string);
	}
}
