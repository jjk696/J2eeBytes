<%-- 
    Document   : Beforeide
    Created on : 19 Jan, 2016, 3:46:26 PM
    Author     : gurjot
--%>

<%@page import="java.io.File"%>
<%@page import="beans.Login"%>
<%@page import="op.DBOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Before ide</title>
    </head>
    <body>
          <%
                String username=(String)session.getAttribute("USERNAME");
                String dir=System.getProperty("user.home");
                String path1=dir+"/"+username;
                File f=new File(path1);
                if(!f.exists()){
                    f.mkdir();
                }
                System.out.println("Path="+f.getAbsolutePath());
                session.setAttribute("PATH", path1);
                response.sendRedirect("ser.jsp");
                %>
    </body>
</html>
