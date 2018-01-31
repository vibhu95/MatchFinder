package com.controller;

import com.classes.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.io.IOException;
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
    String email = request.getParameter("val");
    Connection con = (Connection) ConnectionCon.getConnection();
		try {
			Statement stm = (Statement) con.createStatement();
        //    result = stm.executeQuery("select email from agents where email");			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
	}


}
