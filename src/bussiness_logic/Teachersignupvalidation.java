package bussiness_logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Teacher_registration;
import utility.ConnectionManager;

public class Teachersignupvalidation {
	public boolean validateteachersignup(Teacher_registration teacherregistration) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int teacherId=teacherregistration.getTeacherId();
		String password=teacherregistration.getPassword();
		String confPass=teacherregistration.getConfPass();
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from TEACHER_DETAILS");
	
		while(rs.next()){
			
			int teacherid1=rs.getInt("TEACHERID");
			if((teacherId==teacherid1)&&password.equals(confPass))
			{
				
				//con.getConnection().close();
				return true;
			}
		}
		return false;

	
	}
	public boolean validateteacherusername(){
		return false;
		
	}
	public boolean validateusername(String userName) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String username=userName;
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs1=st.executeQuery("SELECT * from TEACHER_REGISTRATION");
		while(rs1.next()){
			String username1=rs1.getString("USERNAME");
			if(!username.equals(username1)){
				//con.getConnection().close();
				return true;
			}
		}
		//con.getConnection().close();
		return false;
	}
	
	
}
