package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s = "madam";
		char[] charArray = s.toCharArray();
		//System.out.println(charArray);
		String rev = "";
		for(int i = 4; i>=charArray.length-5; i--)
		{
			System.out.println(charArray[i]);
			rev =rev + charArray[i];
					
		}
		if(s.equals(rev))
		{
			System.out.println("It's a palindrome");
		}
		else
			System.out.println("Not a palindrome");

	}

}
