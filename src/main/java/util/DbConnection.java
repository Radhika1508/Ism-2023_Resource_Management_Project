package util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {

	
//----------------for check the connection-------------
	
//	public static void main(String[] args) 
//	{
//		Connection con = Test.getConnection();
//		if (con != null) {
//			System.out.println("Success.." + con);
//		} else {
//			System.out.println("Fail..");
//		}
//	}
//}
//class Test {
	

	public static Connection getConnection() {
		Connection con = null;
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meet", "root",
			// "root");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:64053;trustServerCertificate=true;", "sa",
					"root");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
}
