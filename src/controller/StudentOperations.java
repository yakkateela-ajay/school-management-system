package controller;


import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentOperationsDAO;



public class StudentOperations {
	Scanner sc = new Scanner(System.in);
	
	StudentOperationsDAO studentOperationDAO=new StudentOperationsDAO();
	public void studentOperations() throws SQLException, Exception {

		System.out.println("1.DISPLAY  ATTENDANCE");
		System.out.println("2.DISPLAY  MARKS");
		System.out.println("3.LOG OUT");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:
				System.out.println("ENTER THE STUDENT ID");
				int studentId=sc.nextInt();
				studentOperationDAO.attendancedao(studentId);
				studentOperations();
				correctOption = false;
				break;
			case 2:
				System.out.println("ENTER THE STUDENT ID");
				int studentId1=sc.nextInt();
				studentOperationDAO.marksdao(studentId1);
				studentOperations();
				correctOption = false;
				break;
			case 3:
				LoginType loginType = new LoginType();
				loginType.loginType();
				correctOption = false;
				break;
			default:
				System.out.println("CHOOSE CORRECT OPTION");
				correctOption = true;
				break;
			}
		} while (correctOption);
	}
}
