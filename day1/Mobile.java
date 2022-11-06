package week1.day1;

import week1.day2.Test;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj = new Mobile();
		Test tT = new Test();
		//tT.exam();
		obj.sendMsg();
		obj.makeCall();

	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Call is working");
		

	}
	
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Message sent");

	}
}
