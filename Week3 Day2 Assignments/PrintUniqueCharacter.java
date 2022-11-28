package week3.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mahadevan";
		char[] charArray = name.toCharArray();
		Set<Character> chr = new LinkedHashSet<Character>();
		for(int i = 0; i<charArray.length; i++)
		{
			chr.add(charArray[i]);
		}		
		System.out.println(chr.toString().replace(",", ""));
		}

}
