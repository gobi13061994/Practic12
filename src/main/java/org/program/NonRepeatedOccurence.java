package org.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedOccurence {

	public static void main(String[] args) {
		//Hello
		String str="Hello";
		char[] ch=str.toCharArray();
		Map<Character,Integer> mp=new LinkedHashMap<> ();
		
		for(char x:ch)
		{
			Integer count=mp.get(x);
			if(mp.containsKey(x))
			{
				mp.put(x, count+1);
				
			}else
			{
				mp.put(x, 1);
			}
		}
		
		
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		if(entry.getValue()>1)
		{
			System.out.println("Repeated character"+entry.getKey());
		}else
		{
			System.out.println("Non Repeted character"+entry.getKey());
		}
		
		
		
		

	}

}
