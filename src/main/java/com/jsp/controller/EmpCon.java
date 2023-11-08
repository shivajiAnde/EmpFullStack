package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.employeeDAO.employeeDAO;
import com.jsp.employeeDTO.Employee;

public class EmpCon extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String contactNo=req.getParameter("contactNo");
		String email=req.getParameter("email");
		Employee emp=new Employee();
		emp.setName(name);
		emp.setContactNo(contactNo);
		emp.setEmail(email);
		employeeDAO dao=new employeeDAO();
		PrintWriter out=res.getWriter();
		out.println(dao.save(emp));
		
	}

}
