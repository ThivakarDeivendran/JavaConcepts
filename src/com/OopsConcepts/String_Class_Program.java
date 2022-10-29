package com.OopsConcepts;

public class String_Class_Program {
		  public static void main(String[] args) {
			String name = "Thivakar";
			String designation = new String("Automation Engineer");
			
			System.out.println("name Length : " +name.length());
			System.out.println("Equals  : " + name.equals(designation));
			System.out.println("hasCode Value  : "+ name.hashCode());
			System.out.println("identity hasCode Value  : "+ System.identityHashCode(name));
			System.out.println("concatValue : " +name.concat(designation));
			System.out.println("EqualsIgnoreCase : " + designation.equalsIgnoreCase(designation));
			System.out.println("toUpperCase : " +name.toUpperCase());
			System.out.println("toLowerCase : " +designation.toLowerCase());
			System.out.println("StartWith : " +name.startsWith("Thi"));	
			System.out.println("EndsWith : " +designation.endsWith("R"));
			System.out.println("Contains : " +designation.contains(" "));
			System.out.println("indexOfValue : " +name.indexOf('a'));
			System.out.println("lastIndexOfValue: " +designation.lastIndexOf('n'));
			System.out.println("CharacterAT : " +name.charAt(4));
			System.out.println("Replace : " +name.replace('r', 'R'));
			System.out.println("ReplaceALL : " +designation.replaceAll(designation, "Scrum Master"));
			System.out.println("SubString : " +name.substring(3));
			System.out.println("isEmpty Value : " +name.isEmpty());
			System.out.println("Split :" +  name.split(name));
			System.out.println("Trim : " +designation.trim());
			System.out.println("Name : " +  name);
			System.out.println("hasCode Value  : "+ name.hashCode());
			System.out.println(" identity hasCode Value  : "+ System.identityHashCode(name));
			System.out.println("hasCode Value  : "+ designation.hashCode());
			System.out.println(" identity hasCode Value  : "+ System.identityHashCode(designation));
			
			
			
		}
}
