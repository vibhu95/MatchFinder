<!-- header -->
	<div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88"
		aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;</button>
					<h4 class="modal-title" id="myModalLabel">
						Don't Wait, Login now!</h4>
				</div>
				<div class="modal-body modal-body-sub">
					<div class="row">
						<div class="col-md-8 modal_body_left modal_body_left1" style="border-right: 1px dotted #C2C2C2;padding-right:3em;">
							<div class="sap_tabs">	
								<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
									<ul>
										<li class="resp-tab-item" aria-controls="tab_item-0"><span>Sign in</span></li>
										<li class="resp-tab-item" aria-controls="tab_item-1"><span>Sign up</span></li>
									</ul>		
									<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
										<div class="facts">
											<div class="register">
												<form action="AdminLogin" method="post">			
													<input name="Email" placeholder="Email Address" type="email" required="" autofocus>						
													<input name="Password" placeholder="Password" type="password" required="">										
													<div class="sign-up">
														<input type="submit" value="Sign in"/>
													</div>
												</form>
											</div>
										</div> 
									</div>	

									<div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
										<div class="facts">
											<div class="register">
												<form action="AdminRegister" method="post" id="Myform" name="MyForm">			
													<input placeholder="Name" name="Name" type="text" required="required">
													<input placeholder="Email Address" name="Email" id="Email" type="email" onblur="sendInfo()" required="required">	
													<div id="valid" style="color:red;"></div>
													<input placeholder="Password" id="Password" name="Password" type="password" required="required">	
													<input placeholder="Confirm Password" id="CnfPassword" name="CnfPassword" onkeyup="validatePassword()" type="password" required="required">
													<div id="warn" style="color:red;"></div>
											    	<input placeholder="Mobile Number" style="margin-top:3% " name="Contact" id="Contact" maxlength="10" onkeypress='return event.charCode >= 48 && event.charCode <= 57' type="text" required="required">	
												    <div class="sign-up">
														<input type="submit" value="Create Account"/>
													</div>
												</form>
											</div>
										</div>
									</div> 			        					            	      
								</div>	
							</div>
							<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
							<script type="text/javascript">
								$(document).ready(function () {
									$('#horizontalTab').easyResponsiveTabs({
										type: 'default', //Types: default, vertical, accordion           
										width: 'auto', //auto or any width like 600px
										fit: true   // 100% fit in a container
									});
								});
							</script>
							<div id="OR" class="hidden-xs">
								OR</div>
						</div>
						<div class="col-md-4 modal_body_right modal_body_right1">
							<div class="row text-center sign-with">
								<div class="col-md-12">
									<h3 class="other-nw">
										Sign in with</h3>
								</div>
								<div class="col-md-12">
									<ul class="social">
										<li class="social_facebook"><a href="#" class="entypo-facebook"></a></li>
										<li class="social_dribbble"><a href="#" class="entypo-dribbble"></a></li>
										<li class="social_twitter"><a href="#" class="entypo-twitter"></a></li>
										<li class="social_behance"><a href="#" class="entypo-behance"></a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%
	if(session.getAttribute("username")==null)
	{
	%>
	<script>
		$('#myModal88').modal('show');
	</script>
	<%
	}
	else
	{
	%>
	<script>
	$('#myModal88').modal('hide');

	</script>
	<%
	}
	%>
			<div class="header">
			<div style="font-size:20px; color:silver; text-align:center" width="5px"><b>Welcome admin ${username}</b></div>
				<div class="container">
				<div class="w3l_login">
	<%
	if(session.getAttribute("username")==null)
	{	%>
	<a href="#" data-toggle="modal" data-target="#myModal88"><span class="glyphicon glyphicon-user" aria-hidden="true"><br>SignIn</span></a>
	<%	
	}
	else
	{
	%>
	<a href="Logout" target="Logout"><span title="Happy to see you  ${username}" class="glyphicon glyphicon-user"><br>LogOut</span></a>
<!-- 	<div style="font-size:20px; color:gray;" width="5px">${username}</div>  -->
	
	<%
	}
	%>
			</div>
			<div class="w3l_logo">
				<h1><a href="index.jsp">DacorPrint: Shop<span>Of Loving Stuffs</span></a></h1>
			</div>
			<div class="search">
				<input class="search_box" type="checkbox" id="search_box">
				<label class="icon-search" for="search_box"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
				<div class="search_form">
					<form action="Search" method="post">
						<input type="text" name="Search" placeholder="Search...">
						<input type="submit" value="Send">
					</form>
				</div>
			</div>
			
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="navigation">
		<div class="container">
			<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
					<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div> 
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.jsp" class="act">Home</a></li>	
						<!-- Mega Menu -->
						<li><a href="products.jsp">Products</a></li>
						
						<li><a href="insert.jsp">Upload Product</a></li>
					
						<li><a href="user.jsp">View User</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
<!-- //header -->
