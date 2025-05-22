package org.inter;

public class ReverseString {
	public static void main(String[] args) {
		String s="jaya";
		String result = "";
		for (int i = s.length()-1; i>=0; i--) {
			char charAt = s.charAt(i);
			//System.out.println(charAt);
			result+=charAt;
			
			
			
		}
		System.out.println(result);
	     if (s.equals(result)) {
	 		System.out.println("Given String is palindrome");
	 		
			
		} else {
			System.out.println("Given String is not palindrome");

		}
		
		
	}

}
