package controller;

import java.sql.SQLException;
import java.util.Scanner;


import bussiness_logic.Teachersignupvalidation;
import dao.TeacherLSDAO;
import model.Teacher_registration;


public class TeacherSignup {
	Scanner sc=new Scanner(System.in);
	public void teachersignup() throws SQLException, Exception{
	
		System.out.println("ENTER  TEACHER ID");
		
		int studentId=sc.nextInt();
		
		System.out.println("ENTER PASSWORD");
		sc.nextLine();
		String password=sc.nextLine();
		System.out.println("ENTER CONFIRM PASSWORD");
		String confPass=sc.nextLine();
		TeacherLSDAO teacherlsdao=new TeacherLSDAO();
		Teacher_registration teacherregistration =new Teacher_registration();
		teacherregistration.setTeacherId(studentId);
		teacherregistration.setPassword(password);
		teacherregistration.setConfPass(confPass);
		Teachersignupvalidation teachervalidation=new Teachersignupvalidation();
		boolean validation =teachervalidation.validateteachersignup(teacherregistration);
		
		if(validation){
			teacherlsdao.teachersignup(teacherregistration);
			LoginType logintype=new LoginType();
			logintype.loginType();
		}else{
			System.out.println("ENTER VALID TEACHER ID");
			teachersignup();
		}
		
	}
}
