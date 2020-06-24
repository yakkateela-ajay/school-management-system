package dao;

import java.sql.SQLException;


import model.Teacher_details;

public interface AdminTacherDAOinterface {
	public boolean addteacherdetails(Teacher_details teacherdetails) throws SQLException, Exception;
	public boolean updateteacherdetails(Teacher_details teacherdetails) throws SQLException, Exception;
	public boolean deleteteacherdetails(Teacher_details teacherdetails) throws SQLException, Exception;
	public void displayteacherdetails() throws SQLException, Exception;
}
