package org.program;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input = 12345
		/*int[] a= {333,50,3,33,5};
		Arrays.sort(a);
		for(int x:a)
		{
		System.out.println(x);
		}
		*/
		
		int[] a= {333,50,3,33,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for(int x:a)
		{
		System.out.println(x);
		}
		
		
	

	}

}
