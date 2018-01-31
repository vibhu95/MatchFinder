package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s=request.getParameter("val");  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shop","root","root");  
		PreparedStatement ps=con.prepareStatement("select * from test where name=?");  
		ps.setString(1,s);  
		ResultSet rs=ps.executeQuery();  
		while(rs.next()){  
		out.print("User Already Exist!");  
		}  
		con.close();  
		}catch(Exception e){e.printStackTrace();}  
		}  
	}

