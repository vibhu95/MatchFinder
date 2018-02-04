<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@include file="form_header.jsp" %>
<%@page import="com.controller.*" %>

<!-- Mixins-->
<!-- Pen Title-->
<!--<div class="rerun"><a href="">Rerun Pen</a></div> -->
<div class="container">
  <div class="card"></div>
  <div class="card">
<% String msg=request.getParameter("msg"); if(msg!=null){
%>
<h1 class="title" style="font-size:14px">
<%
out.print(msg+" !! Try Again.."); %></h1> <% }%>
    <h1 class="title">Login</h1>
    <form action="../Login" method="post">
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
  <!-- Ajax for checking new user existence in database -->
  <script>
  var mail = document.getElementByName("mail");
  var myForm = document.getElementByName("myForm");
  function ValidateEmail(mail) 
  {
   if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myForm.email.value))
    {
	  function sendInfo();
      return (true);
    }
      document.getElementById("mailWarn").innerHTML = "Invalid email format";
      return (false);
  }
  var request;
  function sendInfo()
  {
	  alert("sendinf");
  var v=document.getElementByName('email').value; 
  var url="../ValidateUser?val="+v;
  if(window.XMLHttpRequest){
  request=new XMLHttpRequest();
  }
  else if(window.ActiveXObject){
  request=new ActiveXObject("Microsoft.XMLHTTP");
  }
  try{
  request.onreadystatechange=getInfo;
  request.open("POST",url,true);
  request.send();
  }catch(e){alert("Unable to connect to server");}
  }
  function getInfo(){
	  alert("getinf");
  if(request.readyState==4){
  var val=request.responseText;
  document.getElementById('valid').innerHTML=val;
  }}

  function validatePassword() {
alert("PasswordVaalidate");
		var pass = document.getElementById("password").value;
		var cnfpass = document.getElementById("password2").value;
	   var msg = document.getElementById("warn");     	
		if (pass != cnfpass) {
					msg.innerHTML = "Passwords do not match."; 
				return false;
	    }
		else
			{
			msg.innerHTML = ""; 
					return true;
			}
	}
 </script>
  
  <div class="card alt" style="background-color: #ed2553; margin-bottom: 10px;">
    <div class="toggle"></div>
    <h1 class="title">Register
      <div class="close"></div>
    </h1>
    <form action="../SignUp" method="post" name="myForm" onsubmit="">
      <div class="input-container">
        <input type="text" name="name" id="#label" required="required"/>
        <label for="#label">Name</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="age_of_agent" id="#label" required="required"/>
        <label for="#label">Age of Agent</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="age_of_business" id="#label" required="required"/>
        <label for="#label">Age of Business</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="email" onchange="sendInfo()" name="email" id="#label" required="required"/>
        <label for="#label">Email</label>
        <div class="bar"></div>
       <p id="valid" style="color:white; margin-bottom:10px; font-size:18px; letter-spacing:2px"></p>
      </div>
      <div class="input-container">
        <input type="text" name="contact" onkeypress="return event.charCode >= 48 && event.charCode <= 57" maxlength="10" id="#label" required="required"/>
        <label for="#label">Contact Number</label>
        <div class="bar"></div>
      </div>
     <div class="input-container">
        <input type="text" name="address" id="#label" required="required"/>
        <label for="#label">Address</label>
        <div class="bar"></div>
      </div>
        <input id="lat" type="hidden" name="lat" />
        <input id="lan" type="hidden" name="lan" />
       <div class="input-container">
        <input type="password" id="password" name="password" onblur="validatePassword()" id="#label" required="required"/>
        <label for="#label">Password</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" id="password2" name="password2" onkeyup="validatePassword()" id="#label" required="required"/>
        <label for="#label">Confirm Password</label>
        <div class="bar"></div>
      </div>
       <p id="warn" style="color:white; margin-bottom:10px; font-size:18px; letter-spacing:2px"></p>
      <div class="button-container">
        <button><span>Next</span></button>
      </div>
    </form>
  </div>
 </div>
 
 <script>
var x = document.getElementById("lat");
var y = document.getElementById("lan");
getLocation();
function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        x.value = 28;
        y.value = 77;
    }
}
function showPosition(position) {
    x.value = position.coords.latitude;
    y.value = position.coords.longitude; 
}
</script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="js/index.js"></script>
</body>
</html>
