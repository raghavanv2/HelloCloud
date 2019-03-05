package com.vijay.dbfromcloud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToCloudOracle {
	
	public static void main(String[] args) {
		 
	    Connection connection = null;
	    try {
	 
	  // Load the Oracle JDBC driver
	 
	  String driverName = "oracle.jdbc.driver.OracleDriver";
	 
	  Class.forName(driverName);
	 
	 
	  // Create a connection to the database
	 
	  String serverName = "vijaydbinstance.cajdvngdjj7k.us-east-2.rds.amazonaws.com";
	 
	  String serverPort = "1521";
	 
	  String sid = "orcl";
	 
	  String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
	 
	  String username = "raghavanv2";
	 
	  String password = "vikranth123";
	 
	  connection = DriverManager.getConnection(url, username, password);
	 
	   
	 
	  System.out.println("Successfully Connected to the database!");
	 
	   
	    } catch (ClassNotFoundException e) {
	 
	  System.out.println("Could not find the database driver " + e.getMessage());
	    } catch (SQLException e) {
	 
	  System.out.println("Could not connect to the database " + e.getMessage());
	    }
	 
	 }

}
