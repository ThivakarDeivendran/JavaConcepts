package com.OopsConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class ReturnStringWithLamdaExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalSize = sc.nextInt();
		Map <String, String> map = new HashMap<>();	
		for(int i=0;i< totalSize;i++) {
			String a = sc.next();
			String b = sc.next();
			
			map.put(a, b);		
			}	
		   intaratorMethod (map, totalSize);
	}
	        public static void intaratorMethod (Map map, int totalSize) {
	        	Set<Entry<String, String>> wordSet = map.entrySet();
				for(Entry<String,String> entryName : wordSet) {	
					String key1 = entryName.getKey();
					String key2 = entryName.getValue();
					System.out.println(key1 + " -> " + key2);	
					}
	        }
}
