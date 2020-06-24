package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Teacher_registration;
import utility.ConnectionManager;

public class TeacherLSDAO {
	
	ConnectionManager con=new ConnectionManager();
	public void teachersignup(Teacher_registration teacherregistration) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int teacherId=teacherregistration.getTeacherId();
		String password=teacherregistration.getPassword();
		String confPass=teacherregistration.getConfPass();
		ConnectionManager cm = new ConnectionManager();
		// insert all details into database
		String sql = "insert into TEACHER_REGISTRATION(TEACHERID,PASSWORD,CONFPASS)VALUES(?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setInt(1,teacherId );
		st.setString(2,password);
		st.setString(3,confPass);
		int rowsInserted = st.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("registration is completed succesfully");
		    
		}
	}

	public boolean teacherlogin(Teacher_registration teacherregistration) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int teacherId=teacherregistration.getTeacherId();
		String password=teacherregistration.getPassword();
		
		Statement st=con.getConnection().createStatement();
		ResultSet rs1=st.executeQuery("SELECT * from TEACHER_REGISTRATION");
		while(rs1.next()){
			
			if(teacherId==(rs1.getInt("TEACHERID")) && password.equals(rs1.getString("PASSWORD"))){
				//con.getConnection().close();
				return true;
			}
		
			
		}
		//con.getConnection().close();
		return false;
		
	}

}
