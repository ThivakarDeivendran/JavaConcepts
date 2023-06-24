package com.OopsConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PrimeNumberCount {
	static int i;
	public static void main (String[] args) {
		int  arr[]= {47,45,47,17,1,3,4,5,6,7,8,9,13,17,15,2,43,77,79,79,79,79};
		List<Integer> listOfNumber = new ArrayList<Integer>();
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==1||arr[j]==2) {
				continue;
			}
			int tempnumber =0;
			for( int i=2;i<arr[j];i++) {
				 if(arr[j]%i==0) {
					tempnumber =1;
					break;
				}	
			}
			if(tempnumber==0) {
				//System.out.println(arr[j] + " is a prime number");
					listOfNumber.add(arr[j]);
			}
		}
		Map<Integer, Integer> nameMap =new HashMap<Integer, Integer>();
		for(int eachName : listOfNumber) {
			if(!nameMap.containsKey(eachName)) {
				nameMap.put(eachName, 1);
			}else {
				nameMap.put(eachName,nameMap.get(eachName)+1);
			}
		}
		System.out.println(nameMap);
		System.out.println("No of Unique Prime Number : "+ nameMap.size());
		

		System.out.println("Duplicate Numbers");
		Set<Entry<Integer,Integer>> nameSet =nameMap.entrySet();
		for(Entry<Integer,Integer> entry:nameSet) {
			if(entry.getValue()>1) {
				Integer key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+"  =" + value);
			}
			
			
		}
	}
}
