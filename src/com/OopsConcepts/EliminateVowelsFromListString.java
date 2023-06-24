package com.OopsConcepts;

import java.util.ArrayList;
import java.util.List;

public class EliminateVowelsFromListString {
	static char[] eachValueArray;
	static String newValue="";
	static String eachValue ="";
	public static void main(String[] args) {
		
		List stringValue = new ArrayList();
		stringValue.add("ppse");
		stringValue.add("mnm");
		stringValue.add("yyu");
		stringValue.add("www");
		stringValue.add("iouk");
		//System.out.println(stringValue);
		for(int i=0;i<=stringValue.size()-1;i++) {
			eachValue = stringValue.get(i).toString();
			//System.out.println(eachValue);
			for(int j=0;j<eachValue.length();j++) {
				if(eachValue.charAt(j)=='a'||eachValue.charAt(j)=='e'||eachValue.charAt(j)=='i'||eachValue.charAt(j)=='o'||eachValue.charAt(j)=='u')
				{
					
				}
				break;
			}
			System.out.println(eachValue);
			}
		}
//		String s = "AEIOUaeioufg";
//		String str="";
//		for (int i = 0; i < s.length(); i++)
//		{
//		if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' &&
//		s.charAt(i)!='u' && s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' &&
//		s.charAt(i)!='O' && s.charAt(i)!='U')
//		{
//		str=str+s.charAt(i);
//		} }
//		System.out.println(" "+str); 
		
		
}
