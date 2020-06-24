package bussiness_logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.StudentSignup;
import model.Student_registration;
import utility.ConnectionManager;

public class Studentsignupvalidation {

	public boolean validatestudentsignup(Student_registration studentregistration) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int studentId=studentregistration.getStudentId();
		String password=studentregistration.getPassword();
		String confPass=studentregistration.getConfPass();
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from STUDENT_DETAILS");
		
		while(rs.next()){
			
			int studentid1=rs.getInt("STUDENTID");
			if(studentId==studentid1&&password.equals(confPass))
			{
				
				//con.getConnection().close();
				return true;
			}
			
		}
		return false;
	}

	
}
