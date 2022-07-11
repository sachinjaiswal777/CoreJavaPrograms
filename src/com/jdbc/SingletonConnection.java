package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static Connection conn = null;

	private SingletonConnection(){}
	
	public static Connection getConnection(){
		if(conn==null){
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return conn;		
	}

}
