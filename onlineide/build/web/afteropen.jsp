<%-- 
    Document   : afteropen
    Created on : 1 Feb, 2016, 4:00:12 PM
    Author     : gurjot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>After Open</title>
    </head>
    <body>
        <%
            String projectname=request.getParameter("pro_name");
            session.setAttribute("PROJECTNAME", projectname);
            response.sendRedirect("ser.jsp");
        %>
        
    </body>
</html>
