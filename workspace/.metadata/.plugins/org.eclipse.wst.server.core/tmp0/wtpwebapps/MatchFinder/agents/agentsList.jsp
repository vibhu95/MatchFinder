<head>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.js" type="text/javascript"></script>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100,500,700,200,300' rel='stylesheet' type='text/css'>
</head>
<body>
<!--start-body-->
			<!--star-wrapper-demo-->
			<div class="wrapper-demo">
				<h1>Friend List</h1>
				<!--start-wrapper-dropdown-2-->
					<div id="dd" class="wrapper-dropdown-2" tabindex="1">Friends<i><img src="images/menu.png"/></i>
									 <!-- start search-->
				    <div class="search-box">
					    <div id="sb-search" class="sb-search">
							<form>
								<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
								<input class="sb-search-submit" type="submit" value="">
								<span class="sb-icon-search"> </span>
							</form>
						</div>
				    </div>
				    <!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- /search-scripts -->
 				<!-- end search-->
							<ul class="dropdown">							
								<div class="friends-grids">
									<div class="grids-left">
										<img src="images/a1.png" />
									</div>	
									<div class="friend-grid"><p class="flowers">14k</p></div>
									<div class="grids-right">
										<h2>Jessica Butler</h2>
										<!--<img src="images/heart.png" />-->
									<ul class="grids-right-info">
											<li class="user">107</li>
											<li class="camera">23</li>
											<li class="chat">6</li>
										<div class="clear"> </div>
									</ul>
									</div>
									<div class="clear"> </div>
								</div>
															<div class="friends-grids">
									<div class="grids-left">
										<img src="images/a2.png" />
									</div>	
									<div class="friend-grid"><p class="flowers">21k</p></div>
									<div class="grids-right">
										<h2>Cristina Williams</h2>
										<!--<img src="images/heart.png" />-->
									<ul class="grids-right-info">
											<li class="user">93</li>
											<li class="camera">57</li>
											<li class="chat">7</li>
										<div class="clear"> </div>
									</ul>
									</div>
									<div class="clear"> </div>
								</div>
							</ul>
					</div>
			</div>
			<!--end-wrapper-dropdown-2-->
			<!--start-script-->
			<script type="text/javascript">
							function DropDown(el) {
								this.dd = el;
								this.initEvents();
							}
							DropDown.prototype = {
								initEvents : function() {
									var obj = this;
				
									obj.dd.on('click', function(event){
										$(this).toggleClass('active');
										event.stopPropagation();
									});	
								}
							}
							$(function() {
				
								var dd = new DropDown( $('#dd') );
				
								$(document).click(function() {
									// all dropdowns
									$('.wrapper-dropdown-2').removeClass('active');
								});
				
							});
			</script>
			<!--end-script-->
			<!--end-wrapper-demo-->
			<!--start-copyright-->
			<div class="copy-right">
					<p>Template by <a href="http://w3layouts.com" target="_blank">w3layouts</a> </p>
			</div>
			<!--end-copyright-->
			<!--end-body-->
	</body>
</html>