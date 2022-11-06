package week1.day2;

public class MyCalculator {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		 int addition = cal.add(10, 20, 40);
		 System.out.println("Addition value is " +addition);
		 int subtraction = cal.sub(40, 20);
		 System.out.println("Subtraction value is " +subtraction);
		 double multiplication = cal.mul(30.5, 40.5);
		 System.out.println("Multiplication value is " +multiplication);
		 float division = cal.divide(45.9f, 9.89f);
		 System.out.println("Division value is " +division);
		 

	}

}
