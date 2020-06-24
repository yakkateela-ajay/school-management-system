package controller;

import java.sql.SQLException;
import java.util.Scanner;

import bussiness_logic.Validation;
import dao.AdminTeacherDAO;

import model.Teacher_details;

public class AdminTeacher {
	Teacher_details teacherdetails = new Teacher_details();
	AdminTeacherDAO adminTeacherdao = new AdminTeacherDAO();
	AdminCURD admincurd = new AdminCURD();
	Validation vd=new Validation();
	Scanner sc = new Scanner(System.in);

	public void add() throws SQLException, Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE TEACHER ID");
		int teacherId = sc.nextInt();
		boolean validate=vd.addadminteacher(teacherId );
		if(validate){
			System.out.println("teacher data is taken on the given id");
			add();
		}else{
			System.out.println("ENTER THE TEACHER NAME");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("ENTER THE TEACHER GENDER");
			String gender = sc.nextLine();
			System.out.println("ENTER THE QUALIFICATION");
			String qualification = sc.nextLine();
			System.out.println("ENTER THE SUBJECT NAME");
			String subjectName = sc.nextLine();
			System.out.println("ENTER THE TEACHER MOBILE NUMBER");
			String mobileNumber = sc.nextLine();
			System.out.println("ENTER THE TEACHER CITY");
			String city = sc.nextLine();
			teacherdetails.setTeacherId(teacherId);
			teacherdetails.setName(name);
			teacherdetails.setGender(gender);
			teacherdetails.setQualification(qualification);
			teacherdetails.setSubjectName(subjectName);
			teacherdetails.setMobleNumber(mobileNumber);
			teacherdetails.setCity(city);

			boolean addvalidation = adminTeacherdao.addteacherdetails(teacherdetails);
			if (addvalidation) {
				System.out.println("A new student data was inserted successfully!");
				admincurd.admincurd();
			} else {
				System.out.println("A new student data was not inserted successfully!");
				add();
			}
		}
		
	}

	public void update() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE TEACHER ID");
		int teacherId = sc.nextInt();
		System.out.println("ENTER THE TEACHER MOBILE NUMBER");
		sc.nextLine();
		String mobileNumber = sc.nextLine();
		System.out.println("ENTER THE TEACHER CITY");
		String city = sc.nextLine();
		teacherdetails.setTeacherId(teacherId);
		teacherdetails.setMobleNumber(mobileNumber);
		teacherdetails.setCity(city);
		adminTeacherdao.updateteacherdetails(teacherdetails);
		boolean addvalidation = adminTeacherdao.addteacherdetails(teacherdetails);
		if (addvalidation) {
			System.out.println("A new teacher data was  updated successfully!");
			admincurd.admincurd();
		} else {
			System.out.println("A new teacher data was not  updated successfully!");
			update();
		}
	}

	public void delete() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE teacher ID");
		int studentId = sc.nextInt();
		teacherdetails.setTeacherId(studentId);
		adminTeacherdao.deleteteacherdetails(teacherdetails);
		boolean addvalidation = adminTeacherdao.addteacherdetails(teacherdetails);
		if (addvalidation) {
			System.out.println("A new teacher data was delete successfully!");
			admincurd.admincurd();
		} else {
			System.out.println("A new teacher data was not deleted successfully!");
			delete();
		}
	}

	public void display() throws SQLException, Exception {
		// TODO Auto-generated method stub
		adminTeacherdao.displayteacherdetails();
	}

}
