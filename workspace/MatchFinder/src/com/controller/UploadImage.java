package com.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import com.classes.ConnectionCon;
import com.classes.UserBean;

@WebServlet("/UploadImage")
@MultipartConfig(maxFileSize = 16177216)
public class UploadImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UploadImage() {
        super();
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int result = 0;
        HttpSession session = request.getSession(false);
        //String s_id = (String) session.getAttribute("user_id");
        UserBean user = (UserBean) session.getAttribute("user");
    	Part part = request.getPart("dp");
        int id = user.getId();
		Connection con = null;
    	if(part != null){
			try{
				con = ConnectionCon.getConnection();
			    PreparedStatement ps = con.prepareStatement("update agents set dp=? where agent_id='"+id+"'");
			    InputStream is = part.getInputStream();
			    ps.setBlob(1, is);
			    result = ps.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			finally{
				if(con != null){
					try{
						con.close();
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
		
		if(result > 0){
	    	response.sendRedirect("index.jsp");
	    	user.setUpdate(1);
	    	System.out.println("Sucessfully uploaded");
	    }
		else{
			response.sendRedirect("index.jsp");
		   	user.setUpdate(0);
	    	System.out.println("Uploadation Failed");
			 	}
	
	}

}