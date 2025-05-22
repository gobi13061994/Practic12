package org.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Char {
	
	public static void main(String[] args) {
		String input ="Java Program";
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		int count=0;

		for(int i=0;input.length()-1>=i;i++){
		char c=input.charAt(i);

		if(mp.containsKey(c)){
		mp.put(c,count++);

		}
		else{

		mp.put(c,1);

		}
		//

		}
		
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();

		for(Entry<Character, Integer> charandCount:entrySet){

		System.out.println(charandCount);
		}



		
	}
			
	}
