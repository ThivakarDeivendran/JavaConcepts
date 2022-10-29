package com.OopsConcepts;

 class Access_Modifier {
	
				private char character ='T';
				protected boolean boo =true;
				
			 void method_Testing() {
					String test ="Automation Testing";
					System.out.println(test);
				}
				public void Access_World() {
					System.out.println("public access modifier will access anywhere");
					System.out.println(character);
					System.out.println("boolean value : " +boo);
				}
}
public class Test_Access_Modifier extends Access_Modifier{
				public static void main(String[] args) {
					Test_Access_Modifier  modifierName =new Test_Access_Modifier();
					modifierName.method_Testing();
					System.out.println(modifierName.boo);	
					modifierName.Access_World();
				}
}
