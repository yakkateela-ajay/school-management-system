package controller;

import java.sql.SQLException;
import java.util.Scanner;

import bussiness_logic.Validation;
import dao.TeacherattendaceDAO;
import model.Attendance;

public class AttendanceCURDoperation {
	TeacherCURD tachercurd=new TeacherCURD();
	Scanner sc = new Scanner(System.in);
	Attendance attendanceobj=new Attendance();
	Validation vd=new Validation();
	TeacherattendaceDAO teacherattendaceDAO=new TeacherattendaceDAO();
	public void add() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STUDENT ID");
		int studentId=sc.nextInt();
		boolean v=vd.addattendance(studentId);
		if(v){
			System.out.println("student data is taken on the given id");
			add();
		}else{
			System.out.println("ENTER THE ATTENDANCE PERCENTAGE");
			float attendance=sc.nextFloat();
			attendanceobj.setStudentId(studentId);
			attendanceobj.setAttendance(attendance);
			boolean validate=teacherattendaceDAO.addattendacedao(attendanceobj);
			if(validate){
				System.out.println("student attendace is inserted succdessfully");
				tachercurd.teacherCURD();
			}else{
				
				add();
			}
		}
	
	}
	public void update() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STUDENT ID");
		int studentId=sc.nextInt();
		System.out.println("ENTER THE ATTENDANCE PERCENTAGE TO MODIFY");
		float attendance=sc.nextFloat();
		attendanceobj.setStudentId(studentId);
		attendanceobj.setAttendance(attendance);
		boolean validate=teacherattendaceDAO.updateattendacedao(attendanceobj);
		if(validate){
			System.out.println("student attendace is UPDATED succdessfully");
			tachercurd.teacherCURD();
		}else{
			System.out.println("enter valid details");
			update();
		}
		
	}
	public void delete() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STUDENT ID TO DELETE ATTENDACE RECORD FROM DATA");
		int studentId=sc.nextInt();
		boolean validate=teacherattendaceDAO.deleteattendacedao(studentId);
		if(validate){
			System.out.println("student attendace is DELETED  succdessfully");
			tachercurd.teacherCURD();
		}else{
			System.out.println("enter valid student id");
			delete();
		}
	}
	public void display() throws SQLException, Exception {
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
				teacherattendaceDAO.displaysixth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 2:
				teacherattendaceDAO.displayseventh();
				tachercurd.teacherCURD();
				correctOption = false;
				
				break;
			case 3:
				teacherattendaceDAO.displayeighth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 4:
				teacherattendaceDAO.displayninth();
				tachercurd.teacherCURD();
				correctOption = false;
				break;
			case 5:
				teacherattendaceDAO.displaytenth();
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
