package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class TeacherCURD {

	public void teacherCURD() throws SQLException, Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1.STUDENT ATTENDANCE CURD");
		System.out.println("2.STUDENT MARKS CURD");
		System.out.println("3.DISPLAY STUDENT DETAILS");
		System.out.println("4.LOGOUT");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
				AttendanceCURD attendancecurd=new AttendanceCURD();
				attendancecurd.attendaceCURD();
				correctOption = false;
				break;
			case 2:
				MarksCURD markscurd=new MarksCURD();
				markscurd.marksCURD();
				correctOption = false;
				break;
			case 3:
				AdminStudent adminStudent=new AdminStudent();
				adminStudent.display();
				correctOption=false;
				break;
			case 4:
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


















