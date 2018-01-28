<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Material Login Form</title>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  
<!-- Mixins-->
<!-- Pen Title-->
<div class="pen-title">
  <h1>Material Login Form</h1><span>Pen <i class='fa fa-code'></i> by <a href='http://andytran.me'>Andy Tran</a></span>
</div>
<div class="rerun"><a href="">Rerun Pen</a></div>
<div class="container">
  <div class="card"></div>
  <div class="card">
    <h1 class="title">Login</h1>
    <form   action="login" method="post">
      <div class="input-container">
        <input type="text" name="userName" id="" required="required"/>
        <label for="">Username</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="password" id="" required="required"/>
        <label for="">Password</label>
        <div class="bar"></div>
      </div>
      <div class="button-container">
        <button><span>Go</span></button>
      </div>
      <div class="footer"><a href="#">Forgot your password?</a></div>
    </form >
  </div>
  <div class="card alt">
    <div class="toggle"></div>
    <h1 class="title">Register
      <div class="close"></div>
    </h1>
    <form action="sign" method="post">
      <div class="input-container">
        <input type="" id=""  name="firstName" required="required"/>
        <label for="">Firstname</label>
        <div class="bar"></div>
      </div>
      
      <div class="input-container">
        <input type="" id=""  name="lastName" required="required"/>
        <label for="">Lastname</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="Email" id=""  name="userName" required="required"/>
        <label for="" name="userName">Username</label>
        <div class="bar"></div>
      </div>
      
      <div class="input-container">
        <input type="text" name="password"id="" required="required"/>
        <label for="">Password</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="password1" id="" required="required"/>
        <label for="">Repeat Password</label>
        <div class="bar"></div>
      </div>
      <div class="button-container">
        <button><span>Next</span></button>
      </div>
    </form>
  </div>
</div>
<!-- Portfolio--><a id="portfolio" href="http://andytran.me/" title="View my portfolio!"><i class="fa fa-link"></i></a>
<!-- CodePen--><a id="codepen" href="https://codepen.io/andytran/" title="Follow me!"><i class="fa fa-codepen"></i></a>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>

</body>
</html>