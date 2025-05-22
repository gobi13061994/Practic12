package org.inter;

import java.util.Iterator;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		int num=6;
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
			
		}
		System.err.println(fact);
	}

}
