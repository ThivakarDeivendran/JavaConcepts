package com.OopsConcepts;

class Inheritance{
	public void inheritanceMethod() {
		System.out.println("Inheritance class ");
	}
}
class Encapsulation extends Inheritance{
	public void encapsulationMethod() {
			System.out.println("Encapsulation class");
		}
}
public class Multi_Inheritance_Program extends Encapsulation{
	public static void main(String[] args) {
		Multi_Inheritance_Program multi = new Multi_Inheritance_Program();
		multi.encapsulationMethod();
		multi.inheritanceMethod();
	}
}