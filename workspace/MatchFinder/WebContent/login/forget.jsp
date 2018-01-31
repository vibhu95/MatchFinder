<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="form_header.jsp" %>
<!--<jsp:include page="form_header.jsp" /> -->
 
<div class="container">
  <div class="card"></div>
  <div class="card">
    <h1 class="title">Password Recovery</h1>
    <form action="../Recovery" method="post">
      <div class="input-container">
        <input type="email" id="#label" name="email" required="required"/>
        <label for="#label">Email</label>
        <div class="bar"></div>
      </div>
      <div class="button-container">
        <button><span>Go</span></button>
      </div>
      <div class="footer"><a href="login.jsp">LogIn</a></div>
    </form >
  </div>
</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="js/index.js"></script>

</body>
</html>