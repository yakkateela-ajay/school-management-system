package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import utility.ConnectionManager;

public class StudentOperationsDAO {
	
	
	public void attendancedao(int studentId) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from ATTENDANCE");
		System.out.println("THE STUDENT ATTENDANCE DEATILS");
		while(rs.next()){
			if(studentId==rs.getInt("STUDENTID")){
				 int studentId1 = rs.getInt("STUDENTID");
		         float attendance = rs.getFloat("ATTENDANCE");
		         System.out.println(studentId1+"\t"+attendance);
			}
			else{
				System.out.println("ENTER THE VALID STUDENT ID");
			
			}
		}
		
	}
	public void marksdao(int studentId) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from MARKS");
		System.out.println("THE STUDENT MARKS DEATILS");
		System.out.println("STUDENTID\tTELUGU\tENGLISH\tMATHS\tSCIENCE\tSOCIAL");
		while(rs.next()){
			if(studentId==rs.getInt("STUDENTID")){
			 int studentId1= rs.getInt("STUDENTID");
	         int telugu = rs.getInt("TELUGU");
	         int english=rs.getInt("ENGLISH");
	         int maths=rs.getInt("MATHS");
	         int science=rs.getInt("SCIENCE");
	         int social=rs.getInt("SOCIAL");
	         System.out.println(studentId1+"\t"+telugu+"\t"+english+"\t"+maths+"\t"+science+"\t"+social);
			}
			else{
				System.out.println("ENTER THE VALID STUDENT ID");
			
			}
		}
	
	}

}
