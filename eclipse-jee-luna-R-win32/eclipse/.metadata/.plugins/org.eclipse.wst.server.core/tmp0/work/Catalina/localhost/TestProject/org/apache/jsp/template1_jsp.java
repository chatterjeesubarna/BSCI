/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-09-13 16:36:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");

    String usershow = null;
    String userpg = null;
    String logshow = null;
    String logpg = null;
    
    if(session.getAttribute("userId") != null)
    {
        usershow = "Welcome " + session.getAttribute("userId").toString();
        userpg = "#";
        logshow = "Logoff";
        logpg = "logoff";
        //response.sendRedirect("login_aboutus.jsp");
    }
    else
    {
        usershow = "Register";
        userpg = "register";        
        logshow = "Login";
        logpg = "login";        
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Sensor Templates</title>\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<h1><a href=\"#\">Big-Sensor-Cloud Infrastructure</a></h1>\r\n");
      out.write("\t\t<h2>By <a href=\"http://www.nodethirtythree.com/\">SIT, IIT, Kharagpur</a> <a href=\"http://www.freecsstemplates.org/\"></a></h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<marquee><b><font size = \"4\" color = \"red\" face=\"Lucida\"><i>Big-Sensor-Cloud: A paradigm shift from traditional WSNs</i></font></b></marquee>\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#\" accesskey=\"1\" title=\"\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" accesskey=\"2\" title=\"\">Archives</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" accesskey=\"3\" title=\"\">About</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"contact.jsp\" accesskey=\"4\" title=\"\">Contact</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"logout.jsp\" accesskey=\"4\" title=\"\">Logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"page\">\r\n");
      out.write("\t<div id=\"bg\">\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"post\" style=\"padding-top: 57px;\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\">Welcome to Big-Sensor-Cloud Infrastructure Version 1.0!</h2>\r\n");
      out.write("\t\t\t\t<h3 class=\"date\">Thursday, May 25, 2014</h3>\r\n");
      out.write("\t\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"box-sizing: border-box; display: inline-block; width: auto; max-width: 2480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;\"><span style=\"font-family: verdana,arial; color: #D4D4D4; font-size: 1.00em; font-weight:bold;\">Sensor Templates</span></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"background: ; padding: 15px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<style type=\"text/css\" scoped>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttd { text-align:left; font-family: verdana,arial; color: #064073; font-size:1.00em; }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tinput { border: 1px solid #CCCCCC; border-radius: 5px; color: #666666; display: inline-block; font-size: 1.00em;  padding: 5px; width: 100%; }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tinput[type=\"button\"], input[type=\"reset\"], input[type=\"submit\"] { height: auto; width: auto; cursor: pointer; box-shadow: 0px 0px 5px #0361A8; float: right; margin-top: 10px; }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttable.center { margin-left:auto; margin-right:auto; }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.error { font-family: verdana,arial; color: #D41313; font-size: 1.00em; }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</style>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.tg  {border-collapse:collapse;border-spacing:0;}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.tg td{font-family:Arial, sans-serif;font-size:14px;padding:7px 5px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t#extra_width {padding-top: 5px; padding-left: 0px; padding-right: 70px;}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</style>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"sensorallocation.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table class=\"tg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<p1><font face='verdana, arial, helvetica' size='3' align='center'></p1>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td colspan=\"2\" bgcolor='#ffffff' ><font face='verdana, arial, helvetica' size='3' align='center' name='sensor'><b><i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPlease select the type(s) of applications:</b></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Environment monitoring</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"sensor1\" value=\"2\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Surveillance applications</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"sensor2\" value=\"3\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Healthcare applications</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"sensor3\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Application 4</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"sensor4\" value=\"4\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td colspan=\"2\" bgcolor='#ffffff' ><font face='verdana, arial, helvetica' size='3' align='center' name='region'><b><i><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPlease select the region(s):</b></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>SWAN lab</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"region1\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Project Lab</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"region2\" value=\"2\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Research Lab</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"region3\" value=\"3\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>VLSI Lab</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"region4\" value=\"4\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Office</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"region[]\" value=\"ST\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td colspan=\"2\" bgcolor='#ffffff' ><font face='verdana, arial, helvetica' size='3' align='center'><b><i><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tSelect your Service Level Agreement (SLA)</b></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Accuracy</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"Agg[]\" value=\"ST\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Timeliness</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"Agg[]\" value=\"ST\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td>Pricing Policy</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"extra_width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"Agg[]\" value=\"ST\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type='submit' value='Submit'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type='reset' value=\"Clear Form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"location.href='credentials.php'\" value=\"Back\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> <!-- end post -->\r\n");
      out.write("\t</div> <!-- end content -->\r\n");
      out.write("</div> <!-- end bg -->\r\n");
      out.write("</div> <!-- end page -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
