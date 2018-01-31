<!DOCTYPE html>
<html>
<head>

<%@ include file="topHeader.jsp" %>

    <!-- Password and Confirm Password matching code  -->
    <script>
    function validatePassword() {
        	var pass = document.getElementById("Password").value;
        	var cnfpass = document.getElementById("CnfPassword").value;
        	
        	if (pass != cnfpass) {
					document.getElementById("warn").innerHTML = "Passwords do not match."; 
				return false;
            }
        	else
        		{
        		document.getElementById("warn").innerHTML = ""; 
				return true;
        		}
     }
   
    </script>
    
    
    <!-- Ajax for checking new user existence in database  -->
<script>  
var request;  
function sendInfo()  
{  
var v=document.getElementById('Email').value;  
var url="ValidateUser?val="+v;  
  
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
if(request.readyState==4){  
var val=request.responseText;  
document.getElementById('valid').innerHTML=val;  
}  
}  


//document.getElementById("dropdown-toggle").innerHTML = "hi";  
  
</script>  

<!-- Dropdown menu....... -->
<script>

function dropdown() {
    var x = document.getElementById('dropdown-menu multi-column columns-3');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}
function dropup() {
	
    var x = document.getElementById('dropdown-menu multi-column columns-3');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}
</script>
</head>
	
<body>
<%@ include file="header.jsp" %>
<!-- banner -->
	<div class="banner" id="home1">
		<div class="container">
			<h3>fashions fade, <span>style is eternal</span></h3>
		</div>
	</div>
<!-- //banner -->

<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<div class="col-md-5 wthree_banner_bottom_left">
				<div class="video-img">
					<a class="play-icon popup-with-zoom-anim" href="#small-dialog">
						<span class="glyphicon glyphicon-expand" aria-hidden="true"></span>
					</a>
				</div>
						
					<script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
					});
					</script>
			</div>
				
			
			
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //banner-bottom -->







<%@ include file="newsLetter.jsp" %>

<%@ include file="footer.jsp" %>


</body>
</html>