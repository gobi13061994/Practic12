package org.inter;

public class StringDecaarition {

	public static void main(String[] args) {
		//1. Using String Literals
		String str1 = "Hello, World!";
		//2. Using the new Keyword
		String str2 = new String("Hello, World!");
		 //3.Using StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		//4. Using StringBuffer
		StringBuffer sbf = new StringBuffer("Hello");
		//5. Declaring an Empty String
		String emptyString = "";          // Using literal
		String emptyStringObj = new String(); // Using `new` keyword
		//6. Using Character Arrays
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(chars);
		//7. Using Byte Arrays
		byte[] bytes = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
		String str4 = new String(bytes);
		//8. Using String.format()
		String str5 = String.format("Hello, %s!", "World");
        //9. Using valueOf() Method
		int number = 42;
		String str6 = String.valueOf(number);
		//10. Using String.join()
		String str7 = String.join(", ", "Apple", "Banana", "Cherry");
		//11. Using String Concatenation
		String str8 = "Hello, " + "World!";
		//12. Using substring()
		String original = "Hello, World!";
		String str9 = original.substring(0, 5); // "Hello"


		





	}

}
