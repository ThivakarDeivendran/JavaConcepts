package com.OopsConcepts;

import java.util.ArrayList;
import java.util.List;

public class EvenStringList {

	public static void main(String[] args) {
		String name = "Testing Engineer";
		List<Character> evenCharacter = new ArrayList<>();
		char[] ch = name.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			if (i % 2 != 0) {
				evenCharacter.add(ch[i]);
			}
		}
		System.out.print(evenCharacter);
	}

}
