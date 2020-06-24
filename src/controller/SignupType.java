package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class SignupType {
	Scanner sc = new Scanner(System.in);

	public void signuptype() throws SQLException, Exception {
		System.out.println("1.TEACHER SIGNUP");
		System.out.println("2.STUDENT SIGNUP");
		System.out.println("3.GO BACK");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:
				TeacherSignup teacherSignup = new TeacherSignup();
				teacherSignup.teachersignup();
				correctOption = false;
				break;
			case 2:
				StudentSignup studentSignup = new StudentSignup();
				studentSignup.studentsignup();
				correctOption = false;
				break;
			case 3:
				
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
