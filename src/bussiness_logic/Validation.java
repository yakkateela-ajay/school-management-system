package bussiness_logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;

public class Validation {

	public boolean addadminstudent(int studentId) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * from STUDENT_DETAILS");
		while (rs.next()) {
			int studentid1 = rs.getInt("STUDENTID");
			if (studentId == studentid1) {
				// con.getConnection().close();
				return true;
			}
		}
		return false;
	}

	public boolean addadminteacher(int teacherId) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * from TEACHER_DETAILS");
		while (rs.next()) {
			int teacherid1 = rs.getInt("TEACHERID");
			if (teacherId == teacherid1) {
				// con.getConnection().close();
				return true;
			}
		}
		return false;
	}

	public boolean addattendance(int studentId) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * from ATTENDANCE");
		while (rs.next()) {
			int studentid1 = rs.getInt("STUDENTID");
			if (studentId == studentid1) {
				// con.getConnection().close();
				return true;
			}
		}
		return false;
	}

}
