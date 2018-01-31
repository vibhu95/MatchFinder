package com.login;
import java.io.IOException;


import com.login.UserBean;
import com.login.UserDAO;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet {


	PrintWriter out = null;

	private static final long serialVersionUID = 1L;


public void doPost(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, IOException {
try
{	 out = response.getWriter();    
     UserBean user = new UserBean();
     user.setUserName(request.getParameter("Email"));
     user.setPassword(request.getParameter("Password"));

     user = UserDAO.login(user);
	   		    
     if (user.isValid())
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user);
          session.setAttribute("username",user.getFirstName());
          RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	      rd.forward(request,response);  
	    }  
	    else{  
	      	response.setContentType("text/html");
            out.println("<h5 style='color:red;'>Registered Successfully</h5>");  
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	        rd.include(request,response);  
	        
	    }  }
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}