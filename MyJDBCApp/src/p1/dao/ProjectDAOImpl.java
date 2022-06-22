package p1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;

import p1.execptions.InvalidProjectIdException;
import p1.model.Project;

public class ProjectDAOImpl implements ProjectDAO {

	Connection con;

	public ProjectDAOImpl() {
		
		con = MySQLConnection.mySql;
	}

	@Override
	public boolean addProject(Project p)throws InvalidProjectIdException,SQLException
	{
		boolean isInserted = false;
				
		if(p.getProjectNumber() >50)
		{
			throw new InvalidProjectIdException(p.getProjectNumber()+"");
				
		}
		else
		{
			String insertProjectQuery = "insert into project(projectNumber,porjectName,projectHeadEmail) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(insertProjectQuery);
			int x = ps.executeUpdate();
			if(x>0) isInserted = true;
		}
	
		return isInserted;
	}

	
	@Override
	public boolean deleteProject(int projectId) {
		
		boolean isDeleted = false;
		
		String updateEmployeeQuery = "update ncsemployee set projectInfo = null where projectInfo = ?";
		String deleteProjectQuery = "delete from  project where projectNumber = ?";
		try {
			
			con.setAutoCommit(false);
			
			// update employee table
			PreparedStatement  psUpdate = con.prepareStatement(updateEmployeeQuery);
			psUpdate.setInt(1, projectId);
			
			int rowsEffected = psUpdate.executeUpdate();
			System.err.println("INFO : "+LocalTime.now()+" rows effected after update :- "+rowsEffected);
			
			
			// delete project table
			PreparedStatement  psDelete = con.prepareStatement(deleteProjectQuery);
			psDelete.setInt(1, projectId);
			
			int deleteRowsEffected = psDelete.executeUpdate();
			System.err.println("INFO : "+LocalTime.now()+" rows effected after delete :- "+rowsEffected);
			
			if(rowsEffected != 0 && deleteRowsEffected !=0)
			{
				con.commit();
				System.err.println("INFO : "+LocalTime.now()+" Data based Commited !!!");
				isDeleted = true;
			}
			
		} catch (Exception e) {
			try {
				System.err.println("Inside catch Block :- "+e);
				con.rollback();
			} catch (SQLException e1) {
				System.out.println("Exception during roll back "+e);
			}
		}

		
		return isDeleted;
	}

	@Override
	public Project getProjectById(int projectId)throws SQLException {

		Project outputProject = null;
		
		String query = "select * from project where projectNumber = ?"; // DQL 
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, projectId);
		
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			String projectName = rs.getString(2);
			String projectHeadEmail = rs.getString("projectHeadEmail");
		
			outputProject = new Project();
			outputProject.setProjectNumber(projectId);
			outputProject.setProjectName(projectName);
			outputProject.setProjectHeadEmail(projectHeadEmail);
		}
		
		
		return outputProject;
	}

}//end of class
