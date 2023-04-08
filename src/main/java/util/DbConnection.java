package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private  static String URLNAME = "jdbc:mysql://localhost:3306/radhika";
	private  static String USERNAME = "root";
	private  static String PASSWORD ="root";
	private  static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static Connection getConnection()
	{
		Connection con =  null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
			System.out.println(" CONNECTION CREATED SUCCESSFULLY.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("CONNECTION IS FAILED..");
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();
		if(con == null)
		{
			System.out.println("connection is not connected");
		}
		else
		{
			System.out.println("connection is created");
		}
	}
}
	
	

