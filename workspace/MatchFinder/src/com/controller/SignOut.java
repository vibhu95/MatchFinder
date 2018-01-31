package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SignOut")
public class SignOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public SignOut() {
        super();

  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 HttpSession session=request.getSession(false);  
	     if(session!=null)
	     {
		 session.setAttribute("user","");  
	     session.invalidate();
	     }  
	     response.sendRedirect("index.jsp");
	      }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 HttpSession session=request.getSession(false);  
	     if(session!=null)
	     {
	    	 session.removeAttribute("user");
	    	 session.removeAttribute("user_id");
	    	 session.invalidate();
	     }  
	     response.sendRedirect("index.jsp");
	      }

}
