package com.classes;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCon 
{
	static Connection con = null;
	public static Connection getConnection(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root", "");
	   }
	catch(Exception e){
		System.out.println(e);
	     }	
	return con;
	}
}
