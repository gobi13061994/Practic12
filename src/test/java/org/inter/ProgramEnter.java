package org.inter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProgramEnter {

	public static void main(String[] args) {
		int[] inputArray= {1,0,0,1,0,0,0,1,1,1,0,0,0};
		Map<Integer,Integer> mp= new HashMap<>();
		for(int i=0;inputArray.length-1>=i;i++) {
			int singleValue=inputArray[i];
			if(mp.containsKey(singleValue)) {
				Integer count = mp.get(singleValue);
				mp.put(singleValue, count+1);
			}else {
				mp.put(singleValue, 1);
			}
		}
		for(Entry<Integer, Integer> SingleMapValue:mp.entrySet()) {
			System.out.println(SingleMapValue);
			
		}

	}

}
