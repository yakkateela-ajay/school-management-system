package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentLSDAO;
import model.Student_registration;

public class StudentLogin {
	StudentLSDAO studentloginstudent=new StudentLSDAO();
	Scanner sc=new Scanner(System.in);
	public void studentlogin() throws SQLException, Exception{
		System.out.println("ENTER STUDENT ID");
		int studentId=sc.nextInt();
		System.out.println("ENTER PASSWORD");
		sc.nextLine();
		String password=sc.nextLine();
		Student_registration studentregistration =new Student_registration();
		studentregistration.setStudentId(studentId);
		studentregistration.setPassword(password);
		boolean loginvalidation=studentloginstudent.studentlogin(studentregistration);
		
		if(loginvalidation){
			System.out.println("sucessfully logined");
			StudentOperations studentoperations=new StudentOperations();
			studentoperations.studentOperations();
			
		}
		else{
			System.out.println("enter correct username and password");
			studentlogin();
		}
	}
}
