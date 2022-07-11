package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementSelectQuery {
	public static void main(String[] args) {
		StatementSelectQuery.printEmployeeData("MALE", 2000);
	}
	
	public static void printEmployeeData(String gender, Integer salary){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmc", "root", "root");
			conn = SingletonConnection.getConnection();
			stmt = conn.createStatement();
			String query = "select employeeId,name,gender,salary from satyamemployee where gender='"+gender+"' and salary>"+salary;
			System.out.println(query);
			rs = stmt.executeQuery(query);
			
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
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
