package org.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceofCharacters {

	public static void main(String[] args) {
		// Input:hello
		
		String str="Hello";
		char[] ch=str.toCharArray();
		Map<Character,Integer> mp=new LinkedHashMap<>();
		for(char x:ch)
		{
			Integer count = mp.get(x);
			if(mp.containsKey(x))
					{
				mp.put(x,count+1);
				count++;
				
					}
			else
			{
				mp.put(x,1 );
			}
		}
		System.out.println(mp);

	}

}
