package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int calculated = 0 ;
		int remainder ;
		int original = 153 ;
		int input = original;
		while(input > 0)
		{
			remainder = input % 10; //3 to 5 to 1
			input = input / 10; //15 to 1
			calculated = calculated + (remainder*remainder*remainder); //27  + 125 + 1 
			System.out.println(calculated);
		}
		if(calculated == original)
		{
			System.out.println("Its a Armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
		
	}

}
