package org.inter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountofChar {
	private void findcharcount() {
		Scanner s=new Scanner(System.in);
		System.out.println("Get Input String from User");
		String input = s.nextLine();
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;input.length()-1>=i;i++) {
			char c=input.charAt(i);
			if(mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count+1);
			}else{
				mp.put(c, 1);
				
			}
		}
		Set<Entry<Character, Integer>> value = mp.entrySet();
		for (Entry<Character, Integer> singleEntry : value) {
			System.err.println(singleEntry);
			
		}
	}
	
	
	public static void main(String[] args) {
		CountofChar ins =new CountofChar();
		Scanner scanner=new Scanner(System.in);
		ins.findcharcount();
		
	}

}
