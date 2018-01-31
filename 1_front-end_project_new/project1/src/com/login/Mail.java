package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;
import javax.*;

@WebServlet("/Mail")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public Mail() {
        super();
     }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String to = (String)request.getParameter("Email");
		  // Sender's email ID needs to be mentioned
	      String from = "vibhutinarayan995@gmail.com";
	      String pwd = "pu13/305";
	      String sub = "Subscription Confirmation from DacorPrint Newsletter !!!";
	      String msg = "Greetings of the day!!!"+"Dear Customer, thanks for subscribing for our newsletter. " +
	      		"Now you will get updates on latest products ";
	   
	      Mailer.send(from,pwd,to,sub,msg);
	      RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	      rd.forward(request,response);  
	      
	}
}
