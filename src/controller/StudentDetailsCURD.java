package controller;

import java.sql.SQLException;
import java.util.Scanner;



public class StudentDetailsCURD {
	Scanner sc = new Scanner(System.in);
	AdminStudent adminStudent=new AdminStudent();
	public void studentdetailscurd() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("1.ADD STUDENT DETAILS");
		System.out.println("2.UPDATE STUDENT DETAILS");
		System.out.println("3.DELETE STUDENT DETAILS");
		System.out.println("4.DISPLAY STUDENT DATA");
		System.out.println("5.LOG OUT");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
				
				adminStudent.add();
				correctOption = false;
				break;
			case 2:
				adminStudent.update();
				correctOption = false;
				break;
			case 3:
				adminStudent.delete();
				correctOption = false;
				break;
			case 4:
				adminStudent.display();
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
