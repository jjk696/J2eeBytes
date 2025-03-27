<%-- 
    Document   : editprofile
    Created on : 16 Jan, 2016, 1:47:17 PM
    Author     : gurjot
--%>

<%@page import="beans.Login"%>
<%@page import="op.DBOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
          <div id="profile">
            <%
                String username=(String)session.getAttribute("USERNAME");
                DBOperation db=new DBOperation();
                Login lg=db.getProfile(username);
                %>
            <h2>My Profile</h2>
            <form action="/onlineide/EditProfile">
            <input type="hidden" name="username" value="<%=session.getAttribute("USERNAME")%>"/>
         
            Firstname:<input type="text" value="<%=lg.getFname()%>" name="firstn"/><br/><br/>
            Lastname:<input type="text" value="<%=lg.getLname()%>" name="lastn"/><br/><br/>
            Nationality:<input type="text" value="<%=lg.getNation()%>" name="n"/><br/><br/>
            Date Of  Birth:<input type="text" value="<%=lg.getDob()%>" name="date"/><br/><br/>
            Email Id:<input type="text" value="<%=lg.getEmail()%>" name="e"/><br/><br/>
            Contact No. :<input type="text" value="<%=lg.getPhone()%>" name="c"/><br/><br/>
            <input type="submit" value="Done"/>
            </form>
           </div>
    </body>
</html>
