<%-- 
    Document   : myprofile
    Created on : 19 Nov, 2015, 3:17:05 PM
    Author     : gurjot
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Login"%>
<%@page import="op.DBOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online IDE</title>
        <%--menubar--%>
        <link rel="stylesheet" href="css/styles.css">
        <script src="js/menu.js" type="text/javascript"></script>
        <script src="script/script.js"></script>
        <script src="js/onlineide.js"></script>
        <script type="text/javascript">
            function chatRepeat(){
                var rec=document.getElementById("reciver").value;
                //alert(rec);
                if(rec==null ||rec==""){
                   
                }
               else
               {
                    chatLoad();
               }
                setInterval(function() {chatRepeat()},1000);
            }
        </script>
    </head>
    <body onload="chatRepeat()">
        <%@include file="logoutcheck.jsp" %>
        <jsp:include page="header.jsp" flush="true"></jsp:include>
        <div id="profile">
            <%
                String username=(String)session.getAttribute("USERNAME");
                DBOperation db=new DBOperation();
                Login lg=db.getProfile(username);
                db.userList(username);
            %>
            <h2>My Profile</h2>
            Username:  <%=username%><br/><br/>
            Firstname:<%=lg.getFname()%><br/><br/>
            Lastname:<%=lg.getLname()%><br/><br/>
            Nationality:<%=lg.getNation()%><br/><br/>
            Date Of  Birth:<%=lg.getDob()%><br/><br/>
            Email Id:<%=lg.getEmail()%><br/><br/>
            Contact No. :<%=lg.getPhone()%><br/><br/>
            <a href="changepass.jsp">  <input type="button" value="Change password"></a>
            <a href="editprofile.jsp"><input type="submit" value="Edit Profile"></a>
            <a href="uploadprofilepic.jsp"><input type="submit" value="Upload Profile picture"/></a>
        </div>
        <div id="live-chat">
            <header class="clearfix">
                <a href="#" class="band">x</a>
                <h4 id="name"><%=lg.getFname()%>&nbsp<%=lg.getLname()%></h4>
                <span class="chat-message-counter"></span>
            </header>
                <div class="chat">
                    <div class="chat-history" id="chat555">
                      <hr>   
                    </div>
                   
                </div>
                <form action="#" >
                    <fieldset>
                        <input type="text" placeholder="Type your message…" id="sendermsg" autofocus/>
                        <input type="hidden" id="reciver" value=""/>
                        <input type="hidden" id="sender" value="<%=username%>"/>
                        <input type="button" value="Send" name="se" onclick="getMsgajax()"/>
                    </fieldset>
                </form>
            </div>
                   <!-- end chat -->
        </div> <!-- end live-chat -->
        <a href="#" id="chat-open">open</a>
        <div class="persons">
            <%
                DBOperation ob1=new DBOperation();
                ArrayList al=ob1.userList(username);
                for(int i=0;i<al.size();i++){
                Login l=(Login)al.get(i);
            %>
                <div class="per">
                    <a href="javascript:userData(<%=i%>)">
                        <input type="hidden" name="k<%=i%>" id="k<%=i%>" value="<%=l.getUsername()%>"/>
                        <img src="<%=l.getPath()%>"/><p><%=l.getFname()%>&nbsp;<%=l.getLname()%></p>
                    </a>
                </div>
            <%}%>
        </div>
    </body>
</html>

