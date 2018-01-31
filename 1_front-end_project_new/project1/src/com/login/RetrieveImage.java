package com.login;


import java.io.IOException;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


///@WebServlet("/Retrieveproduct")
public class RetrieveImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String productId = request.getParameter("id");
		 System.out.println("Retrieve image "+productId);
		 ServletOutputStream out = response.getOutputStream();
		String connectionURL = "jdbc:mysql://localhost:3307/shop";
		java.sql.Connection con=null;
		InputStream input = null;
		ResultSet rs;
		try{			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(connectionURL,"root","root");
			PreparedStatement pst=con.prepareStatement("select image from product where product_id=" +productId);
		 rs=	pst.executeQuery();
		while(rs.next())
		{
			String st=rs.getString(1);
			byte[] bytestream=new byte[st.length()];
			input=rs.getBinaryStream(1);
			int imgln=st.length();
	input.read(bytestream, 0, imgln);
		out.write(bytestream, 0, imgln);
		}
		out.flush();
		 input.close();
		 rs.close();
		}
		catch(Exception e){}
	}
}