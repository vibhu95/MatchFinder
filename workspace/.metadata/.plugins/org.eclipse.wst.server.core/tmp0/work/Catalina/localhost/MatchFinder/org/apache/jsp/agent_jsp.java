/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2018-01-31 08:49:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.classes.*;

public final class agent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1517328612647L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1517387823132L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
 HttpSession session = request.getSession(false); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Match@Finder</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#about{\r\n");
      out.write("\tcolor: rgb(0,0,0);\r\n");
      out.write("\tfont-size:22;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("#copy{\r\n");
      out.write("\tcolor:rgb(234,39,0);\r\n");
      out.write("\tfont-size: 32;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tletter-spacing: 2px;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write(" background: url('pic/11__11.jpg') no-repeat fixed;\r\n");
      out.write("  background-size: 100% 100%;\r\n");
      out.write("}\r\n");
      out.write("footer, #about{\r\n");
      out.write("background-color: rgba(255,255,255,0.2);\r\n");
      out.write("}\r\n");
      out.write("  .container {\r\n");
      out.write("      padding: 10px 30px;\r\n");
      out.write("  }\r\n");
      out.write("  .carousel-inner img {\r\n");
      out.write("    //  -webkit-filter: grayscale(90%);\r\n");
      out.write("   //  filter: grayscale(90%); /* make all photos black and white */ \r\n");
      out.write("      width: 100%; /* Set width to 100% */\r\n");
      out.write("     margin:auto;\r\n");
      out.write("  }\r\n");
      out.write("  .carousel-caption h3 {\r\n");
      out.write("      color: #fff !important;\r\n");
      out.write("  }\r\n");
      out.write("    @media (max-width: 600px) {\r\n");
      out.write("    .carousel-caption {\r\n");
      out.write("      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */\r\n");
      out.write("    }\r\n");
      out.write("  }  \r\n");
      out.write("  #signal{\r\n");
      out.write("  \tfloat: right;\r\n");
      out.write("  \tmargin-top: 100px;\r\n");
      out.write("  }\r\n");
      out.write("  #upload_dp {\r\n");
      out.write("    display: none;\r\n");
      out.write("    width: 0;\r\n");
      out.write("    height: 0;\r\n");
      out.write("}\r\n");
      out.write("   #dp1:hover {\r\n");
      out.write("    opacity: 0.5;\r\n");
      out.write("    filter: alpha(opacity=50); /* For IE8 and earlier */\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("  </style>\r\n");
      out.write("  <script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $(\"#dp1\").click(function(){\r\n");
      out.write("        $('#upload_dp').click();\r\n");
      out.write("    })\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\r\n");
      out.write("<nav class=\"navbar navbar-inner navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("    <a href=\"index.jsp\"><img src=\"pic/logos.png\" alt=\"logo\" style=\"float: left; margin-right: 20px \" height=\"50px\" width=\"50px\"></a>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">MatchFinder</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("       <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("  <!--    <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Page 1 <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Page 1-1</a></li>\r\n");
      out.write("          <li><a href=\"#\">Page 1-2</a></li>\r\n");
      out.write("          <li><a href=\"#\">Page 1-3</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>   -->\r\n");
      out.write("     ");

      if(session!=null)
      { 
      out.write("\r\n");
      out.write("      <li><a href=\"agent.jsp\">Agents</a></li>\r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("      <li><a href=\"contact.jsp\">Contact Us</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("<script>\r\n");
      out.write("function upload(){\r\n");
      out.write("\t document.getElementById('upload').submit();\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("      ");

      if(session!=null)
      {
    	  if(session.getAttribute("user")!=null)
    	  {
    	    UserBean user = (UserBean)session.getAttribute("user");
    	    if(user!=null)
    	    {   
      out.write("\r\n");
      out.write("        <form action=\"UploadImage\" method=\"post\" id=\"upload\" enctype=\"multipart/form-data\">\r\n");
      out.write("        <input id=\"upload_dp\" type=\"file\" name=\"dp\" size=\"chars\" onchange=\"document.getElementById('upload').submit();\">\r\n");
      out.write("           </form>\r\n");
      out.write("      <li style=\"font-size:20px; margin-top:10px;\">\r\n");
      out.write("      ");
      if(user.getDp()!=null)
               { int id = user.getId(); 
      out.write("\r\n");
      out.write("      <img id=\"dp1\" src=\"getImage.jsp?id=");
      out.print(id );
      out.write("\" class=\"img-circle\" alt=\"getDp\" style=\"margin-top:5px; margin-right:10px;\" width=\"40px\" hieght=\"40px\"></img>");
      out.print(user.getName() );
      out.write("</li>\r\n");
      out.write("      ");
         }
              else{ 
      out.write("\r\n");
      out.write("    \t<img id=\"dp1\" src=\"pic/businessman_17.png\" class=\"img-circle\" alt=\"DefaultDp\" style=\"margin-top:5px; margin-right:10px;\" width=\"40px\" hieght=\"40px\"></img>");
      out.print(user.getName() );
      out.write("</li>\r\n");
      out.write("      ");
         } 
             }
      
      out.write("\r\n");
      out.write("      <li><a href=\"SignOut\"><span class=\"glyphicon glyphicon-log-in\"></span> SignOut</a></li>\r\n");
      out.write("      ");
  } 
      else {
      out.write("\r\n");
      out.write("    \t\t<li><a href=\"login/login.jsp\"><span class=\"glyphicon glyphicon-user\"></span> SignUp</a></li>\r\n");
      out.write("    \t      <li><a href=\"login/login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> SignIn</a></li> \r\n");
      out.write("  ");
  } }
    else { 
      out.write("\r\n");
      out.write("    \t<li><a href=\"login/login.jsp\"><span class=\"glyphicon glyphicon-user\"></span> SignUp</a></li>\r\n");
      out.write("      <li><a href=\"login/login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> SignIn</a></li> \r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("       </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- Header Closed -->>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!-- Footer Start -->\r\n");
      out.write("\r\n");
      out.write("<footer class=\"container-fluid text-center\">\r\n");
      out.write("  <a href=\"#myPage\" title=\"To Top\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <p id=\"copy\">&copyCopyright  <a href=\"https://www.matchfinder.online\" title=\"Visit MatchFinder\">www.matchfinder.online</a></p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  // Add smooth scrolling to all links in navbar + footer link\r\n");
      out.write("  $(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\r\n");
      out.write("    // Make sure this.hash has a value before overriding default behavior\r\n");
      out.write("    if (this.hash !== \"\") {\r\n");
      out.write("      // Prevent default anchor click behavior\r\n");
      out.write("      event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("      // Store hash\r\n");
      out.write("      var hash = this.hash;\r\n");
      out.write("\r\n");
      out.write("      // Using jQuery's animate() method to add smooth page scroll\r\n");
      out.write("      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\r\n");
      out.write("      $('html, body').animate({\r\n");
      out.write("        scrollTop: $(hash).offset().top\r\n");
      out.write("      }, 900, function(){\r\n");
      out.write("   \r\n");
      out.write("        // Add hash (#) to URL when done scrolling (default click behavior)\r\n");
      out.write("        window.location.hash = hash;\r\n");
      out.write("      });\r\n");
      out.write("    } // End if\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  $(window).scroll(function() {\r\n");
      out.write("    $(\".slideanim\").each(function(){\r\n");
      out.write("      var pos = $(this).offset().top;\r\n");
      out.write("\r\n");
      out.write("      var winTop = $(window).scrollTop();\r\n");
      out.write("        if (pos < winTop + 600) {\r\n");
      out.write("          $(this).addClass(\"slide\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<!-- Footer End -->\r\n");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
