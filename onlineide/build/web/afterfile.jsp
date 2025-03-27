<%-- 
    Document   : afterfile
    Created on : 2 Feb, 2016, 2:22:36 PM
    Author     : gurjot
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>After File</title>
    </head>
    <body>
        <%
            String l=request.getParameter("file");
            String m=request.getParameter("file1");
            String g=(String)session.getAttribute("PATH");
            File fg=new File(g+"/"+l+"/"+m+".java");
            if(!fg.exists())
            {
                fg.createNewFile();
                session.setAttribute("PROJECTNAME", l);
                session.setAttribute("FILENAME", m+".java");
                response.sendRedirect("ser.jsp");
            }
            else
            {
                 response.sendRedirect("ser.jsp?f=invalidfile");
            }
        %>
    </body>
</html>
