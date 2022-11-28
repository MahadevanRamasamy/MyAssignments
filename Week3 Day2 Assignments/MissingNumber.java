package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7,9,10};
		List<Integer> nums = new ArrayList<Integer>();
		for(int i =0; i<input.length; i++)
		{
			nums.add(input[i]);
		}
		System.out.println(nums);
		for(int i =0; i<nums.size(); i++)
		{
			if(nums.get(i+1) == nums.get(i)+1) 
			{					
		
			}
			else {
				System.out.println("Missing number is: " +(nums.get(i)+1));
				break;
			}
				
		}

	}

}
