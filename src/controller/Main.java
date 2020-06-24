package controller;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub

		System.out.println("------------------------------------------------------------------------");
		System.out.println("\t\tWELCOME TO SCHOOL MANAGEMENT SYSTEM");
		System.out.println("------------------------------------------------------------------------");
		TypeOfUser typeOfUser = new TypeOfUser();
		typeOfUser.userType();

	}

}
