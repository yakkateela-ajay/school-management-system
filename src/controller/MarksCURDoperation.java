package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.TeachermarksDAO;
import model.Marks;

public class MarksCURDoperation {
	static TeacherCURD tachercurd=new TeacherCURD();
	 static Scanner sc=new Scanner(System.in);
	 static Marks marks=new Marks(); 
	 static TeachermarksDAO teachermarksdao=new TeachermarksDAO();
	public static  void addmarks() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STUDENT ID");
		int studentId=sc.nextInt();
		System.out.println("ENTER THE TELUGU MARKS");
		int telugu=sc.nextInt();
		System.out.println("ENTER THE MATHS MARKS");
		int english=sc.nextInt();
		System.out.println("ENTER THE ENGLISH MARKS");
		int maths=sc.nextInt();
		System.out.println("ENTER THE SCIENCE MARKS");
		int science=sc.nextInt();
		System.out.println("ENTER THE SOCIAL MARKS");
		int social=sc.nextInt();
		marks.setStudentId(studentId);
		marks.setTelugu(telugu);
		marks.setEnglish(english);
		marks.setMaths(maths);
		marks.setScience(science);
		marks.setSocial(social);
		boolean validate=teachermarksdao.addmarksDAO(marks);
		if(validate){
			System.out.println("student marks are inserted successfully");
			tachercurd.teacherCURD();
		}else{
			addmarks();
		}
		
		
		
	}
	public static  void update() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STUDENT ID");
		int studentId=sc.nextInt();
		System.out.println("ENTER THE SUBJECT NAME TO MODIFY MARKS IN CAPITAL LETTERS");
		sc.nextLine();
		
		String subject=sc.nextLine();
		System.out.println("ENTER THE marks to modify");
		int marks=sc.nextInt();
		boolean validate=teachermarksdao.updatemarks(studentId,subject,marks);
		if(validate){
			System.out.println("student marks are inserted successfully");
			tachercurd.teacherCURD();
		}else{
			System.out.println("student marks are inserted successfully");
			update();
		}
	}
	public static   void delete() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STUDENT ID");
		int studentId=sc.nextInt();
		marks.setStudentId(studentId);
		boolean validate=teachermarksdao.deletemarksDAO(marks);
		if(validate){
			System.out.println("student marks are deleted successfully");
			tachercurd.teacherCURD();
		}else{
			delete();
		}
	}
	public static  void display() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("1.display sixth class student details");
		System.out.println("2.display seventh class student details");
		System.out.println("3.display eighth class student details");
		System.out.println("4.display ninth class student details");
		System.out.println("5.display tenth class student details");
		System.out.println("6.log out");
		boolean correctOption = false;
		do {
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:		
				teachermarksdao.displaysixth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 2:
				teachermarksdao.displayseventh();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 3:
				teachermarksdao.displayeighth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 4:
				teachermarksdao.displayninth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 5:
				teachermarksdao.displaytenth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 6:
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
