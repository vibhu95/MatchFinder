package com.controller;

import com.classes.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Login() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
        String pass = request.getParameter("password");		
        PrintWriter out = response.getWriter();
        
        UserBean b = new UserBean();
        b.setEmail(email);
        b.setPassword(pass);
        try {
			b = UserDAO.select(b);
		} catch (SQLException e) {
			System.out.print(e);
		}
        
        if(b.getUpdate() != 0){
        HttpSession session=request.getSession();  
        session.setAttribute("user_id",b.getId());  
        session.setAttribute("user",b);  
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
        rd.include(request, response);  
        }
        else{
        	response.sendRedirect("login/login.jsp?msg=Failed");
        }
        
        
	}

}
