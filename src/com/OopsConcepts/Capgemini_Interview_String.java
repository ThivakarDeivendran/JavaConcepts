package com.OopsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Capgemini_Interview_String {
	public static void main(String[] args) {
		
		//asList_Method();collections_Method();forLoop_Method();
		string_Method();
	}
	public static void asList_Method() {
		String[] stringArray = {"thivakar","Basketball","testing","Automation"};
		List<String> arrayList = Arrays.asList(stringArray);
		System.out.println(arrayList);
	}
	public static void collections_Method() {
		String[] stringArray = {"thivakar","Basketball","testing","Automation"};
		List<String> arrayList = new ArrayList<>();
		Collections.addAll(arrayList, stringArray);
		System.out.println(arrayList);
	}
	public static void forLoop_Method() {
		String[] stringArray = {"thivakar","Basketball","testing","Automation"};
		List<String> arrayList = new ArrayList<>();
		for (String stringValueList : stringArray) {
			arrayList.add(stringValueList);
		}
		System.out.println(arrayList);
	}

	public static void string_Method() {
		String stringWords = "j3^ine9(){}er2809GNJI1995!@#";
		String integer = "";
		String character = "";
		String specialCharacter = "";
		for (int i = 0; i < stringWords.length(); i++) {
			char eachCharacter = stringWords.charAt(i);
			if ('0' <= eachCharacter && eachCharacter <= '9') {
				integer = integer + eachCharacter;
			} else if (('a' <= eachCharacter && eachCharacter <= 'z')
					|| ('A' <= eachCharacter && eachCharacter <= 'Z')) {
				character = character + eachCharacter;
			} else if (!('0' <= eachCharacter && eachCharacter <= '9')
					&& !(('a' <= eachCharacter && eachCharacter <= 'z')
							|| ('A' <= eachCharacter && eachCharacter <= 'Z'))) {
				specialCharacter = specialCharacter + eachCharacter;
			}
		}
		System.out.println("Numbers   " + integer);
		System.out.println("character  " + character);
		System.out.println("specialCharacter   " + specialCharacter);
	}
	
	public static void string_Method2() {
		String name ="gjndkj123%^$jfndn89876{}?><>";
		StringBuffer alpha = new StringBuffer();
		StringBuffer number = new StringBuffer();
		StringBuffer special = new StringBuffer();
		for(int i=0;i<name.length();i++) {
			if(Character.isDigit(name.charAt(i))) {
				number=number.append(name.charAt(i));
			}else if(Character.isAlphabetic(name.charAt(i))) {
				alpha = alpha.append(name.charAt(i));
			}else {
				special =special.append(name.charAt(i));
			}
		}
		System.out.println("alpha    "  + alpha);
		System.out.println("number    "  + number);
		System.out.println("special    "  + special);
	}
	public static void reverseTheString() {
		String s = "im test engineer in tss office PIL india ghg ghgh 1112 rw ^&^% ghghg nkjkj";
		String[] split = s.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			char[] name = split[i].toCharArray();
			for (int j = name.length - 1; j >= 0; j--) {
				System.out.print(name[j]);
			}
		}
	}
	
}