/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-07-24 10:45:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Sensor-cloud infrastructure home_page</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"Sensor-cloud Infrastructure\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<h1><a href=\"#\">Sensor-cloud Infrastructure</a></h1>\r\n");
      out.write("\t\t<h2> <font size = \"4\" face = Lucida><i>Sense the world right away!</i></a> <a href=\"http://www.freecsstemplates.org/\"></a></h2></font>\r\n");
      out.write("\t</div>\r\n");
      out.write("<marquee scrollamount=\"3\"><b><font size = \"4\" color = \"red\" face=\"Lucida\"><i>Sensor-cloud: A paradigm shift from traditional Wireless Sensor Networks</i></font></b></marquee>ï»¿\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"NewFile.jsp\" accesskey=\"1\" title=\"\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" accesskey=\"2\" title=\"\">Archives</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" accesskey=\"3\" title=\"\">About</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"Contact.html\" accesskey=\"4\" title=\"\">Contact</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr />\r\n");
      out.write("\r\n");
      out.write("<div id=\"page\">\r\n");
      out.write("\t<div id=\"bg\">\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"post\" style=\"padding-top: 57px;\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\">Welcome to Sensor-cloud Infrastructure Version 1.0!</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<font color = \"black\" face = Lucida>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h3 class=\"date\"> \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\ttday  =new Array(\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\");\r\n");
      out.write("\t\t\t\t\t\t\ttmonth=new Array(\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tfunction GetClock(){\r\n");
      out.write("\t\t\t\t\t\t\td = new Date();\r\n");
      out.write("\t\t\t\t\t\t\tnday   = d.getDay();\r\n");
      out.write("\t\t\t\t\t\t\tnmonth = d.getMonth();\r\n");
      out.write("\t\t\t\t\t\t\tndate  = d.getDate();\r\n");
      out.write("\t\t\t\t\t\t\tnyear = d.getYear();\r\n");
      out.write("\t\t\t\t\t\t\tnhour  = d.getHours();\r\n");
      out.write("\t\t\t\t\t\t\tnmin   = d.getMinutes();\r\n");
      out.write("\t\t\t\t\t\t\tnsec   = d.getSeconds();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif(nyear<1000) nyear=nyear+1900;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t     if(nhour ==  0) {ap = \" AM\";nhour = 12;} \r\n");
      out.write("\t\t\t\t\t\t\telse if(nhour <= 11) {ap = \" AM\";} \r\n");
      out.write("\t\t\t\t\t\t\telse if(nhour == 12) {ap = \" PM\";} \r\n");
      out.write("\t\t\t\t\t\t\telse if(nhour >= 13) {ap = \" PM\";nhour -= 12;}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif(nmin <= 9) {nmin = \"0\" +nmin;}\r\n");
      out.write("\t\t\t\t\t\t\tif(nsec <= 9) {nsec = \"0\" +nsec;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById('clockbox').innerHTML=\"\"+tday[nday]+\", \"+tmonth[nmonth]+\" \"+ndate+\", \"+nyear+\" \"+nhour+\":\"+nmin+\":\"+nsec+ap+\"\";\r\n");
      out.write("\t\t\t\t\t\t\tsetTimeout(\"GetClock()\", 1000);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\twindow.onload=GetClock;\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"clockbox\"></div>\r\n");
      out.write("\t\t\t\t\t\t<br></br><br></br><br></br><br></br>\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\">Supervised by Dr. Sudip Misra</h2>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"entry\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write(" \t\t\t\t\t\t\t<li> Manmeet Singh Bhogal</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> Sanku Kumar Roy</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> Arijit roy </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> Subarna Chatterjee </li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end content n -->\r\n");
      out.write("\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t<div id=\"about-box\"><font face = Lucida>\r\n");
      out.write("\t\t\t\t<h2 style=\"text-align:center\"><font color = blue><i>developed by</font></h2></i>\r\n");
      out.write("\t\t\t\t<img src=\"images/logo1.png\" width=\"105\" height=\"100\" style=\"margin-left:70px; margin-top:-20px; \" />\r\n");
      out.write("\t\t\t\t<a href = \"http://sit.iitkgp.ernet.in/~smisra/swan/index.html\" style=\"text-decoration: none\"><h4 style=\"text-align:center\" ><font size = \"4.5\" color = red>Smart Wireless Applications & Networking Laboratory</font></h4></a>\r\n");
      out.write("\t\t\t\t<a href = \"http://sit.iitkgp.ernet.in/\" style=\"text-decoration: none\"><h4 style=\"text-align:center\"><font size = \"3\" color = #B40404>School of Information Technology</a></font></h4>\r\n");
      out.write("\t\t\t\t<a href = \"http://www.iitkgp.ac.in/\" style=\"text-decoration: none\"><h4 style=\"text-align:center\"><font size = \"3\" color = #B40404>Indian Institute of Technology Kharagpur</font></h4></a>\r\n");
      out.write("\t\t\t\t<i><font size = \"3\" color = #0B0B61>Project Investigator:</font></i>  <a href = \"http://www.sit.iitkgp.ernet.in/~smisra/\" style=\"text-decoration: none\"><font color = #610B21>Dr. Sudip Misra </font></a>\r\n");
      out.write("\t\t\t\t<i><font size = \"3\" color = #0B0B61>Developers:</font></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<li> <font color = #610B21> Subarna Chatterjee (Ph.D Scholar)</font></li>\r\n");
      out.write("\t\t\t\t<li> <font color = #610B21> Arijit Roy (M.S. Scholar) </font></li>\r\n");
      out.write("\t\t\t\t<li> <font color = #610B21> Manmeet Singh Bhogal (Summer Intern) </font></li>\r\n");
      out.write("\t\t\t\t<li> <font color = #610B21> Sanku Kumar Roy (Project Staff) </font></li>\r\n");
      out.write("\t\t\t\t<!-- </font>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\t\t\t<br></br><br></br><br></br><br></br><br></br>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<h2>Categories</h2>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About us</a></li>\r\n");
      out.write("\t\t\t\t\t\t<!--<li><a href=\"#\">Donec felis duis</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Eget tempus lorem</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Veroeros consequat</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Nullam blandit</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Tempus aliquam </a></li> -->\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<h2>Links</h2>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"><a href=\"http://sit.iitkgp.ernet.in/~smisra/swan/index.html\">SWAN</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://sit.iitkgp.ernet.in/\">SIT</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.iitkgp.ac.in/\">IIT Kharagpur</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end sidebar -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\r\n");
      out.write("\t</div> <!-- end bg -->\r\n");
      out.write("</div> <!-- end page -->\r\n");
      out.write("\r\n");
      out.write("<hr />\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>(c) All rights reserved. Design by <a href=\"http://sit.iitkgp.ernet.in/\">SIT</a>, <a href=\"http://www.iitkgp.ac.in/\"> IIT Kharagpur</a></p>\r\n");
      out.write("</div>\r\n");
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
