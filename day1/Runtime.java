package week1.day1;
import java.util.Scanner;


public class Runtime {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = obj.nextInt();
		System.out.println("A value is "  + a);
		System.out.println("Enter the string value");
		obj.nextLine();
		String s = obj.nextLine();
		System.out.println("String value is "  + s);
		System.out.println("Enter the boolean value");
		Boolean B = obj.nextBoolean();
		System.out.println("Boolean value is " +B);

	}

}
