package com.controller;
import java.sql.*;

public class ControllerClass {

		   static java.sql.Connection conn;
		
			public static Connection dbConnector()
		{
			
			try {
				String url="jdbc:mysql://localhost:3307/shop";
				String user="root";
				String password="root";
				Class.forName("com.mysql.jdbc.Driver");
	            conn=DriverManager.getConnection(url, user, password);
	  		
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
	}

	
