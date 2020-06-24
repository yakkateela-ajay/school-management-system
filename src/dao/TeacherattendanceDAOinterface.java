package dao;

import java.sql.SQLException;

import model.Attendance;

public interface TeacherattendanceDAOinterface {
	public boolean addattendacedao(Attendance attendanceobj) throws SQLException, Exception;
	public boolean updateattendacedao(Attendance attendanceobj) throws SQLException, Exception;
	public boolean deleteattendacedao(int studentId) throws SQLException, Exception;
	void displaysixth() throws SQLException, Exception;
	void displayseventh() throws SQLException, Exception;
	void displayeighth() throws SQLException, Exception;
	void displayninth() throws SQLException, Exception;
	void displaytenth() throws SQLException, Exception;
}
