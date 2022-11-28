package week3.assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> occ = new TreeMap <Integer, Integer> ();
		for (int i =0; i<input.length;i++)
		{
			
			occ.put(input[i], occ.getOrDefault(input[i], 0)+1);
			
		}
		System.out.println(occ);

	}

}
