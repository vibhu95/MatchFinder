package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PrintWriter out = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

try {          	response.setContentType("text/html");

	     out = response.getWriter();    
	     UserBean user = new UserBean();
	     user.setUserName(request.getParameter("Email"));
	     user.setFirstName(request.getParameter("Name"));
	     user.setPassword(request.getParameter("Password"));
	     user.setMobileNumber(request.getParameter("Contact"));
	     user = UserDAO.register(user);
	    			        
					        if(user.isValid()){
					              out.println("<h5 style='color:red;'>Registered Successfully</h5>");  
					         }   
					          RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
						      rd.forward(request,response);  
				} catch (Exception e) {

					out.print(e);       
				}
	}  		
	  	
	
	}


