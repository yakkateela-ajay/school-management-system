package controller;


import java.sql.SQLException;
import java.util.Scanner;

import bussiness_logic.Studentsignupvalidation;
import dao.StudentLSDAO;
import model.Student_registration;
public class StudentSignup {
	Scanner sc=new Scanner(System.in);
	public void studentsignup() throws SQLException, Exception{
		
		System.out.println("ENTER  STUDENT ID");
		
		int studentId=sc.nextInt();
		System.out.println("ENTER PASSWORD");
		sc.nextLine();
		String password=sc.nextLine();
		System.out.println("ENTER CONFIRM PASSWORD");
		String confPass=sc.nextLine();
		StudentLSDAO studentlsdao=new StudentLSDAO();
		Student_registration studentregistration =new Student_registration();
		studentregistration.setStudentId(studentId);
		studentregistration.setPassword(password);
		studentregistration.setConfPass(confPass);
		Studentsignupvalidation studentvalidation=new Studentsignupvalidation();
		boolean validation =studentvalidation.validatestudentsignup(studentregistration);
		
		
		if(validation){
			studentlsdao.studentsignup(studentregistration);
			LoginType logintype=new LoginType();
			logintype.loginType();
		}else{
			System.out.println("ENTER VALID STUDENT DETAILS");
			studentsignup();
		}
		
	}
}
