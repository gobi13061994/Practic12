package org.inter;

import java.util.Scanner;

public class InterChangelastandfirstLetter {

	public void changeFirstAndLast() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("get the input from user");
		String inputString = scanner.next();
		//String inputString="gobi";
		char[] charArray = inputString.toCharArray();
		int lastIndex = charArray.length-1;
	    char temp=charArray[0];
	    charArray[0]=charArray[lastIndex];
	    charArray[lastIndex]=temp;
	    String output="";
	    for (int i = 0; i <= charArray.length-1; i++) {
	    	char c=charArray[i];
	    	output=output+c;	
		}
	    System.out.println(output);
		
	}
	private String String(char[] charArray) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		InterChangelastandfirstLetter i=new InterChangelastandfirstLetter();
		i.changeFirstAndLast();
		
	}

}
