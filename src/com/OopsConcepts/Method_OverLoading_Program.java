package com.OopsConcepts;

public class Method_OverLoading_Program {
	
		void interview() {
			System.out.println("Method overloading without parameters");
		}
		void interview(int a) {
			this.interview();
			System.out.println("Method overloading with int parameter");
			}
		void interview(boolean b) {
			this.interview(5);
			System.out.println("Method overloading with boolean parameter");
		}
		void interview(char c) {
			this.interview(false);
			System.out.println("Method overloading with char parameter");
		}
		void interview(float f) {
			this.interview('c');
			System.out.println("Method overloading with float parameter");
		}
		
		public static void main(String[] args) {
			Method_OverLoading_Program overLoadingProgram =new Method_OverLoading_Program();
			overLoadingProgram.interview(1.23f);		
		}
}
