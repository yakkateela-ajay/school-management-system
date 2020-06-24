package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminLogin {
	Scanner sc = new Scanner(System.in);
	public void adminlogin() throws SQLException, Exception{
		System.out.println("ENTER THE USER NAME");
	
		String username=sc.nextLine();
		System.out.println("ENTER PASSWORD");
		String password=sc.nextLine();
		if(username.equals("ajay")&&password.equals("ajay")){
			System.out.println("you are sucessfully logined");
			AdminCURD adminCURD=new AdminCURD();
			adminCURD.admincurd();
		}else{
			System.out.println("ENTER VALID USERNAME AND PASSWORD");
			adminlogin();
		}
	}
}
