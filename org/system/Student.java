package org.system;

public class Student {
	public void getStudentInfo(int id)
	{
		System.out.println("Student info with ID "+ id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student info with ID and name "+ id +name);
	}
	
	public void getStudentInfo(String email,int phoneNumber)
	{
		System.out.println("Student info with email and Phone number "+email+phoneNumber);
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.getStudentInfo(5);
		obj.getStudentInfo(5,"priya");
		obj.getStudentInfo("k.pri@gmail.com", 5);
		
	}
}
