package controller;

import java.sql.SQLException;
import java.util.Scanner;

public class TeacherDetailsCURD {
	Scanner sc = new Scanner(System.in);
	AdminTeacher adminTeacher=new AdminTeacher();
	public void teacherdetailscurd() throws SQLException, Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("1.ADD TEACHER DETAILS");
				System.out.println("2.UPDATE TEACHER DETAILS");
				System.out.println("3.DELETE TEACHER DETAILS");
				System.out.println("4.DISPLAY TEACHER DATA");
				System.out.println("5.LOG OUT");
				boolean correctOption = false;
				do {
					int loginOption = sc.nextInt();

					switch (loginOption) {
					case 1:		
						
						adminTeacher.add();
						correctOption = false;
						break;
					case 2:
						adminTeacher.update();
						correctOption = false;
						break;
					case 3:
						adminTeacher.delete();
						correctOption = false;
						break;
					case 4:
						adminTeacher.display();
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
