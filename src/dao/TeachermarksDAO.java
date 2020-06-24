package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Marks;
import utility.ConnectionManager;

public class TeachermarksDAO {

	public boolean addmarksDAO(Marks marks) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		//insert all details into database
		String sql="insert into MARKS(STUDENTID,TELUGU,ENGLISH,MATHS,SCIENCE,SOCIAL)VALUES(?,?,?,?,?,?)";
		PreparedStatement st =cm.getConnection().prepareStatement(sql);
		st.setInt(1,marks.getStudentId());
		st.setInt(2,marks.getTelugu());
		st.setInt(3,marks.getEnglish());
		st.setInt(4,marks.getMaths());
		st.setInt(5,marks.getScience());
		st.setInt(6,marks.getSocial());
		int rowsInserted = st.executeUpdate();
		if (rowsInserted > 0) {
		    return true;
		}else{
			System.out.println("A new student data was not inserted successfully!");
			return false;
		}
		
		
	}

	public boolean updatemarks(int studentId, String subject, int marks) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		String sql = "UPDATE MARKS SET "+subject+"=?  WHERE STUDENTID=?";		 
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setInt(1,marks);
		st.setInt(2,studentId);		 
		int rowsUpdated = st.executeUpdate();
		if (rowsUpdated > 0) {
		    System.out.println("An existing user was updated successfully!");
		    return true;
		}else{
			System.out.println("A new student data was not updated successfully!");
			return false;
		}
		
	}

	public boolean deletemarksDAO(Marks marks) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm=new ConnectionManager();
		String sql = "DELETE FROM MARKS WHERE STUDENTID=?";
		 
		PreparedStatement statement = cm.getConnection().prepareStatement(sql);
		statement.setInt(1, marks.getStudentId());
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A student data was deleted successfully!");
		    return true;
		}else{
			System.out.println("enter a valid student id to delete data");
			return false;
		}
		
	}
	public void displaysixth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from MARKS WHERE STUDENTID>600 AND STUDENTID<700");
		System.out.println("THE STUDENT MARKS DEATILS");
		System.out.println("STUDENTID\tTELUGU\tENGLISH\tMATHS\tSCIENCE\tSOCIAL");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         int telugu = rs.getInt("TELUGU");
	         int english=rs.getInt("ENGLISH");
	         int maths=rs.getInt("MATHS");
	         int science=rs.getInt("SCIENCE");
	         int social=rs.getInt("SOCIAL");
	         System.out.println(studentId+"\t"+telugu+"\t"+english+"\t"+maths+"\t"+science+"\t"+social);
		}
	}
	public void displayseventh() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from MARKS WHERE STUDENTID>700 AND STUDENTID<800");
		System.out.println("THE STUDENT MARKS DEATILS");
		System.out.println("STUDENTID\tTELUGU\tENGLISH\tMATHS\tSCIENCE\tSOCIAL");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         int telugu = rs.getInt("TELUGU");
	         int english=rs.getInt("ENGLISH");
	         int maths=rs.getInt("MATHS");
	         int science=rs.getInt("SCIENCE");
	         int social=rs.getInt("SOCIAL");
	         System.out.println(studentId+"\t"+telugu+"\t"+english+"\t"+maths+"\t"+science+"\t"+social);
		}
	}
	public void displayeighth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from MARKS WHERE STUDENTID>800 AND STUDENTID<900");
		System.out.println("THE STUDENT MARKS DEATILS");
		System.out.println("STUDENTID\tTELUGU\tENGLISH\tMATHS\tSCIENCE\tSOCIAL");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         int telugu = rs.getInt("TELUGU");
	         int english=rs.getInt("ENGLISH");
	         int maths=rs.getInt("MATHS");
	         int science=rs.getInt("SCIENCE");
	         int social=rs.getInt("SOCIAL");
	         System.out.println(studentId+"\t"+telugu+"\t"+english+"\t"+maths+"\t"+science+"\t"+social);
		}
	}
	public void displayninth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from MARKS WHERE STUDENTID>900 AND STUDENTID<1000");
		System.out.println("THE STUDENT MARKS DEATILS");
		System.out.println("STUDENTID\tTELUGU\tENGLISH\tMATHS\tSCIENCE\tSOCIAL");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         int telugu = rs.getInt("TELUGU");
	         int english=rs.getInt("ENGLISH");
	         int maths=rs.getInt("MATHS");
	         int science=rs.getInt("SCIENCE");
	         int social=rs.getInt("SOCIAL");
	         System.out.println(studentId+"\t"+telugu+"\t"+english+"\t"+maths+"\t"+science+"\t"+social);
		}
	}
	public void displaytenth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from MARKS WHERE STUDENTID>1000");
		System.out.println("THE STUDENT MARKS DEATILS");
		System.out.println("STUDENTID\tTELUGU\tENGLISH\tMATHS\tSCIENCE\tSOCIAL");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         int telugu = rs.getInt("TELUGU");
	         int english=rs.getInt("ENGLISH");
	         int maths=rs.getInt("MATHS");
	         int science=rs.getInt("SCIENCE");
	         int social=rs.getInt("SOCIAL");
	         System.out.println(studentId+"\t"+telugu+"\t"+english+"\t"+maths+"\t"+science+"\t"+social);
		}
	}
	
}
