package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementProcedureCall {

	public static void main(String[] args) {
		//callProcedure(1,10);
		callProcedureTryWithResource(1,10);
	}
	
	public static void callProcedure(Integer pageNo, Integer pageSize){
		Connection conn = null;
		CallableStatement callstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
			callstmt = conn.prepareCall("{CALL getPaginatedEmployeeDataAndCount(?,?,?)}");
			callstmt.setInt(1, pageNo);
			callstmt.setInt(2, pageSize);
			callstmt.registerOutParameter(3, Types.INTEGER);
			boolean isExcuted = callstmt.execute();			
			
			if(isExcuted){
				Integer totalCount = callstmt.getInt(3);
				System.out.println("Total record count is = "+totalCount);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				callstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}		
	}
	
	
	
	public static void callProcedureTryWithResource(Integer pageNo, Integer pageSize){
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
				CallableStatement callstmt = conn.prepareCall("{CALL getPaginatedEmployeeDataAndCount(?,?,?)}");) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			callstmt.setInt(1, pageNo);
			callstmt.setInt(2, pageSize);
			callstmt.registerOutParameter(3, Types.INTEGER);
			boolean isExcuted = callstmt.execute();			
			
			if(isExcuted){
				Integer totalCount = callstmt.getInt(3);
				System.out.println("Total record count is = "+totalCount);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}

}
