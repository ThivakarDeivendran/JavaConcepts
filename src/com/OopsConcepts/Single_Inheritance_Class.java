package com.OopsConcepts;

public class Single_Inheritance_Class extends Program1 {
	public static void main(String[] args) {
		Single_Inheritance_Class v =new Single_Inheritance_Class();
		v.addition();
	}	
}
class Program1 {
		int ab = 12;
		int cd=23;
		String variable_Value ="BasketBall kit number: ";	
	void addition() {
		int total_Number = ab+cd;
		System.out.println(variable_Value + ab);
		System.out.println("total Addition value: "+ total_Number);
	}

}
