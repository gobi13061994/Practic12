package org.inter;

public class ReverseTheNum {
	public static void main(String[] args) {
		int num=252;
		int n=num;
		int rem=0;
		int res=0;
	    while (num>0) {
	    	rem=num%10;
	    	res=(res*10)+rem;
	    	num=num/10;
			
		}
	    System.out.println(res);
	    
	    if (res==n) {
	    	System.out.println("Given number is Panlindrome");
			
		}else {
			System.out.println("Given number is not palindrome");
		}
		
		
	}

}
