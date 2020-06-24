package controller;

import java.sql.SQLException;
import java.util.Scanner;


import dao.TeacherLSDAO;
import model.Teacher_registration;

public class TeacherLogin {
		Scanner sc= new Scanner(System.in);
	public void teacherlogin() throws SQLException, Exception{
		System.out.println("ENTER TEACHER ID");
		int teacherId=sc.nextInt();
		System.out.println("ENTER PASSWORD");
		sc.nextLine();
		String password=sc.nextLine();
		Teacher_registration teacherregistration =new Teacher_registration();
		teacherregistration.setTeacherId(teacherId);
		teacherregistration.setPassword(password);
		TeacherLSDAO teacherlogin=new TeacherLSDAO();
		boolean loginvalidation=teacherlogin.teacherlogin(teacherregistration);
		if(loginvalidation){
			System.out.println("sucessfully logined");
			TeacherCURD teachercurd=new TeacherCURD();
			teachercurd.teacherCURD();
		}
		else{
			System.out.println("enter correct username and password");
			teacherlogin();
		}
	}
}
