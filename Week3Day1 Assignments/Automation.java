package week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool{

	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class method implemented in child class");
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("TestTool Interface method implemented in automation class");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Language interface method implemented in automation class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj = new Automation();
		obj.python();
		obj.java();
		obj.Selenium();
		obj.ruby();

	}


}
