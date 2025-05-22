package org.program;

public class OccurenceinArray {

	public static void main(String[] args) {
		// Input: {1,2,3,,3,5,,5,1)
		
		int a[] = {1,2,3,3,5,5,1};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+"Repeated");
				}
			}
		}

	}

}
