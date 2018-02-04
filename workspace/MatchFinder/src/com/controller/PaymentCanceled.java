package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classes.UserBean;
import com.classes.UserDAO;

@WebServlet("/PaymentCanceled")
public class PaymentCanceled extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PaymentCanceled() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
//		HttpSession session = request.getSession(false);
    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1 style='margin-top:50px;text-align:center;'>Payment Canceled by you ....</h1>");
		RequestDispatcher rd=request.getRequestDispatcher("paymentError.jsp");  
		rd.forward(request, response);
	}
	
	}

