package org.inter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EnteringArrayNonRepeatedRepeatedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,2,10,56,6,9,4,5,6,3,4,7,8,9};
		Map<Integer,Integer> mp=new TreeMap<Integer, Integer>();
		for(int i=0;arr.length>i;i++) {
			int key = arr[i];
			Integer counter = mp.get(key);
			if(mp.containsKey(key)) {
				
				mp.put(key, counter+1);				
				
			}else {
				mp.put(key, 1);
			}
			
		}
		for(Map.Entry<Integer,Integer> value:mp.entrySet()) {
			//Integer integer = mp.get(value);
			//System.out.println(value);
			if(value.getValue()>1) {
				System.out.println("Repeating Number:"+value.getKey());
				
				
			}else {
				System.out.println("Non Repeating Number:"+value.getKey());
		}

	}

}
}
