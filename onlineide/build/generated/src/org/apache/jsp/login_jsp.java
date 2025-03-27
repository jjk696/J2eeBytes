package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"> <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"true\">\n");
      out.write("        <title>Online IDE</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("        <script src=\"js/menu.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/onlineide.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/script.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>\n");
      out.write("        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style1.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/modernizr.custom.86080.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateform(){\n");
      out.write("                var user=document.forms[\"register\"][\"username\"].value;\n");
      out.write("                var pass=document.forms[\"register\"][\"password\"].value;\n");
      out.write("                var fname=document.forms[\"register\"][\"fname\"].value;\n");
      out.write("                var lname=document.forms[\"register\"][\"lname\"].value;\n");
      out.write("                var email=document.forms[\"register\"][\"email\"].value;\n");
      out.write("                var phone=document.forms[\"register\"][\"phone\"].value;\n");
      out.write("              \n");
      out.write("                if((user==\"\"||user==null || pass==\"\"|| pass==null || fname==\"\" || fname==null || lname==\"\" ||lname==null || email==\"\" || email==null || phone==\"\" || phone==null)){\n");
      out.write("                    document.getElementById(\"regmessage\").innerHTML=\"<font color=red size=3>All feilds are required</font>\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("             function matchpassword(){\n");
      out.write("                var pwd=document.getElementById(\"np\").value;\n");
      out.write("                var pwd1=document.getElementById(\"cp\").value;\n");
      out.write("               \n");
      out.write("                if(pwd!=pwd1){\n");
      out.write("                  document.getElementById(\"message1\").innerHTML=\"<font size=3 color=red>Password should be same</font>\";\n");
      out.write("                  document.getElementById(\"np\").value=\"\";\n");
      out.write("                  document.getElementById(\"cp\").value=\"\";\n");
      out.write("                  document.getElementById(\"np\").focus();\n");
      out.write("                  return false;\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function onlyNumeric(e)\n");
      out.write("            {\n");
      out.write("                var c=e.keyCode?e.keyCode:e.charCode;\n");
      out.write("               if(c<48 || c>57)\n");
      out.write("               {\n");
      out.write("                   return false;\n");
      out.write("               }\n");
      out.write("            }\n");
      out.write("            function forgetPass(){\n");
      out.write("                var username1=document.getElementById(\"username22\").value;\n");
      out.write("                //alert(username1);\n");
      out.write("                if(username1==null || username1==\"\"){\n");
      out.write("                     alert(\"first enter the username\");\n");
      out.write("                     return false;\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                  \n");
      out.write("                    location.href=\"fp.jsp?username=\"+username1;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"cb-slideshow\">\n");
      out.write("            <li><span>Image 01</span></li>\n");
      out.write("            <li><span>Image 02</span></li>\n");
      out.write("            <li><span>Image 03</span></li>\n");
      out.write("            <li><span>Image 04</span></li>\n");
      out.write("            <li><span>Image 05</span></li>\n");
      out.write("            <li><span>Image 06</span></li>\n");
      out.write("        </ul>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("        <!-- Form Mixin-->\n");
      out.write("        <!-- Input Mixin-->\n");
      out.write("        <!-- Button Mixin-->        \n");
      out.write("        <!-- Pen Title-->\n");
      out.write("        <!-- Form Module-->\n");
      out.write("        <div class=\"module form-module\">\n");
      out.write("            <div class=\"toggle\"><i class=\"fa fa-times fa-pencil\"></i>\n");
      out.write("                <div class=\"tooltip\">Click Here For Registration</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <h2>Login to your account</h2>\n");
      out.write("                    <form action=\"/onlineide/LoginServlet\" method=\"post\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Username\" name=\"username\" id=\"username22\"/>\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" name=\"pwd\" />\n");
      out.write("                        <button>Login</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            <div id=\"regmessage\"></div>\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <h2>Create an account</h2>\n");
      out.write("                    <form action=\"/onlineide/RegistrationServlet\" method=\"post\" name=\"register\" onsubmit=\"return validateform()\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Username\" name=\"username\"/>\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" name=\"password\" id=\"np\"/>\n");
      out.write("                        <input type=\"password\" placeholder=\"Confirm Password\" name=\"cp\" id=\"cp\" onblur=\"return matchpassword()\"/>\n");
      out.write("                        <div id=\"message1\"></div>\n");
      out.write("                        <input type=\"text\" placeholder=\"Firstname\" name=\"fname\"/>\n");
      out.write("                         <input type=\"text\" placeholder=\"Lastname\" name=\"lname\"/>\n");
      out.write("                        <div id=\"sel\">\n");
      out.write("                        <select style=\"width: 70px\" name=\"day\">\n");
      out.write("                            <option value=\"\">Date</option>\n");
      out.write("                            ");
for(int i=1;i<32;i++){
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <select style=\"width: 75px\" name=\"month\">\n");
      out.write("                            <option value=\"\">Month</option>\n");
      out.write("                            ");
for(int i=1;i<13;i++){
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <select style=\"width: 87px\" name=\"year\">\n");
      out.write("                            <option value=\"\">Year</option>\n");
      out.write("                            ");
for(int i=2020;i>0;i--){
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"email\" placeholder=\"Email Address\" name=\"email\"/>\n");
      out.write("                        <input type=\"tel\" placeholder=\"Phone Number\" name=\"phone\" onkeypress=\"return onlyNumeric(event)\" maxlength=\"10\"/>\n");
      out.write("                        <select name=\"nation\" style=\"width: 242px\">\n");
      out.write("                            <option value=\"\">Nationality</option>\n");
      out.write("                             <option value=\"Indian\">Indian</option>\n");
      out.write("                              <option value=\"Foreigner\">Foreigner</option>\n");
      out.write("                        </select><br/>\n");
      out.write("                        <button>Register</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                        <div class=\"cta\" onclick=\"forgetPass()\"><a href=\"#\">Forgot your password?</a></div>\n");
      out.write("        </div>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script src='js/da0415260bc83974687e3f9ae.js'></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
