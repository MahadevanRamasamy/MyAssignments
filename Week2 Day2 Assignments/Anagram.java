package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		int length = text1.length();
		int length2 = text2.length();
		if(length == length2)
		{
			System.out.println("Length is same");
		}
		else
		{
			System.out.println("Not same");
		}
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		System.out.println(charArray);
		System.out.println(charArray2);
		boolean equals = Arrays.equals(charArray, charArray2);
		if(equals == true)
		{
			System.out.println("Both arrays has same value");
		}
		else
		{
			System.out.println("Not same value");
		}
		
				

	}

}
