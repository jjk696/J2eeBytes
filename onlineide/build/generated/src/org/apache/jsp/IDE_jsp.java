package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IDE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mobile.css\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"> <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"true\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online IDE</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style1.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/modernizr.custom.86080.js\"></script>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("        <script src=\"js/menu.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/script.js\"></script>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo_1.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style_common.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style8.css\" />\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <div id=\"main\" style=\"min-height: 800px;height: auto;width: 1250px;border:0px solid blue\">\n");
      out.write("                <ul class=\"cb-slideshow\">\n");
      out.write("                    <li><span>Image 01</span></li>\n");
      out.write("                    <li><span>Image 02</span></li>\n");
      out.write("                    <li><span>Image 03</span></li>\n");
      out.write("                    <li><span>Image 04</span></li>\n");
      out.write("                    <li><span>Image 05</span></li>\n");
      out.write("                    <li><span>Image 06</span></li>\n");
      out.write("                </ul>\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("                <div id=\"homemain\" style=\"border: 0px solid green\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"container\" style=\"border: 0px solid darkblue\">\n");
      out.write("                        <div class=\"main\" style=\"border:0px solid yellow\">\n");
      out.write("                            <div class=\"view view-eighth\">\n");
      out.write("                                <img src=\"image/3.jpg\" />\n");
      out.write("                                <div class=\"mask\">\n");
      out.write("                                    <h2>C</h2>\n");
      out.write("                                    <p>In 1972 Dennis \n");
      out.write("                                        Ritchie at Bell Labs writes C and in 1978 the publication of \n");
      out.write("                                        The C Programming Language \n");
      out.write("                                        by Kernighan & Ritchie caused a revolution in the computing world.\n");
      out.write("                                    </p>\n");
      out.write("                                    <a href=\"#\" class=\"info\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"view view-eighth\">\n");
      out.write("                                <img src=\"image/2.jpg\" />\n");
      out.write("                                <div class=\"mask\">\n");
      out.write("                                    <h2>JAVA</h2>\n");
      out.write("                                    <p>James Gosling, Mike Sheridan, and Patrick Naughton \n");
      out.write("                                        initiated the Java language project in June 1991.\n");
      out.write("                                        The language was initially called Oak. Later the project was finally renamed Java\n");
      out.write("                                    </p>\n");
      out.write("                                    <a href=\"#\" class=\"info\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"view view-eighth\">\n");
      out.write("                                <img src=\"image/1.jpg\" />\n");
      out.write("                                <div class=\"mask\">\n");
      out.write("                                    <h2>HTMl</h2>\n");
      out.write("                                    <p>The founder of HTML was Tim Berners-Lee and \n");
      out.write("                                    his product was made attractive to the general public by \n");
      out.write("                                     Mosaic browser which was evolved at NCSA. It has become extremely popular.\n");
      out.write("                                    </p>\n");
      out.write("                                    <a href=\"#\" class=\"info\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"view view-eighth\">\n");
      out.write("                                <img src=\"image/6.jpg\" />\n");
      out.write("                                <div class=\"mask\">\n");
      out.write("                                    <h2>JQUERY</h2>\n");
      out.write("                                    <p>jQuery is a cross-platform JavaScript library designed \n");
      out.write("                                    to simplify the client-side scripting of HTML. JQuery is developed by\n");
      out.write("                                    John Resig in August 26, 2006\n");
      out.write("                                    </p>\n");
      out.write("                                    <a href=\"#\" class=\"info\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"view view-eighth\">\n");
      out.write("                                <img src=\"image/4.jpg\" />\n");
      out.write("                                <div class=\"mask\">\n");
      out.write("                                    <h2>PHP</h2>\n");
      out.write("                                    <p>PHP is a server-side scripting language designed for web development.Originally created by Rasmus Lerdorf in 1994</p>\n");
      out.write("                                    <a href=\"#\" class=\"info\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"view view-eighth\">\n");
      out.write("                                <img src=\"image/5.png\" />\n");
      out.write("                                <div class=\"mask\">\n");
      out.write("                                    <h2>Java Script</h2>\n");
      out.write("                                    <p>JavaScript is a high-level, dynamic, untyped, and interpreted programming language.\n");
      out.write("                                        JavaScript is developed by Brendan Eich\n");
      out.write("                                    </p>\n");
      out.write("                                    <a href=\"#\" class=\"info\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js\"></script>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div id=\"clrr\"></div>\n");
      out.write("                <div id=\"footer\" style=\"border: 0px solid darkorange\">\n");
      out.write("                    <div id=\"foomenu\" style=\"border: 0px solid darkmagenta\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href='IDE.jsp'><span>Home |</span></a></li>\n");
      out.write("                            <li><a href='#'><span>Feedback |</span></a></li>\n");
      out.write("                            <li><a href='#'><span>Sitemap |</span></a></li>\n");
      out.write("                            <li><a href='con.jsp'><span>Contact </span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"copy\">\n");
      out.write("                        <p>Copyright © 2015 -2016 All Rights Reserved by Gurjot Singh New updating website 2015-2016.- Powered By Gurjot Singh. For any further information, please <a href=\"#\">Contact us</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"clrr\"></div>\n");
      out.write("                <div id=\"markq\" style=\"border: 0px solid red\" class=\"col-3 col-m-3\">\n");
      out.write("                    <h1 id=\"h\">Updates</h1>\n");
      out.write("                    <div id=\"p\">\n");
      out.write("                        <marquee direction=\"down\" height=384px>\n");
      out.write("                            <p>\n");
      out.write("                            </p>\n");
      out.write("                        </marquee>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
