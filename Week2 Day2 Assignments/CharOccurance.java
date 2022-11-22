package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		int length = charArray.length;
		for(int i= 0; i<length; i++)
		{
			if(charArray[i] == 'e' )
			{
				count = count+1;
			}
		}
		System.out.println("Occurrences of a char e is:" +count);

	}

}
