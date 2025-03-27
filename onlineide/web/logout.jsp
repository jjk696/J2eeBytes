<%-- 
    Document   : logout
    Created on : 3 Nov, 2015, 2:58:25 PM
    Author     : gurjot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
             <%@include file="logoutcheck.jsp" %>
        <%
            session.invalidate();
    response.sendRedirect("login.jsp");
%>

    </body>
</html>
