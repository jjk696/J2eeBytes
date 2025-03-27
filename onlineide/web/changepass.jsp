<%-- 
    Document   : changepass
    Created on : 19 Nov, 2015, 4:31:31 PM
    Author     : gurjot
--%>

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
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        
        <script type="text/javascript">
            function matchpassword(){
                var pwd2=document.getElementById("op").value;
                var pwd=document.getElementById("np").value;
                var pwd1=document.getElementById("cp").value;
                if(!(pwd2=="" ||pwd2==null || pwd=="" || pwd==null || pwd1=="" || pwd1==null))
                {
                if(pwd!=pwd1){
                  document.getElementById("message").innerHTML="<font size=3 color=red>Password should be same</font>";
                  document.getElementById("np").value="";
                  document.getElementById("cp").value="";
                  document.getElementById("np").focus();
                  return false;
                }
            }else{
             
               document.getElementById("empty").innerHTML="<font size=3 color=red>All feilds are reqired</font>";
               return false;
              
            }
            }
        </script>
    </head>
    <body>
         <div id='cssmenu' style="border: 0px solid red">
            <ul>
                <li class='active'><a href='IDE.jsp'><span>Home</span></a></li>
                <li><a href='about.jsp'><span>About Us</span></a></li>
                <li><a href='ser.jsp'><span>Services</span></a></li>
                <li><a href='login.jsp'><span>Login</span></a></li>
                <li class='last'><a href='con.jsp'><span>Contact</span></a></li>
                <div id="up">
                    <li><a href='myprofile.jsp'><span>My Profile</span></a></li>
                    <li><a href="logout.jsp"><span>Logout</span></a></li>
                    <li><a href="myprofile.jsp"><img/></a></li>
                </div>
            </ul>
        </div>
        <div id="change">
            <form action="/onlineide/changepassword"  onsubmit="return matchpassword()">
                <div id="empty">
                </div>
            <input type="hidden" name="username" value="<%=session.getAttribute("USERNAME")%>"/>
            <input type="password" placeholder="Old Password" name="old" id="op"><br/><br/>
            <input type="password" placeholder="New Password" name="new" id="np"><br/><br/>
            <input type="password" placeholder="Confirm password" name="con" id="cp">
            <div id="message">
            </div>
            <br/><br/>
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
            </form>
        </div>
          <div id="footer" style="border: 0px solid darkorange">
                <div id="foomenu" style="border: 0px solid darkmagenta">
                    <ul>
                        <li><a href='IDE.jsp'><span>Home |</span></a></li>
                        <li><a href='#'><span>Feedback |</span></a></li>
                        <li><a href='#'><span>Sitemap |</span></a></li>
                        <li><a href='con.jsp'><span>Contact </span></a></li>
                    </ul>
		</div>
                <div id="copy">
                    <p>Copyright © 2015 -2016 All Rights Reserved by Gurjot Singh New updating website 2015-2016.- Powered By Gurjot Singh. For any further information, please <a href="#">Contact us</a></p>
                </div>
            </div>
    </body>
</html>
