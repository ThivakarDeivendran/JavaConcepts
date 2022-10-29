package com.OopsConcepts;

interface ClassRoom{
	public abstract void testManagement();
}

interface Automation{
	void testMethodology();
}

public class JavaInterfaceClass implements ClassRoom,Automation{

	@Override
	public void testMethodology() {
System.out.println("Agile is a Test Methodology");
		
	}

	@Override
	public void testManagement() {
		System.out.println("Quality Centre is a Testmanagement Tool");
	}
	public static void main(String[] args) {
		JavaInterfaceClass variableName =new JavaInterfaceClass();
		variableName.testManagement();
		variableName.testMethodology();
	}
}
