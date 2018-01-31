<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.classes.UserBean" %>
<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.classes.ConnectionCon"%>
<%@ page session = "false" %>
<% HttpSession session = request.getSession(false); %>
<%
int id =Integer.parseInt(request.getParameter("id"));
Connection con = null;
 
try{
	UserBean user = (UserBean)session.getAttribute("user");
    con = ConnectionCon.getConnection();    
    PreparedStatement ps = con.prepareStatement("select dp from agents where agent_id=?");
    ps.setInt(1, id);
    ResultSet rs = ps.executeQuery();
 
    if(rs.next()){
        Blob blob = rs.getBlob("dp");
        byte byteArray[] = blob.getBytes(1, (int)blob.length());
        user.setDp(byteArray);
        response.setContentType("image/gif");
        OutputStream os = response.getOutputStream();
        os.write(byteArray);
        os.flush();
        os.close();
    }
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
%>