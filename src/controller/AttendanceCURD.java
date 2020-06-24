package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class AttendanceCURD {
	Scanner sc = new Scanner(System.in);
	AttendanceCURDoperation attendancecurdoperation=new AttendanceCURDoperation();
	public void attendaceCURD() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("1.ADD ATTENDANCE");
		System.out.println("2.UPDATE ATTENDANCE");
		System.out.println("3.DELETE ATTENDANCE");
		System.out.println("4.DISPLAY ATTENDANCE");
		System.out.println("5.LOG OUT");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
				
				
				attendancecurdoperation.add();
				correctOption = false;
				break;
			case 2:
				attendancecurdoperation.update();
				correctOption = false;
				break;
			case 3:
				attendancecurdoperation.delete();
				correctOption = false;
				break;
			case 4:
				attendancecurdoperation.display();
				correctOption = false;
				break;
			case 5:
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
