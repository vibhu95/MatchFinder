package products;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.ConnectionManager;

public class Insertpro  extends HttpServlet{
	
	
	
	private static final long serialVersionUID = 1L;
	Connection conn=null;
    
	   
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		conn=ConnectionManager.getConnection();
		PrintWriter pw = response.getWriter();

		String product_name=request.getParameter("product_name");
		String product_cost=request.getParameter("product_cost");
		String file_path=request.getParameter("file_path");
		String category_id=request.getParameter("category_id");
		String product_description=request.getParameter("product_description");
		System.out.println(category_id);
		System.out.println(file_path);
		
		
	pw.println(product_name);
	
	
	
	}
}
