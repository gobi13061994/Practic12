package org.program;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 121;
		int orginal = number;
		int rem, res = 0;

		while (number > 0) {
			rem = number % 10; // 1 2 1
			res = (res * 10) + rem;// 0+1 10+2 12
			number = number / 10;// 12
		}
		System.out.println(res);
		if (orginal == res) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
