/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2018-01-31 15:45:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.agents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<head>\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script src=\"js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Raleway:400,100,500,700,200,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--start-body-->\r\n");
      out.write("\t\t\t<!--star-wrapper-demo-->\r\n");
      out.write("\t\t\t<div class=\"wrapper-demo\">\r\n");
      out.write("\t\t\t\t<h1>Friend List</h1>\r\n");
      out.write("\t\t\t\t<!--start-wrapper-dropdown-2-->\r\n");
      out.write("\t\t\t\t\t<div id=\"dd\" class=\"wrapper-dropdown-2\" tabindex=\"1\">Friends<i><img src=\"images/menu.png\"/></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <!-- start search-->\r\n");
      out.write("\t\t\t\t    <div class=\"search-box\">\r\n");
      out.write("\t\t\t\t\t    <div id=\"sb-search\" class=\"sb-search\">\r\n");
      out.write("\t\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    <!-- search-scripts -->\r\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\r\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t<!-- /search-scripts -->\r\n");
      out.write(" \t\t\t\t<!-- end search-->\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"friends-grids\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grids-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/a1.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"friend-grid\"><p class=\"flowers\">14k</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grids-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Jessica Butler</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<img src=\"images/heart.png\" />-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"grids-right-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"user\">107</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"camera\">23</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"chat\">6</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"friends-grids\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grids-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/a2.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"friend-grid\"><p class=\"flowers\">21k</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grids-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Cristina Williams</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<img src=\"images/heart.png\" />-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"grids-right-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"user\">93</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"camera\">57</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"chat\">7</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--end-wrapper-dropdown-2-->\r\n");
      out.write("\t\t\t<!--start-script-->\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\tfunction DropDown(el) {\r\n");
      out.write("\t\t\t\t\t\t\t\tthis.dd = el;\r\n");
      out.write("\t\t\t\t\t\t\t\tthis.initEvents();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tDropDown.prototype = {\r\n");
      out.write("\t\t\t\t\t\t\t\tinitEvents : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar obj = this;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tobj.dd.on('click', function(event){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(this).toggleClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tevent.stopPropagation();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar dd = new DropDown( $('#dd') );\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t$(document).click(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// all dropdowns\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.wrapper-dropdown-2').removeClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<!--end-script-->\r\n");
      out.write("\t\t\t<!--end-wrapper-demo-->\r\n");
      out.write("\t\t\t<!--start-copyright-->\r\n");
      out.write("\t\t\t<div class=\"copy-right\">\r\n");
      out.write("\t\t\t\t\t<p>Template by <a href=\"http://w3layouts.com\" target=\"_blank\">w3layouts</a> </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--end-copyright-->\r\n");
      out.write("\t\t\t<!--end-body-->\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
