package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int size = data.length;
		Arrays.sort(data);
		System.out.println("Second largest number is " + data[data.length-2]);
		//System.out.println(data[0]);
		//for (int i = 0 ; i < data.length ; i++)
		//{
		//	System.out.println(data[i]);
		//}
		}

}
