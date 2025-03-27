<%-- 
    Document   : logoutcheck
    Created on : 3 Nov, 2015, 3:29:17 PM
    Author     : gurjot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout check</title>
    </head>
    <body>
        <%
            //http1.1
            response.setHeader("Cache-Control","no-cache");
            //http1.0
            response.setHeader("Cache-Control", "no-store");
            //expire data after asession
            response.setDateHeader("Expires",0);
            //backword compatibilty
            response.setHeader("Pragma", "no-cache");
            if(session.getAttribute("USERNAME")==null){
                response.sendRedirect("login.jsp");
            }
            %>
    </body>
</html>
