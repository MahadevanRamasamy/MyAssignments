package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student name is Mahadevan");
	}
	public void studentDept()
	{
		System.out.println("Student department is IT");
	}
	public void studentId()
	{
		System.out.println("Student Id is 06IT020");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
	}

}
