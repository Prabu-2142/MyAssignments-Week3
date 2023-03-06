package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Student Nmae: Prabu");
	}
	
public void studentDept() {
		
		System.out.println("Student Department: Electronics and Telecommunication Engineering");
	}

public void studentId() {
	
	System.out.println("Student ID: 13T123");
}

public static void main(String[] args) {
	
	Student s = new Student();
	s.collegeName();
	s.collegeCode();
	s.collegeRank();
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();
	
}

}
