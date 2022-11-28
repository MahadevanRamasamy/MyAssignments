package week3.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		System.out.println(split[0]);
		Set<String> uniqueWords = new LinkedHashSet<String>();
		for(int i = 0; i<split.length; i++)
		{
			uniqueWords.add(split[i]);
		}
		System.out.println(uniqueWords.toString().replace(",", " "));
		

	}

}
