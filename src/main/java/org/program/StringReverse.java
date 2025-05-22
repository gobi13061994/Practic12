package org.program;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="121";
		
		//char[] c=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(rev.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		

	}

}
