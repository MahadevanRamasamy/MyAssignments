package week3.assignments;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//Arrays.sort(data);
		Set<Integer> emptySet = new TreeSet<Integer>();
		for(int i = 0; i<data.length; i++)
		{
			emptySet.add(data[i]);
		}
		System.out.println("Set" + emptySet);
		ArrayList<Integer> arr = new ArrayList<Integer>(emptySet);
		System.out.println("List: " +arr);
		int size = arr.size();
		System.out.println(size);
		System.out.println("Second largest number is " +arr.get(size-1));
		
	}

}
