package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number = -40;
		if(number < 0) {
			System.out.println("Number is negative");
			number = number*-1;
			System.out.println("Converted positive number is " +number);
		}
		else
		{
			System.out.println("Number is not negative");
		}
			

	}

}
