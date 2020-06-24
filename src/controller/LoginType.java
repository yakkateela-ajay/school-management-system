package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginType {
	Scanner sc = new Scanner(System.in);
	public void loginType() throws SQLException, Exception{
		System.out.println("1.ADMIN LOGIN");
		System.out.println("2.TEACHER LOGIN");
		System.out.println("3.STUDENT LOGIN");
		System.out.println("4.GO BACK");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
				
				
				AdminLogin adminLogin =new AdminLogin();
				adminLogin.adminlogin();
				correctOption = false;
				break;
			case 2:
				
				TeacherLogin teacherLogin=new TeacherLogin();
				teacherLogin.teacherlogin();
				correctOption = false;
				break;
			case 3:
				
				StudentLogin studentLogin=new StudentLogin();
				studentLogin.studentlogin();
				correctOption=false;
				break;
			case 4:
				
				TypeOfUser type=new TypeOfUser();
				type.userType();
				correctOption=false;
				break;
			default:
				System.out.println("CHOOSE CORRECT OPTION");
				correctOption = true;
				break;
			}
		} while (correctOption);
	}
}
