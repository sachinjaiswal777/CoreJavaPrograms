package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdateQuery {

	public static void main(String[] args) {
		PreparedStatementUpdateQuery.printEmployeeData(4, "Manju Ambade", 50000);
	}
	
	public static void printEmployeeData(Integer employeeId, String name, Integer salary){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
			pstmt = conn.prepareStatement("update satyamemployee set name=?, salary=? where employeeId=?");
			pstmt.setString(1, name);
			pstmt.setInt(2, salary);
			pstmt.setInt(3, employeeId);
			int updateCount= pstmt.executeUpdate();
			System.out.println("Number of record modified = "+updateCount);
			
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
