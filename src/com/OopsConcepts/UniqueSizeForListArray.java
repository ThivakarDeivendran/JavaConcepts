package com.OopsConcepts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UniqueSizeForListArray {
	
	
	
	    public static void main(String[] args) {
	        List<Integer> inputList = new ArrayList<>();
	        inputList.add(1);
	        inputList.add(1);
	        inputList.add(1);
	        inputList.add(1);
	        inputList.add(1);

	        Set<Integer> uniqueSet = new HashSet<>(inputList);
	        
	        
	        //List<Integer> resultList = new ArrayList<>(uniqueSet);
	        //System.out.println("Filtered List: " + resultList);
	        
	        
	        System.out.println("Size of the Filtered Set: " + uniqueSet.size());
	    }
}
