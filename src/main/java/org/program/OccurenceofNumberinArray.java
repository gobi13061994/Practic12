package org.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceofNumberinArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,33,4,33,55,55,20};
		Map <Integer,Integer> mp=new LinkedHashMap<>();
		
		
		for(int i=0;i<a.length;i++)
		{
			Integer count=mp.get(a[i]);
			if(mp.containsKey(a[i]))
			{
				mp.put(a[i], count+1);
			}else
			{
				mp.put(a[i], 1);
			}
		}
		
		System.out.println(mp);
		
		for(Map.Entry<Integer, Integer> entry:mp.entrySet())
		{
			if(entry.getValue()>1)
			System.out.println(entry.getKey());
		}
		

	}

}
