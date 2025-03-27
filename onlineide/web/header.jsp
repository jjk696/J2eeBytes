<%-- 
    Document   : header
    Created on : 23 Nov, 2015, 3:54:10 PM
    Author     : gurjot
--%>

<%@page import="op.DBOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
         <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        <div id='cssmenu' style="border: 0px solid red">
            <ul>
                <li class='active'><a href='IDE.jsp'><span>Home</span></a></li>
                <li><a href='about.jsp'><span>About Us</span></a></li>
                 <%if(session.getAttribute("USERNAME")!=null){%>
                <li><a href='Beforeide.jsp'><span>Services</span></a></li>
                 <%}else{%>
                 <li><a href="javascript:alert('plz Login First');location.href='login.jsp'"><span>Services</span></a></li>
                 <%}%>
                <li class='last'><a href='con.jsp'><span>Contact</span></a></li>
                <%if(session.getAttribute("USERNAME")==null){%>
                <div id="up1">
                    <li><a href='login.jsp'><span>Login</span></a></li>
                </div>
                <%}else{%>
                 <div id="up">
                     <%
                        String user=(String)session.getAttribute("USERNAME");
                        DBOperation op=new DBOperation();
                        String pic_path=op.updateProfilePics(user);
                        if(pic_path!=null){
                     %>
                     <li><a href="myprofile.jsp"><img src="<%=pic_path%>"/></a></li>
                     <%}%>
                    <li><a href='myprofile.jsp'><span>My Profile</span></a></li>
                    <li><a href="logout.jsp"><span>Logout</span></a></li>
                                    </div>
                <%}%>
            </ul>
        </div>
    </body>
</html>
