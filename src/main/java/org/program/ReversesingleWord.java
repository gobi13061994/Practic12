package org.program;

public class ReversesingleWord {

	public static void main(String[] args) {
		//Good Bad
		
		String str="Good Bad";
		String[] str1=str.split(" ");
		String result="";
		for(int i=0;i<str1.length;i++){
		String single=str1[i];
		String rev="";
		    for(int j=single.length()-1;j>=0;j--){
				char charAt = single.charAt(j);
				rev=rev+charAt;
			}
		    result=result+rev+" ";
		}
		
		System.out.println(result);

	}

}
