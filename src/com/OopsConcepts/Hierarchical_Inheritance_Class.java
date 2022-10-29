package com.OopsConcepts;

  class Inheritance1 {
    void hierarchicalInheritanceMethod() {
	System.out.println("Hierarchical inheritance method in inheritance class");
  }
}
  class Inheritance2 extends Inheritance1{
		void inheritanceMethod2() {
			System.out.println("Inheritance2");
		}
	}
 public class Hierarchical_Inheritance_Class  extends Inheritance1 {
	void inheritanceMethod1() {
		System.out.println("Inheritance1 Method");
	}
	public static void main(String[] args) {
		Hierarchical_Inheritance_Class hic =new Hierarchical_Inheritance_Class();
		hic.hierarchicalInheritanceMethod();
		hic.inheritanceMethod1();
		
	}
	
}
