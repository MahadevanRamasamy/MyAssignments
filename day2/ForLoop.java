package week1.day2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = obj.nextInt();
		System.out.println("Age is " +age);
		if(age >= 18 && age<60) {
			System.out.println("Major");
		}
		else if(age>= 60)
		{
			System.out.println("Senior citizen");
		}
		else if(age<18 && age>=10)
		{
			System.out.println("Minor");
		}
		else
		{
			System.out.println("Kid");
		}
		System.out.println("Conditional statements are working");

	}

	
	}


