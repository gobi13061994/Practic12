package org.inter;

public class AmtrongNum {
	public static void main(String[] args) {
		int num=371;
		int n=num;
		int rem=0;
		int res=0;
	    while (num>0) {
	    	rem=num%10;
	    	res=(rem*rem*rem)+res;
	    	num=num/10;
			
		}
	    System.out.println(res);
	    
	    if (res==n) {
	    	System.out.println("Given number is Amstrong");
			
		}else {
			System.out.println("Given number is not Amstrong");
		}
		
	}

}
