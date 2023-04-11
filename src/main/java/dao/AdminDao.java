package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.AdminBean;
import util.DbConnection;

public class AdminDao {
	
	
public AdminBean adminAuthentication(String email, String password) {
		
		AdminBean bean = null;
		
		Connection con = null;
		
		try 
		{
			con = DbConnection.getConnection();
		
			PreparedStatement ps = con.prepareStatement("Select * from ADMIN_DATA WHERE email=? and password=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				bean = new AdminBean();
				
				bean.setName(rs.getString("name"));
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return bean;
		

	
}

	
}



