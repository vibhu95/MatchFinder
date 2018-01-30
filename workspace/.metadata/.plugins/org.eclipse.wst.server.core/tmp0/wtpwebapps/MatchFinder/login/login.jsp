<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@include file="form_header.jsp" %>

<!-- Mixins-->
<!-- Pen Title-->
<!--<div class="rerun"><a href="">Rerun Pen</a></div> -->
<div class="container">
  <div class="card"></div>
  <div class="card">
    <h1 class="title">Login</h1>
    <form action="SignIn">
      <div class="input-container">
        <input type="email" id="#label" name="email" required="required"/>
        <label for="#label">Email</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" name="password" id="#label" required="required"/>
        <label for="#label">Password</label>
        <div class="bar"></div>
      </div>
      <div class="button-container">
        <button><span>Go</span></button>
      </div>
      <div class="footer"><a href="forget.jsp">Forgot your password?</a></div>
    </form>
  </div>
  <div class="card alt" style="background-color: #ed2553; margin-bottom: 10px;">
    <div class="toggle"></div>
    <h1 class="title">Register
      <div class="close"></div>
    </h1>
    <form action="SignUp">
      <div class="input-container">
        <input type="text" name="name" id="#label" required="required"/>
        <label for="#label">Name</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="age" id="#label" required="required"/>
        <label for="#label">Age of Agent</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="experience" id="#label" required="required"/>
        <label for="#label">Age of Business</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="email" name="email" id="#label" required="required"/>
        <label for="#label">Email</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" name="password" id="#label" required="required"/>
        <label for="#label">Password</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" name="password" id="#label" required="required"/>
        <label for="#label">Repeat Password</label>
        <div class="bar"></div>
      </div>
      <div class="button-container">
        <button><span>Next</span></button>
      </div>
    </form>
  </div>
 </div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="js/index.js"></script>
</body>
</html>