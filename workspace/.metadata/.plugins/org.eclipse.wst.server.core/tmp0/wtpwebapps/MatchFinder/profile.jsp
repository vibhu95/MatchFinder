<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="javax.servlet.http.*" %>
<%@page import="com.classes.*" %>
<%@page import="com.controller.*" %>
<%@include file="header.jsp" %>

<body>

<%  
if(request.getParameter("id")!=null){
int id = Integer.parseInt(request.getParameter("id")); } 
%>






</body>
<%@include file="footer.jsp" %>
