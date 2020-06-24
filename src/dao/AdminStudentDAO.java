package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import controller.AdminCURD;
import controller.AdminStudent;
import model.Student_details;
import utility.ConnectionManager;

public class AdminStudentDAO implements AdminStudentDAOinterface{
	Scanner sc=new Scanner(System.in);
	AdminCURD admincurd=new AdminCURD();
	@Override
	public boolean addstudentdetails(Student_details studentdetails) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int StudentId=studentdetails.getStudentId();
		String name=studentdetails.getName();
		String gender=studentdetails.getGender();
		String fatherName=studentdetails.getFatherName();
		String className=studentdetails.getClassName();
		String  mobileNumber=studentdetails.getMobileNumber();
		String city=studentdetails.getCity();
		ConnectionManager cm=new ConnectionManager();
		//insert all details into database
		String sql="insert into STUDENT_DETAILS(STUDENTID,NAME,GENDER,FATHERNAME,CLASSNAME,MOBILENUMBER,CITY)VALUES(?,?,?,?,?,?,?)";
		PreparedStatement st =cm.getConnection().prepareStatement(sql);
		st.setInt(1,StudentId);
		st.setString(2,name );
		st.setString(3,gender);
		st.setString(4,fatherName );
		st.setString(5,className);
		st.setString (6,mobileNumber);
		st.setString(7,city);
		int rowsInserted = st.executeUpdate();
		if (rowsInserted > 0) {
		    return true;
		}else{
			System.out.println("A new student data was not inserted successfully!");
			return false;
		}
	}
	public boolean updatestudentdetails(Student_details studentdetails) throws Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		String sql = "UPDATE STUDENT_DETAILS SET MOBILENUMBER=?, CITY=?  WHERE STUDENTID=?";
		 
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setString(1, studentdetails.getMobileNumber());
		st.setString(2, studentdetails.getCity());
		st.setInt(3, studentdetails.getStudentId());
		int rowsInserted = st.executeUpdate();
		if (rowsInserted > 0) {
		    return true;
		}else{
			System.out.println("A new student data was not updated successfully!");
			return false;
		}
	}
	@Override
	public boolean deletestudentdetails(Student_details studentdetails) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		String sql = "DELETE FROM STUDENT_DETAILS WHERE STUDENTID=?";
		 
		PreparedStatement statement = cm.getConnection().prepareStatement(sql);
		statement.setInt(1, studentdetails.getStudentId());
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    return true;
		}else{
			System.out.println("A new student data was not deleted successfully!");
			return false;
		}
	}

	@Override
	public void displaysixth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from STUDENT_DETAILS WHERE CLASSNAME='SIXTH' ORDER BY STUDENTID");
		System.out.println("THE STUDENT DEATILS");
		System.out.println("STUDENTID\t\tNAME\tGENDER\t\t FATHERNAME\t\tCLASSNAME\t\tMOBILENUMBER\t\tCITY");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         String name = rs.getString("NAME");
	         String gender = rs.getString("GENDER");
	         String  fatherName= rs.getString("FATHERNAME");
	         String className = rs.getString("CLASSNAME");
	         String  mobileNumber= rs.getString("MOBILENUMBER");
	         String city = rs.getString("CITY");
	         System.out.println(studentId+"\t\t"+name+"\t\t"+gender+"\t\t"+fatherName+"\t\t"+className+"\t\t"+mobileNumber+"\t\t"+city);
		}
		admincurd.admincurd();
	}

	@Override
	public void displayseventh() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from STUDENT_DETAILS WHERE CLASSNAME='SEVENTH'");
		System.out.println("THE STUDENT DEATILS");
		System.out.println("STUDENTID\t\tNAME\tGENDER\t\t FATHERNAME\t\tCLASSNAME\t\tMOBILENUMBER\t\tCITY");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         String name = rs.getString("NAME");
	         String gender = rs.getString("GENDER");
	         String  fatherName= rs.getString("FATHERNAME");
	         String className = rs.getString("CLASSNAME");
	         String  mobileNumber= rs.getString("MOBILENUMBER");
	         String city = rs.getString("CITY");
	         System.out.println(studentId+"\t\t"+name+"\t\t"+gender+"\t\t"+fatherName+"\t\t"+className+"\t\t"+mobileNumber+"\t\t"+city);
		}
		admincurd.admincurd();
	}

	@Override
	public void displayeighth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from STUDENT_DETAILS WHERE CLASSNAME='EIGHTH'");
		System.out.println("THE STUDENT DEATILS");
		System.out.println("STUDENTID\tNAME\tGENDER\t FATHERNAME\tCLASSNAME\tMOBILENUMBER\tCITY");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         String name = rs.getString("NAME");
	         String gender = rs.getString("GENDER");
	         String  fatherName= rs.getString("FATHERNAME");
	         String className = rs.getString("CLASSNAME");
	         String  mobileNumber= rs.getString("MOBILENUMBER");
	         String city = rs.getString("CITY");
	         System.out.println(studentId+"\t"+name+"\t"+gender+"\t"+fatherName+"\t"+className+"\t"+mobileNumber+"\t"+city);
		}
		admincurd.admincurd();
	}

	@Override
	public void displayninth() throws Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from STUDENT_DETAILS WHERE CLASSNAME='NINTH'");
		System.out.println("THE STUDENT DEATILS");
		System.out.println("STUDENTID\tNAME\tGENDER\t FATHERNAME\tCLASSNAME\tMOBILENUMBER\tCITY");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         String name = rs.getString("NAME");
	         String gender = rs.getString("GENDER");
	         String  fatherName= rs.getString("FATHERNAME");
	         String className = rs.getString("CLASSNAME");
	         String  mobileNumber= rs.getString("MOBILENUMBER");
	         String city = rs.getString("CITY");
	         System.out.print(studentId+"\t"+name+"\t"+gender+"\t"+fatherName+"\t"+className+"\t"+mobileNumber+"\t"+city);
		}
		admincurd.admincurd();
	}
	@Override
	public void displaytenth() throws Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from STUDENT_DETAILS WHERE CLASSNAME='TENTH'");
		System.out.println("THE STUDENT DEATILS");
		System.out.println("STUDENTID\tNAME\tGENDER\t FATHERNAME\tCLASSNAME\tMOBILENUMBER\tCITY");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         String name = rs.getString("NAME");
	         String gender = rs.getString("GENDER");
	         String  fatherName= rs.getString("FATHERNAME");
	         String className = rs.getString("CLASSNAME");
	         String  mobileNumber= rs.getString("MOBILENUMBER");
	         String city = rs.getString("CITY");
	         System.out.println(studentId+"\t"+name+"\t"+gender+"\t"+fatherName+"\t"+className+"\t"+mobileNumber+"\t"+city);
		}
		admincurd.admincurd();
	}
}
