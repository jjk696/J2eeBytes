<%-- 
    Document   : fp
    Created on : Feb 29, 2016, 8:41:55 PM
    Author     : Guru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ONLINE IDE</title>
        <link rel="stylesheet" type="text/css" href="css/style1.css"/>
        <link rel="stylesheet" type="text/css" href="css/styles.css"/>
        <script type="text/javascript" src="js/modernizr.custom.86080.js"></script>
        <script src="js/menu.js" type="text/javascript"></script>
        <script src="script/script.js"></script>
        <script type="text/javascript" src="script/onlineide.js"></script>
        <script type="text/javascript">
            function getData()
{
    try
    {
        xmlobj = new XMLHttpRequest();
    } catch (e)
    {
        try
        {
            xmlobj = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (e) {
        }
    }
    return xmlobj;
}
            function forgetPasswordUser(){
                //alert("hello");
                xmlobj2 = getData();
                if (xmlobj2 == null){
                    alert("Your Browser does not support Ajax");
                    return;
                }
                var username5=document.getElementById("gg").value;
                //alert(username5);
                xmlobj2.open("GET","fp1.jsp?username2="+username5,true);
                xmlobj2.send(null);
                xmlobj2.onreadystatechange=statechanged7;
                //alert()
            }
            function statechanged7(){
                if(xmlobj2.readyState==4){
                    document.getElementById("display").innerHTML=xmlobj2.responseText;
                }
            }
        </script>
    </head>
    <body>
        <ul class="cb-slideshow">
            <li><span>Image 01</span></li>
            <li><span>Image 02</span></li>
            <li><span>Image 03</span></li>
            <li><span>Image 04</span></li>
            <li><span>Image 05</span></li>
            <li><span>Image 06</span></li>
        </ul>
        <%--menubar--%>
        <jsp:include page="header.jsp" flush="true"></jsp:include>
        <div class="form1">
            <div id="display"></div>
            <form action="">
                <%
                    String user11=request.getParameter("username");
                %>
                <input type="hidden" id="gg" value="<%=user11%>"/>
                <input type="radio" id="sendlink" name="rb" value="Send Link To Your Email" onclick="javascript:forgetPasswordUser()"/>Send Link To Your Email<br/>
                <input type="radio" id="question" name="rb" value="Answer Your Hint Question?"/>Answer Your Hint Question?<br/>
                <input type="button"  value="ok"/>
            </form>
        </div>
    </body>
</html>
