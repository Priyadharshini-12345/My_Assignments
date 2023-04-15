package org.student;
import org.department.*;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student name : Priya");
	}
	public void studentDept()
	{
		System.out.println("Student department : IT");
	}
	public void studentId()
	{
		System.out.println("Student id: 5555");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}

}
