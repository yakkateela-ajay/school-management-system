package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import controller.AdminCURD;
import model.Teacher_details;
import utility.ConnectionManager;

public class AdminTeacherDAO implements AdminTacherDAOinterface {
	Scanner sc=new Scanner(System.in);
	AdminCURD admincurd=new AdminCURD();
	@Override
	public boolean addteacherdetails(Teacher_details teacherdetails) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int teacherId=teacherdetails.getTeacherId();
		String name=teacherdetails.getName();
		String gender=teacherdetails.getGender();
		String qualification=teacherdetails.getQualification();
		String subjectName=teacherdetails.getSubjectName();
		String  mobileNumber=teacherdetails.getMobleNumber();
		String city=teacherdetails.getCity();
		ConnectionManager cm=new ConnectionManager();
		//insert all details into database
		String sql="insert into TEACHER_DETAILS(TEACHERID,NAME,GENDER,QUALIFICATION,SUBJECTNAME,MOBILENUMBER,CITY)VALUES(?,?,?,?,?,?,?)";
		PreparedStatement st =cm.getConnection().prepareStatement(sql);
		st.setInt(1,teacherId);
		st.setString(2,name );
		st.setString(3,gender);
		st.setString(4,qualification);
		st.setString(5,subjectName);
		st.setString (6,mobileNumber);
		st.setString(7,city);
		int rowsInserted = st.executeUpdate();
		if (rowsInserted > 0) {
		    return true;
		}else{
			System.out.println("A new teacher data was not inserted successfully!");
			return false;
		}
		
	}

	@Override
	public boolean updateteacherdetails(Teacher_details teacherdetails) throws Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		String sql = "UPDATE TEACHER_DETAILS SET MOBILENUMBER=?, CITY=?  WHERE TEACHERID=?";
		 
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setString(1, teacherdetails.getMobleNumber());
		st.setString(2, teacherdetails.getCity());
		st.setInt(3, teacherdetails.getTeacherId());
		int rowsupdated = st.executeUpdate();
		if (rowsupdated > 0) {
		   return true;
		}else{
			System.out.println("A new teacher data was not updated successfully!");
			return false;
		}
	}
	@Override
	public boolean deleteteacherdetails(Teacher_details teacherdetails) throws Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		String sql = "DELETE FROM TEACHER_DETAILS WHERE TEACHERID=?";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setInt(1, teacherdetails.getTeacherId());
		int rowsdelete = st.executeUpdate();
		
		if (rowsdelete>0) {
		    return true;
		}else{
			return false;
		}
		
	}

	@Override
	public void displayteacherdetails() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from TEACHER_DETAILS ORDER BY TEACHERID");
		System.out.println("THE TEACHER DEATILS");
		System.out.println("TEACHERID\tNAME\tGENDER\t QUALIFICATION\tSUBJECT NAME\tMOBILE NUMBER\tCITY");
		while(rs.next()){
			 int teachertId = rs.getInt("TEACHERID");
	         String name = rs.getString("NAME");
	         String gender = rs.getString("GENDER");
	         String  qualification= rs.getString("QUALIFICATION");
	         String subjectName = rs.getString("SUBJECTNAME");
	         String  mobileNumber= rs.getString("MOBILENUMBER");
	         String city = rs.getString("CITY");
	         System.out.println(teachertId+"\t"+name+"\t"+gender+"\t"+qualification+"\t"+subjectName+"\t"+mobileNumber+"\t"+city);
		}
		admincurd.admincurd();
	}
}
