package controller;

import java.sql.SQLException;
import java.util.Scanner;

import bussiness_logic.Validation;
import dao.AdminStudentDAO;
import model.Student_details;

public class AdminStudent {
	Student_details studentdetails=new Student_details();
	AdminStudentDAO adminStudentdao =new  AdminStudentDAO();
	Validation vd=new Validation();
	AdminCURD admincurd=new AdminCURD();
	Scanner sc=new Scanner(System.in);
		public void add() throws SQLException, Exception{
			System.out.println("ENTER THE STUDENT ID");
			int studentId=sc.nextInt();
			boolean validate=vd.addadminstudent(studentId);
			if(validate){
				System.out.println("student data is taken on the given id");
				add();
			}else{
				System.out.println("ENTER THE STUDENT NAME");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("ENTER THE STUDENT GENDER");
				String gender=sc.nextLine();
				System.out.println("ENTER THE STUDENT FATHER NAME");
				String fatherName=sc.nextLine();
				System.out.println("ENTER THE STUDENT CLASS NAME");
				String className=sc.nextLine();
				System.out.println("ENTER THE STUDENT MOBILE NUMBER");
				String mobileNumber=sc.nextLine();
				System.out.println("ENTER THE STUDENT CITY");
				String city=sc.nextLine();
				studentdetails.setStudentId(studentId);
				studentdetails.setName(name);
				studentdetails.setGender(gender);
				studentdetails.setFatherName(fatherName);
				studentdetails.setClassName(className);
				studentdetails.setMobleNumber(mobileNumber);
				studentdetails.setCity(city);
				boolean validation=adminStudentdao.addstudentdetails(studentdetails);
				if(validation){
					System.out.println("A new student data was inserted successfully!");
					admincurd.admincurd();
				}else{
					System.out.println("A new student data was not inserted successfully!");
					add();
				}
			}
		}
		public void update() throws Exception{
			System.out.println("ENTER THE STUDENT ID");
			int studentId=sc.nextInt();
			System.out.println("ENTER THE STUDENT MOBILE NUMBER");
			sc.nextLine();
			String mobileNumber=sc.nextLine();
			System.out.println("ENTER THE STUDENT CITY");
			String city=sc.nextLine();
			studentdetails.setStudentId(studentId);
			studentdetails.setMobleNumber(mobileNumber);
			studentdetails.setCity(city);
			
			boolean validation=adminStudentdao.updatestudentdetails(studentdetails);
			if(validation){
				System.out.println("A new student data was updated successfully!");
				admincurd.admincurd();
			}else{
				System.out.println("A new student data was not updated successfully!");
				update();
			}
		}
		public void delete() throws Exception{
			System.out.println("ENTER THE STUDENT ID");
			int studentId=sc.nextInt();
			studentdetails.setStudentId(studentId);
			
			boolean validation=adminStudentdao.deletestudentdetails(studentdetails);
			if(validation){
				System.out.println("A new student data was deleted successfully!");
				admincurd.admincurd();
			}else{
				System.out.println("A new student data was not deleted successfully!");
				delete();
			}
			
		}
		public void display() throws SQLException, Exception{
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
					adminStudentdao.displaysixth();
					correctOption = false;
					break;
				case 2:
					adminStudentdao.displayseventh();
					correctOption = false;
					break;
				case 3:
					adminStudentdao.displayeighth();
					correctOption = false;
					break;
				case 4:
					adminStudentdao.displayninth();
					correctOption = false;
					break;
				case 5:
					adminStudentdao.displaytenth();
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
