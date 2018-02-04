package com.controller;


import com.classes.*;
import com.classes.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public ValidateUser() {
        super();

   }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int result;
    Connection con;
	PrintWriter out = response.getWriter();
    String email = request.getParameter("val");
	try{  
	con = (Connection) ConnectionCon.getConnection();  
	PreparedStatement ps= (PreparedStatement) con.prepareStatement("select * from agents where email=?");  
	ps.setString(1,email);  
	ResultSet rs=ps.executeQuery();  
	while(rs.next()){  
	out.print("User Already Exist!");  
	}  
	con.close();  
	}catch(Exception e){e.printStackTrace();}  
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int result;
	    Connection con;
		PrintWriter out = response.getWriter();
	    String email = request.getParameter("val");
		try{  
		con = (Connection) ConnectionCon.getConnection();  
		PreparedStatement ps= (PreparedStatement) con.prepareStatement("select * from agents where email=?");  
		ps.setString(1,email);  
		ResultSet rs=ps.executeQuery();  
		while(rs.next()){  
		out.print("User Already Exist!");  
		}  
		con.close();  
		}catch(Exception e){e.printStackTrace();}  
		
		}


}
