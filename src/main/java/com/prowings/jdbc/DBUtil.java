package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection connection;
	
	public static Connection getConnection() {
		try {
		      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Sachin@7488");
		      System.out.println("SQL Connection to database established!");
		    } catch (SQLException e) {
		      System.out.println("Connection Failed! Check output console");
		    } 
	    return connection;
		
	}
	
	public static void closeConnection()
	{
		      try
		      {
		        if(connection != null)
		          connection.close();
		        System.out.println("Connection closed !!");
		      }
		      catch (SQLException e) {
		       System.out.println("Error closing connection!!");
		    	  e.printStackTrace();
		      }

	}

}
