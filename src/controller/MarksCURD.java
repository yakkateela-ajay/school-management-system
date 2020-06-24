package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class MarksCURD {
	Scanner sc = new Scanner(System.in);
	MarksCURDoperation markscurdoperation =new MarksCURDoperation();
	
	public void marksCURD() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("1.ADD STUDENT MARKS");
		System.out.println("2.UPDATE STUDENT MARKS");
		System.out.println("3.DELETE STUDENT MARKS");
		System.out.println("4.DISPLAY STUDENT MARKS");
		System.out.println("5.LOG OUT");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
	
				MarksCURDoperation.addmarks();
				correctOption = false;
				break;
			case 2:
				MarksCURDoperation.update();
				correctOption = false;
				break;
			case 3:
				MarksCURDoperation.delete();
				correctOption = false;
				break;
			case 4:
				MarksCURDoperation.display();
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
