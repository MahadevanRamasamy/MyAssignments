package week3.day1;

import org.student.Student;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println(id +  name);
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println(email + phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.getStudentInfo(25);
		obj.getStudentInfo(20, "Mahadevan");
		obj.getStudentInfo("mahadevan.it@gmail.com", 9976466140l);

	}

}
