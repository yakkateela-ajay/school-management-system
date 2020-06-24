package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminCURD {
	Scanner sc = new Scanner(System.in);
	public void admincurd() throws SQLException, Exception{
		System.out.println("1.STUDENT DETAILS CURD");
		System.out.println("2.TEACHER DETAILS CURD");
		System.out.println("3.LOGOUT");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
				StudentDetailsCURD studentDetailsCURD=new StudentDetailsCURD();
				studentDetailsCURD.studentdetailscurd();
				correctOption = false;
				break;
			case 2:
				TeacherDetailsCURD teacherDetailsCURD=new TeacherDetailsCURD();
				teacherDetailsCURD.teacherdetailscurd();
				correctOption = false;
				break;
			case 3:
				LoginType logintype=new LoginType();
				logintype.loginType();
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
