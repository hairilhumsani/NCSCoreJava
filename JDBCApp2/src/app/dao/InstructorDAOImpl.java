package app.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.model.Course;
import app.model.Instructor;

public class InstructorDAOImpl implements InstructorDAO {
	
	Connection con;

	public InstructorDAOImpl() {
		con = MySQLConnection.mySql;
	}

	@Override
	public boolean addInstructor(Instructor instructor) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Instructor getInstructor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instructor> getAllIntructors() throws SQLException {
		Instructor output = null;
		String query = "select * from instructor";
		List<Instructor> instructor = new ArrayList<>();

		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		if (rs != null) {
			while (rs.next()) {
				int instructorId = rs.getInt(1);
				String name = rs.getString(2);
				Date dateOfJoining = rs.getDate(3);
				String location = rs.getString(4);

				output = new Instructor(instructorId, name, dateOfJoining, location);
				instructor.add(output);

			}
		}

		return instructor;
	}

}
