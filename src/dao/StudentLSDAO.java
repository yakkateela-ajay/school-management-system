package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Student_registration;
import utility.ConnectionManager;

public class StudentLSDAO implements Studentloginsignupinterface {
	

	@Override
	public void studentsignup(Student_registration studentregistration) throws Exception {
		// TODO Auto-generated method stub
		int studentId=studentregistration.getStudentId();
		String password=studentregistration.getPassword();
		String confPass=studentregistration.getConfPass();
		ConnectionManager cm = new ConnectionManager();
		// insert all details into database
		String sql = "insert into STUDENT_REGISTRATION(STUDENTID,PASSWORD,CONFPASS)VALUES(?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setInt(1,studentId );
		st.setString(2,password);
		st.setString(3,confPass);
		int rowsInserted = st.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("registration is completed succesfully");
		    
		}
	}

	
	public boolean studentlogin(Student_registration studentregistration) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int studentId=studentregistration.getStudentId();
		String password=studentregistration.getPassword();
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs1=st.executeQuery("SELECT * from STUDENT_REGISTRATION");
		while(rs1.next()){
			
			if(studentId==(rs1.getInt("STUDENTID")) && password.equals(rs1.getString("PASSWORD"))){
	
				//con.getConnection().close();
				
				return true;
			}
		
			
		}
		//con.getConnection().close();
		return false;
		
	}


	
}
