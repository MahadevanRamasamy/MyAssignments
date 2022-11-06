package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long input = 5;
		long fact = 1;
		for (int i = 1; i <= input; i++)
		{
		fact = fact*i;	
		}
		System.out.println(fact);	
}

}
