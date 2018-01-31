package com.controller;

import com.classes.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignUp() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		int age_of_agent = Integer.parseInt(request.getParameter("age_of_agent"));
		int age_of_business = Integer.parseInt(request.getParameter("age_of_business"));
		String email = request.getParameter("email");
		long contact = Long.parseLong(request.getParameter("contact"));
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		double lat = Double.parseDouble(request.getParameter("lat"));
		double lan = Double.parseDouble(request.getParameter("lan"));
		PrintWriter out = response.getWriter();
	//	 out.write("name: "+name+"<br> age: "+age_of_agent+"<br> experience :"+age_of_business+"<br> email: "+email+"<br> contact: "+contact+"<br> address: "+address+"<br>  " +
	//	 		" password : "+password+"<br> lat : "+lat+"<br> lan : "+lan);
        UserBean b = new UserBean();
        b.setName(name);
        b.setAge_of_agent(age_of_agent);
        b.setAge_of_Business(age_of_business);
		b.setEmail(email);
		b.setContact(contact);
		b.setAddress(address);
		b.setPassword(password);
		b.setLat(lat);
		b.setLan(lan);
		
		b = UserDAO.insert(b);
		response.setContentType("text/html");
		if(b.getStatus()==1){
	        out.write("Status :"+b.getMsg());
		}
		else{
	        out.write("Status :"+b.getMsg());
		}
		 
	}

}
