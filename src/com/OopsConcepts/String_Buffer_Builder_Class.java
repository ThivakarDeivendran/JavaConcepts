package com.OopsConcepts;

public class String_Buffer_Builder_Class {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Thivakar");
		StringBuffer game = new StringBuffer("Thivakar");
		StringBuilder color = new StringBuilder("Thivakar");
		
		System.out.println("name Length : " +name.length());
		System.out.println("Equals  : " + name.equals(game));
		System.out.println("SubString : " +name.substring(3));
		System.out.println("hasCode Value  : "+ name.hashCode());
		System.out.println("appendValue : " +name.append(game));
		System.out.println("name Length : " +name.length());
		System.out.println("hasCode Value  : "+ name.hashCode());
		System.out.println("lastIndexOfValue: " +game.lastIndexOf("B"));
		System.out.println("CharacterAT : " +color.charAt(4));
		System.out.println("indexOfValue : " +name.indexOf("k"));
		System.out.println("SubString : " +name.substring(3));
		//System.out.println("isEmpty Value : " +nameisEmpty());
		System.out.println("EqualsIgnoreCase : " + game.toString());
		System.out.println("Replace : " +name.replace(1, 5, "www"));
		//System.out.println("toUpperCase : " +color.toUpperCase());---not defined
		//System.out.println("toLowerCase : " +game.toLowerCase());--not defined
		//System.out.println("StartWith : " +name.startsWith("Thi"));--not defined
		//System.out.println("EndsWith : " +game.endsWith("R"));-- not defined
		//System.out.println("Contains : " +color.contains(" "));--not defined
		//System.out.println("ReplaceALL : " +game.replaceAll(game, "Scrum Master"));
		//System.out.println("Split :" +  name.split(name));--- not defined
		//System.out.println("Trim : " +game.trim());---- not defined
		System.out.println("Name  : "+  name);
		System.out.println("Game   : "+  game);
		System.out.println("Color   :  " + color);
		System.out.println("identity hasCode Value  : "+ System.identityHashCode(name));
		System.out.println("hasCode Value  : "+ name.hashCode());
	}
	
}
