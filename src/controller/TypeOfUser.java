package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class TypeOfUser {
	Scanner sc = new Scanner(System.in);

	public void userType() throws SQLException, Exception {
		System.out.println("1.EXISTING USER--LOGIN");
		System.out.println("2.NEW USER--SIGNUP");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:
				LoginType loginType = new LoginType();
				loginType.loginType();
				correctOption = false;
				break;
			case 2:
				SignupType signupType=new SignupType();
				signupType.signuptype();
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
