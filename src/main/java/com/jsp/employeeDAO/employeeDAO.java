package com.jsp.employeeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.employeeDTO.Employee;

public class employeeDAO {
	public String save(Employee employee) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/user_data";
			String root="root";
			String password="root";
			Connection conn=DriverManager.getConnection(url,root,password);
			String query="INSERT INTO emp(name,contactNo,email)"+" values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,employee.getName());
			ps.setString(2,employee.getContactNo());
			ps.setString(3,employee.getEmail());
			int res=ps.executeUpdate();
			conn.close();
			return "no of rows update ="+res;
		} catch (ClassNotFoundException | SQLException e) {
			
		}
		return null;
	}
}
