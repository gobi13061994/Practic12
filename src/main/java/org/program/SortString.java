package org.program;

public class SortString {
	public static void main(String[] args) {
		
		//input:DHARANI
		//OUT:AADHINR
		
		String str="dharani";
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+0;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
			}
		}
		
		for(char x:c)
		{
		System.out.print(x);
		}
		
				
		
		
	}

}
