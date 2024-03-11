package com.demo.datamodel;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DataManager {
	    private static final String URL = "jdbc:mysql://localhost:3306/demo";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "Y1012JqkhkpOP";

	    private static Connection connection = null;

	    public static Connection getConnection() {
	        if (connection == null) {
	            try {
	                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return connection;
	    }

	    public static void closeConnection() {
	        if (connection != null) {
	            try {
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}



