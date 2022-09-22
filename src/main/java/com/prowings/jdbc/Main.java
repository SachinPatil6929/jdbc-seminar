package com.prowings.jdbc;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
//		int updateId=24;
//		int deleteRoll=30;
		CrudDemo crudDemo = new CrudDemo();
		
		Student std1 = new Student(10, "Sham", "Satara");
		Student std2 = new Student(30, "Ram", "Kolhapur");
		Student std3 = new Student(70, "Raj", "Kolhapur");
		Student std4 = new Student(50, "Rani", "Pune");
		
		try {
			System.out.println(crudDemo.createStudent(std1));
			System.out.println(crudDemo.createStudent(std2));
			System.out.println(crudDemo.createStudent(std3));
			System.out.println(crudDemo.createStudent(std4));
	//		System.out.println(crudDemo.getStudentByRoll(std1.roll));
//			System.out.println(crudDemo.deleteStudentByRoll(deleteRoll));
//			System.out.println(crudDemo.updateStudent(updateId, std4));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
