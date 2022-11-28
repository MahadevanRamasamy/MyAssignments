package week3.assignments;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		 
		String s = "abbaba";
		char maxOccurence = s.charAt(0);
		int maxValue=0;
		char[] charArray = s.toCharArray();
		Map<Character, Integer> occ = new HashMap<Character, Integer> ();
		for (int i = 0; i < charArray.length; i++)
		{
			//       character                     //character
			occ.put(charArray[i], occ.getOrDefault(charArray[i], 0)+1);
			if (occ.get(charArray[i])>maxValue) {
				maxOccurence=charArray[i]; //a
				maxValue=occ.get(charArray[i]); //1
			}
		}
		System.out.println(maxOccurence);

	}
}



