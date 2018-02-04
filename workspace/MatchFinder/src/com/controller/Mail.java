package com.controller;

import com.classes.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Properties;
import javax.*;

@WebServlet("/Mail")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public Mail() {
        super();
     }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(false);
		UserBean user = (UserBean) session.getAttribute("user");
		 String to = user.getEmail();
		  // Sender's email ID needs to be mentioned
	      String from = "vibhutinarayan995@gmail.com";
	      String pwd = "pu13/305";
	      String sub = "Subscription Confirmation from Match@Finder !!!";
	      String msg = "Greetings of the day!!!"+"Dear Customer, thanks for subscribing for our Membership of 599/-. " +
	      		"Now you are our premium member " + "YOUR LOGIN CREDENTIALS ARE" +
	      		" USERNAME : "+user.getEmail()+", PASSWORD : "+user.getPassword()+" .";
	   
	      Mailer.send(from,pwd,to,sub,msg);
	      RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	      rd.forward(request,response);  
	      
	}
}
