package org.program;

public class ProductNumber {

	public static void main(String[] args) {
		// Input=123
		//output=6
		
		int number=123;
		int rem=0,res=1;
		while(number>0)
		{
			rem=number%10;//3 2 1
			res=res*rem;//1*3 3*2 6*1
			number=number/10; //12	 1
			}
		System.out.println(res);

	
	}

}
