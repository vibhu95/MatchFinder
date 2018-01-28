<!DOCTYPE html>
<%@ page import="connectionclass.Connectionclass,java.sql.*,pogoclass.CustomerDetails"%>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>Your Notes</title>
    <!-- Meta -->
    
    
     <!-- Bootstrap for modal -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  
  <!-- End the bootstrap of modal -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Responsive HTML5 Website landing Page for Developers">
    <meta name="author" content="3rd Wave Media">    
    <link rel="shortcut icon" href="favicon.ico">  
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'> 
    <!-- Global CSS -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">   
    <!-- Plugins CSS -->
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css">
    <!-- github acitivity css -->
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/octicons/2.0.2/octicons.min.css">
    <link rel="stylesheet" href="http://caseyscarborough.github.io/github-activity/github-activity-0.1.0.min.css">
    <script type="text/javascript" src="js/jquery-1.6.js"></script>
    <script type="text/javascript"   src="js/jquery-1.6.min.js"></script>
    <!-- Theme CSS -->  
    <link id="theme-style" rel="stylesheet" href="assets/css/styles.css">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head> 

<body style="margin-top:-20px">
    <!-- ******HEADER****** --> 
    <header class="header">
        <div class="container">                       
            <img class="profile-image img-responsive pull-left" src="assets/images/profile.png" alt="James Lee" />
            <div class="profile-content pull-left">
            <% CustomerDetails customerdetails=(CustomerDetails)session.getAttribute("customerdetails"); %>
                <h1 class="name"><%=customerdetails.getCustomer_fname() %></h1>
                <h2 class="desc">Web App Developer</h2>   
                <ul class="social list-inline">
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>                   
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    <li><a href="#"><i class="fa fa-github-alt"></i></a></li>                  
                    <li class="last-item"><a href="#"><i class="fa fa-hacker-news"></i></a></li>                 
                </ul> 
            </div><!--//profile-->
              <button type="button" class="btn btn-info btn-lg pull-right" data-toggle="modal" data-target="#myModal">Add Your Notes</button>
           <!--   <a class="btn btn-cta-primary pull-right" href="#" ><i class="fa fa-paper-plane"></i> Add your Notes</a>       -->         
        </div><!--//container-->
    </header><!--//header-->
    
    <div class="container sections-wrapper">
        <div class="row">
            <div class="primary col-md-8 col-sm-12 col-xs-12">
                <section class="about section">
                    <div class="section-inner">
                        <h2 class="heading">My notes</h2>
                        <div class="content">
                            <p>Write a brief intro about yourself. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec.</p>    
         
        <p>It's a good idea to include your personal interests and hobbies as well. Commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec.Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                         
                        </div><!--//content-->
                    </div><!--//section-inner-->                 
                </section><!--//section-->
    
             
                    <div class="modal fade" id="myModal" style="margin-top:200px" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Here!! Write your note </h4>
<h5>Note Title</h5>
<form action="#" id="form">
<input type="text"  id="note_title" class="form-control" required>
<h5>Note*</h5>
        <textarea class="form-control" rows="5" id="comment"  required></textarea>
        <input type="submit" style="margin-top:10px; float:right" class="btn btn-default"  id="note_submit" value="submit" >
        <input type="hidden" id="customer_id" value="<%=customerdetails.getCustomer_id() %>">
        </form>
        
        </div>
        
         
        </div>
        
      </div>
      
    </div>        
              <script>
              $(document).ready(function(){
            	  $("form").submit(function(){
            		  
            		  var customer_id=$('#customer_id').val();
            		  var note_title=$('#note_title').val();
            		  var note_comment=$('#comment').val();
            		  console.log(customer_id);
            		  console.log(note_title);
            		  console.log(note_comment);
            		  
            		  $.ajax({
            			
            			  type:'post',
            			  data:{
            				  
            				  customer_id:customer_id,
            				  note_title:note_title,
            				  note_comment:note_comment
            			  },
            			  url:'NotesController'
            		  });
            		  
            		  
            		  
            		  
            	  });
            	  
            	  
            	  
            	  
            	  
            	  
            	  
              });
              
            
              </script>  
  
    <!-- Javascript -->          
    <script type="text/javascript" src="assets/plugins/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="assets/plugins/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>    
    <script type="text/javascript" src="assets/plugins/jquery-rss/dist/jquery.rss.min.js"></script> 
    <!-- github activity plugin -->
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/mustache.js/0.7.2/mustache.min.js"></script>
    <script type="text/javascript" src="http://caseyscarborough.github.io/github-activity/github-activity-0.1.0.min.js"></script>
    <!-- custom js -->
    <script type="text/javascript" src="assets/js/main.js"></script>            
</body>
</html> 

