package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import op.DBOperation;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"> <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"true\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id='cssmenu' style=\"border: 0px solid red\">\n");
      out.write("            <ul>\n");
      out.write("                <li class='active'><a href='IDE.jsp'><span>Home</span></a></li>\n");
      out.write("                <li><a href='about.jsp'><span>About Us</span></a></li>\n");
      out.write("                 ");
if(session.getAttribute("USERNAME")!=null){
      out.write("\n");
      out.write("                <li><a href='Beforeide.jsp'><span>Services</span></a></li>\n");
      out.write("                 ");
}else{
      out.write("\n");
      out.write("                 <li><a href=\"javascript:alert('plz Login First');location.href='login.jsp'\"><span>Services</span></a></li>\n");
      out.write("                 ");
}
      out.write("\n");
      out.write("                <li class='last'><a href='con.jsp'><span>Contact</span></a></li>\n");
      out.write("                ");
if(session.getAttribute("USERNAME")==null){
      out.write("\n");
      out.write("                <div id=\"up1\">\n");
      out.write("                    <li><a href='login.jsp'><span>Login</span></a></li>\n");
      out.write("                </div>\n");
      out.write("                ");
}else{
      out.write("\n");
      out.write("                 <div id=\"up\">\n");
      out.write("                     ");

                        String user=(String)session.getAttribute("USERNAME");
                        DBOperation op=new DBOperation();
                        String pic_path=op.updateProfilePics(user);
                        if(pic_path!=null){
                     
      out.write("\n");
      out.write("                     <li><a href=\"myprofile.jsp\"><img src=\"");
      out.print(pic_path);
      out.write("\"/></a></li>\n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                    <li><a href='myprofile.jsp'><span>My Profile</span></a></li>\n");
      out.write("                    <li><a href=\"logout.jsp\"><span>Logout</span></a></li>\n");
      out.write("                                    </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
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
