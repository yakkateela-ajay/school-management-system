package dao;

import java.sql.SQLException;

import model.Student_registration;

public interface Studentloginsignupinterface {
	public void studentsignup(Student_registration studentregistration) throws SQLException, Exception;
	public boolean studentlogin(Student_registration studentregistration) throws SQLException, Exception;
}
