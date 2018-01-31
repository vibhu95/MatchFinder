package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddToCart() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int u=Integer.parseInt(request.getParameter("userID"));  
		int p=Integer.parseInt(request.getParameter("productId"));  
		System.out.println("cart!!!!");
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shop","root","root");  
		PreparedStatement ps=con.prepareStatement("insert into cart(product_id,customer_id) values(?,?)");  
		ps.setInt(1,p);  
		ps.setInt(2,u);  
		int i=ps.executeUpdate();  
	       if(i>0){
          out.print("Successfuly added to cart!!");  
		}  
		con.close();  
		}catch(Exception e){e.printStackTrace();}  
		}
	
	}


