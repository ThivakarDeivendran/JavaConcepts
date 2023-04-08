package com.OopsConcepts;

public class Capgemini_Interview_Class {
	static void toCharArrayMethod(){
		String a = "I am a automation tester Engineer Basketball workOut";
				char[] st = a.toCharArray();
				for(int i=0;i<st.length;i++){
				if(st[i]!=' '){
				System.out.print(st[i]);
				}
		}
	}
	public static void splitStringArrayMethod()
	{
		String a = "I am a automation tester";
		String[] stringArray=a.split(" ");
		for (String stringName: stringArray) {
			System.out.println(stringName);
		}
	}
	public static void main(String[] args) {
		splitStringArrayMethod();
		toCharArrayMethod();
		}
}
