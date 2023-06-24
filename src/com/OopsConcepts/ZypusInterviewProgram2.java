package com.OopsConcepts;

public class ZypusInterviewProgram2 {

	public static void main(String[] args) {
		String input1 = "2";
		String input2 = "https://www.google.com/type=search&loc=in";
		String input3 = "print://axxy/pp.pdf";

		String[] parts = input2.split("/");
		int num = Integer.parseInt(input1);
		String hostName= parts[0];
		String url = parts[2];
		String keyValues =parts[3];
	
		String hostNameNew = "";
		for(int i=0;i<hostName.length();i++) {
			if(hostName.charAt(i)==':') {	
			}else {
				hostNameNew =hostNameNew +hostName.charAt(i);	
			}
		}
		
		String[] keyValuePairs = keyValues.split("&");
		StringBuilder sb = new StringBuilder();
		for (String pair : keyValuePairs) {
			String[] keyValue = pair.split("=");
			sb.append("[").append(keyValue[0]).append(":").append(keyValue[1]).append("]").append(" ");
		}
		String keyValuePairResult = sb.toString();
		System.out.print(hostNameNew + " "+ url +" "+ keyValuePairResult);
		System.out.println();
		
		String[] printParts = input3.split("//");
		String hostName2= printParts[0];
		String hostNameNew2 = "";
		for(int i=0;i<hostName2.length();i++) {
			if(hostName2.charAt(i)==':') {		
			}else {
				hostNameNew2 =hostNameNew2 +hostName2.charAt(i);	
			}
		}
		String[] printPartsNew = printParts[1].split("/");
		System.out.print(hostNameNew2+" "+printPartsNew[0]+" "+printPartsNew[1] );
	}
}
