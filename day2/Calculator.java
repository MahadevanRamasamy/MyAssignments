package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2, int num3)
	{
		
		return num1 + num2 + num3;
	}
	
	public int sub(int num1, int num2)
	{
		int b = num1 - num2;
		//System.out.println(b);
		return b;
	}

	public double mul (double num1, double num2)
	{
		double c = num1 * num2;
		//System.out.println(c);
		return c;
		
	}
	
	public float divide(float num1, float num2)
	{
		float d = num1 / num2;
		//System.out.println(d);
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		 cal.add(10, 20, 40);
		 cal.sub(40, 20);
		 cal.mul(30.5, 40.5);
		 cal.divide(45.34f, 9.55f);
		 

	}

}
