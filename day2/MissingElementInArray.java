package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 1; i < arr.length; i++)
		{
			if(i != arr[i-1])
			{
				System.out.println("Missing element in array is : " +i);
				break;
			}
		}
		
	}

}
