package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelectQuery {
	public static void main(String[] args) {
		PreparedStatementSelectQuery.printEmployeeData("FEMALE", 20000);
	}
	
	public static void printEmployeeData(String gender, Integer Salary){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
			pstmt = conn.prepareStatement("select employeeId,name,gender,salary from satyamemployee where gender=? and salary>?");
			pstmt.setString(1, gender);
			pstmt.setInt(2, Salary);
			rs = pstmt.executeQuery();
			
			// Extract data from result set
			while(rs.next()){
				// Retrieve by column name
				System.out.print("EmployeeId: " + rs.getInt("employeeId"));
				System.out.print(", Name: " + rs.getString("name"));
				System.out.print(", Gender: " + rs.getString("gender"));
				System.out.println(", Salary: " + rs.getString("salary"));				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
