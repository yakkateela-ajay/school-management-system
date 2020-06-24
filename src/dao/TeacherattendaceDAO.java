package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Attendance;
import utility.ConnectionManager;

public class TeacherattendaceDAO implements TeacherattendanceDAOinterface {

	@Override
	public boolean addattendacedao(Attendance attendanceobj) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int StudentId = attendanceobj.getStudentId();
		float attendace = attendanceobj.getAttendance();
		ConnectionManager cm = new ConnectionManager();
		// insert all details into database
		String sql = "insert into ATTENDANCE(STUDENTID,ATTENDANCE)VALUES(?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setInt(1, StudentId);
		st.setFloat(2, attendace);
		int rowsupdated = st.executeUpdate();
		if (rowsupdated > 0) {
			return true;
		} else {

			return false;
		}

	}

	@Override
	public boolean updateattendacedao(Attendance attendanceobj) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int StudentId = attendanceobj.getStudentId();
		float attendace = attendanceobj.getAttendance();

		ConnectionManager cm = new ConnectionManager();
		String sql = "UPDATE ATTENDANCE SET ATTENDANCE=?, WHERE STUDENTID=?";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);

		st.setFloat(1, attendace);
		st.setInt(2, StudentId);
		int rowsupdated = st.executeUpdate();
		if (rowsupdated > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteattendacedao(int studentId) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm = new ConnectionManager();
		String sql = "DELETE FROM ATTENDANCE WHERE STUDENTID=?";

		PreparedStatement statement = cm.getConnection().prepareStatement(sql);
		statement.setInt(1, studentId);

		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			return true;
		} else {
			System.out.println("enter a valid student id to delete data");

			return false;
		}

	}

	@Override
	

	public void displaysixth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from ATTENDANCE WHERE STUDENTID>600 AND STUDENTID<700 ORDER BY STUDENTID");
		System.out.println("THE STUDENT ATTENDANCE DEATILS");
		System.out.println("STUDENTID\tATTENDANCE");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
			 float attendance= rs.getFloat("ATTENDANCE");
	         System.out.println(studentId+"\t"+attendance);
		}
	}
	public void displayseventh() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from ATTENDANCE WHERE STUDENTID>700 AND STUDENTID<800");
		System.out.println("THE STUDENT ATTENDANCE DEATILS");
		System.out.println("STUDENTID\tATTENDANCE");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
			 float attendance= rs.getFloat("ATTENDANCE");
	         System.out.println(studentId+"\t"+attendance);
		}
	}
	public void displayeighth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from ATTENDANCE WHERE STUDENTID>800 AND STUDENTID<900");
		System.out.println("THE STUDENT ATTENDANCE DEATILS");
		System.out.println("STUDENTID\tATTENDANCE");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
			 float attendance = rs.getFloat("ATTENDANCE");
	         System.out.println(studentId+"\t"+attendance);
		}
	}
	public void displayninth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from ATTENDANCE WHERE STUDENTID>900 AND STUDENTID<1000");
		System.out.println("THE STUDENT ATTENDANCE DEATILS");
		System.out.println("STUDENTID\tATTENDANCE");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
			 float attendance = rs.getFloat("ATTENDANCE");
	         System.out.println(studentId+"\t"+attendance);
		}
	}
	public void displaytenth() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from ATTENDANCE WHERE STUDENTID>1000");
		System.out.println("THE STUDENT ATTENDANCE DEATILS");
		System.out.println("STUDENTID\tATTENDANCE");
		while(rs.next()){
			 int studentId = rs.getInt("STUDENTID");
	         float attendance = rs.getFloat("ATTENDANCE");
	         System.out.println(studentId+"\t"+attendance);
		}
	}

}
