
<!DOCTYPE html>
<html>
<head>
<%@ include file="topHeader.jsp" %>
</head>
	
<body>
<%@ include file="header.jsp" %>
<!-- banner -->
	<div class="banner10" id="home1">
		<div class="container">
			<h2>Mail Us</h2>
		</div>
	</div>
<!-- //banner -->

<!-- breadcrumbs -->
	<div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Insert Data</li>
			</ul>
		</div>
	</div>
<!-- //breadcrumbs -->

<!-- mail -->
	<div class="mail">
		<div class="container">
			<h3>Mail Us</h3>
			<div class="agile_mail_grids">
				<div class="col-md-5 contact-left">
					<h4>Address</h4>
					<p>A/1, Type-IV, VBSPU Residence
						<span>Jaunpur, UP-222001, India</span></p>
					<ul>
						<li>Telephone :+918090818228</li>
						<li><a href="mailto:vibhutinarayan995@gmail.com">vibhutinarayan995@gmail.com</a></li>
					</ul>
				</div>
				<div class="col-md-7 contact-left">
					<h4>Contact Form</h4>
					<form action="ProductUpload" method="post">
						<input type="text" name="Name" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
						<input type="text" name="Cost" value="Cost" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Cost';}" required="">
						<input type="text" name="Description" value="Telephone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Description';}" required="">
						<input type="file" width="20%" name="image" value="image" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'image';}" required="">
						<select name="category">
						<option value="1">Shirt</option>
						<option value="2">T-shirt</option>
						<option value="3">Mobile Cover</option>
						<option value="4">Top</option>
						</select>
						<input type="submit" value="Submit" >
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>

			<div class="contact-bottom">
				<iframe src="https://www.google.com/maps/embed/v1/place?key=AIzaSyBQIhCz4SWcvRSPi4aGYrGR03ZpxbvwwSQ&q=UNS+Institute+Of+Engineering+Technology" frameborder="0" style="border:0" allowfullscreen></iframe>
			</div>
		</div>
	</div>
<!-- //mail -->

<%@ include file="newsLetter.jsp" %>

<%@ include file="footer.jsp" %>

</body>
</html>