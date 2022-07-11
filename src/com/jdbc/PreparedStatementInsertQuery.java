package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsertQuery {

	public static void main(String[] args) {
		PreparedStatementInsertQuery.saveEmployee(7, "Rakul", "FEMALE", 60000);
	}

	public static void saveEmployee(Integer id, String name, String gender, Integer salary){
		
		// Open a connection
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
			pstmt = conn.prepareStatement("INSERT INTO satyamemployee VALUES(?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, gender);
			pstmt.setInt(4, salary);
			
			int updateCount= pstmt.executeUpdate();
			System.out.println("Number of record inserted = "+updateCount);
			if(updateCount==1){
				System.out.println("Employee data saved successfully");
			}else{
				System.out.println("Some error occured, Please try again.");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
	}
}
