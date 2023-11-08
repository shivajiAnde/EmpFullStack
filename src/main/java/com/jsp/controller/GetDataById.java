package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employeeDAO.DatabaseConnectivityCustomer;
import com.jsp.employeeDTO.Customer;

@WebServlet("/dataById")
public class GetDataById  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		  DatabaseConnectivityCustomer dao=new DatabaseConnectivityCustomer();
		  Customer customer=dao.getDataById(id);
		  PrintWriter writer =resp.getWriter();
		  writer.println(customer);
	}
	
}
