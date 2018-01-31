package com.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import com.login.ConnectionManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertProduct")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection conn=null;
       
   
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		conn=ConnectionManager.getConnection();
		PrintWriter pw = response.getWriter();

		String product_name=request.getParameter("product_name");
		String product_cost=request.getParameter("product_cost");
		String file_path=request.getParameter("file_path");
		String file_path2=request.getParameter("file_path2");
		String file_path3=request.getParameter("file_path3");
		String file_path4=request.getParameter("file_path4");
		String file_path5=request.getParameter("file_path5");
		String file_path6=request.getParameter("file_path6");
		String file_path7=request.getParameter("file_path7");
		String file_path8=request.getParameter("file_path8");
		String category_id=request.getParameter("category_id");
		String product_description=request.getParameter("product_description");
		System.out.println(category_id);
		System.out.println(file_path);
		System.out.println(file_path4);
		System.out.println(file_path6);
		System.out.println(file_path8);
		
		
		try {
			PreparedStatement pst = conn.prepareStatement
					("insert into product(product_name,product_cost,image,category_id,description,image2,image3,image4,image5,image6,image7,image8) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			File file = new File(file_path);
			File file2 = new File(file_path2);
			File file3 = new File(file_path3);
			File file4 = new File(file_path4);
			File file5 = new File(file_path5);
			File file6 = new File(file_path6);
			File file7 = new File(file_path7);
			File file8 = new File(file_path8);
			
			FileInputStream fis = new FileInputStream(file);
			FileInputStream fis2 = new FileInputStream(file2);
			FileInputStream fis3 = new FileInputStream(file3);
			FileInputStream fis4 = new FileInputStream(file4);
			FileInputStream fis5 = new FileInputStream(file5);
			FileInputStream fis6 = new FileInputStream(file6);
			FileInputStream fis7 = new FileInputStream(file7);
			FileInputStream fis8 = new FileInputStream(file8);
			
			pst.setString(1,product_name );
			pst.setString(2, product_cost);
			pst.setBinaryStream(3,fis,fis.available());
			pst.setString(4,category_id);
			pst.setString(5, product_description);
			pst.setBinaryStream(6,fis2,fis2.available());
			pst.setBinaryStream(7,fis3,fis3.available());
			pst.setBinaryStream(8,fis4,fis4.available());
			pst.setBinaryStream(9,fis5,fis5.available());
			pst.setBinaryStream(10,fis6,fis6.available());
			pst.setBinaryStream(11,fis7,fis7.available());
			pst.setBinaryStream(12,fis8,fis8.available());
			
			int i = pst.executeUpdate();
			if(i!=0)
			{
			pw.println("image has been inserted");
			}
			else
			{
			pw.println("image is not inserted");
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
