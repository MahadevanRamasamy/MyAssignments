package week3.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPayPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "PayPal India";
		char[] charArray = companyName.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (Character character : charArray) {
			if(character != ' ')
			charSet.add(character);
		}
		System.out.println("Set values are:" +charSet);
		String output ="";
		for (Character each : charSet) {
			output = output+each;			
		}
		System.out.println(output);
	}

}
