package com.OopsConcepts;



public class StringToHashMap {

	public static void main(String[] args) {
		String input = "type=search&loc=in";
		String output = convertString(input);
		System.out.println("Output: " + output);
	}

	public static String convertString(String input) {

		String[] keyValuePairs = input.split("&");

		StringBuilder sb = new StringBuilder();

		for (String pair : keyValuePairs) {

			String[] keyValue = pair.split("=");

			sb.append("[").append(keyValue[0]).append(":").append(keyValue[1]).append("]");
		}

		return sb.toString();
	}

}
