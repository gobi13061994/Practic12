package org.inter;

import java.util.Scanner;

public class SumofDigitfromString {
	public static void main(String[] args) {
		int sum=0;
		//Scanner s =new Scanner(System.in);
		String s="j90khk79i908😀";
		for(int i=0;s.length()-1>=i;i++) {
			char charAt = s.charAt(i);
			if(Character.isDigit(charAt)) {
				int numericValue = Character.getNumericValue(charAt);
				System.out.println(numericValue);
				sum=sum+numericValue;
				
				
			}else {
				boolean emoji = Character.isEmoji(charAt);
				System.out.println(emoji);
				
			}
		}
		System.out.println(sum);

		
	}
	
}
