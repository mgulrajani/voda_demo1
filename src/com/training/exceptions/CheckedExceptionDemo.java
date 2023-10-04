package com.training.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckedExceptionDemo {
	
	//with the throws keyword we are telling the main method that
	//there are some instructions in this method which might throw SQLException
	public static void main(String[] args) {
	   try {
		createConnection();}
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	}

	private static void createConnection() throws SQLException{
		 String url = " jdbc://oracle:thin/";
		    // method getConnection DriverManager
			/*
			 * try { Connection connection=DriverManager.getConnection(url); Statement
			 * statement = connection.createStatement(); } catch(SQLException sqle) {
			 * System.out.println(sqle.getMessage()); }
			 */
			Connection connection=DriverManager.getConnection(url);
				Statement statement = connection.createStatement();
				
		
	}

}
