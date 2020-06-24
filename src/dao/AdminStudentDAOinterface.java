package dao;

import java.sql.SQLException;

import model.Student_details;

public interface AdminStudentDAOinterface {
	public boolean addstudentdetails(Student_details studentdetails) throws SQLException, Exception;
	public boolean updatestudentdetails(Student_details studentdetails) throws SQLException, Exception;
	public boolean deletestudentdetails(Student_details studentdetails) throws SQLException, Exception;
	public void displaysixth() throws SQLException, Exception;
	public void displayseventh() throws SQLException, Exception;
	public void displayeighth() throws SQLException, Exception;
	public void displayninth() throws SQLException, Exception;
	public void displaytenth() throws SQLException, Exception;
}
