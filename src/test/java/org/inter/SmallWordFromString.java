package org.inter;

public class SmallWordFromString {

	public static void main(String[] args) {
		String s="Java Selenium for framework integration";
		String[] words = s.split(" ");
		String smallestWord=words[0];
		for(String word:words) {
			if(word.length()<smallestWord.length()) {
				smallestWord=word;
				
				
			}
		}
		System.out.println("The smallest word is:"+smallestWord);
		
		
		

	}

}
