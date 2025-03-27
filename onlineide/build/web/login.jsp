<%-- 
    Document   : login
    Created on : 16 Nov, 2015, 3:25:01 PM
    Author     : gurjot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <title>Online IDE</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link rel="stylesheet" href="css/styles.css">
        <script src="js/menu.js" type="text/javascript"></script>
        <script src="js/onlineide.js" type="text/javascript"></script>
        <script src="script/script.js"></script>
        <link rel="stylesheet" href="css/reset.css">
        <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
        <link rel="stylesheet" href="css/style_1.css">
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style1.css" />
        <script type="text/javascript" src="js/modernizr.custom.86080.js"></script>
        <script type="text/javascript">
            function validateform(){
                var user=document.forms["register"]["username"].value;
                var pass=document.forms["register"]["password"].value;
                var fname=document.forms["register"]["fname"].value;
                var lname=document.forms["register"]["lname"].value;
                var email=document.forms["register"]["email"].value;
                var phone=document.forms["register"]["phone"].value;
              
                if((user==""||user==null || pass==""|| pass==null || fname=="" || fname==null || lname=="" ||lname==null || email=="" || email==null || phone=="" || phone==null)){
                    document.getElementById("regmessage").innerHTML="<font color=red size=3>All feilds are required</font>";
                    return false;
                }
            }
             function matchpassword(){
                var pwd=document.getElementById("np").value;
                var pwd1=document.getElementById("cp").value;
               
                if(pwd!=pwd1){
                  document.getElementById("message1").innerHTML="<font size=3 color=red>Password should be same</font>";
                  document.getElementById("np").value="";
                  document.getElementById("cp").value="";
                  document.getElementById("np").focus();
                  return false;
                }
            
            }
            
            function onlyNumeric(e)
            {
                var c=e.keyCode?e.keyCode:e.charCode;
               if(c<48 || c>57)
               {
                   return false;
               }
            }
            function forgetPass(){
                var username1=document.getElementById("username22").value;
                //alert(username1);
                if(username1==null || username1==""){
                     alert("first enter the username");
                     return false;
                }
                else{
                  
                    location.href="fp.jsp?username="+username1;
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
        <jsp:include page="header.jsp" flush="true"></jsp:include>
        <!-- Form Mixin-->
        <!-- Input Mixin-->
        <!-- Button Mixin-->        
        <!-- Pen Title-->
        <!-- Form Module-->
        <div class="module form-module">
            <div class="toggle"><i class="fa fa-times fa-pencil"></i>
                <div class="tooltip">Click Here For Registration</div>
                </div>
                <div class="form">
                    <h2>Login to your account</h2>
                    <form action="/onlineide/LoginServlet" method="post">
                        <input type="text" placeholder="Username" name="username" id="username22"/>
                        <input type="password" placeholder="Password" name="pwd" />
                        <button>Login</button>
                    </form>
                </div>
            <div id="regmessage"></div>
                <div class="form">
                    <h2>Create an account</h2>
                    <form action="/onlineide/RegistrationServlet" method="post" name="register" onsubmit="return validateform()">
                        <input type="text" placeholder="Username" name="username"/>
                        <input type="password" placeholder="Password" name="password" id="np"/>
                        <input type="password" placeholder="Confirm Password" name="cp" id="cp" onblur="return matchpassword()"/>
                        <div id="message1"></div>
                        <input type="text" placeholder="Firstname" name="fname"/>
                         <input type="text" placeholder="Lastname" name="lname"/>
                        <div id="sel">
                        <select style="width: 70px" name="day">
                            <option value="">Date</option>
                            <%for(int i=1;i<32;i++){%>
                            <option value="<%=i%>"><%=i%></option>
                            <%}%>
                        </select>
                        <select style="width: 75px" name="month">
                            <option value="">Month</option>
                            <%for(int i=1;i<13;i++){%>
                            <option value="<%=i%>"><%=i%></option>
                                    <%}%>
                        </select>
                        <select style="width: 87px" name="year">
                            <option value="">Year</option>
                            <%for(int i=2020;i>0;i--){%>
                            <option value="<%=i%>"><%=i%></option>
                                    <%}%>
                        </select>
                        </div>
                        <input type="email" placeholder="Email Address" name="email"/>
                        <input type="tel" placeholder="Phone Number" name="phone" onkeypress="return onlyNumeric(event)" maxlength="10"/>
                        <select name="nation" style="width: 242px">
                            <option value="">Nationality</option>
                             <option value="Indian">Indian</option>
                              <option value="Foreigner">Foreigner</option>
                        </select><br/>
                        <button>Register</button>
                    </form>
                </div>
                        <div class="cta" onclick="forgetPass()"><a href="#">Forgot your password?</a></div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='js/da0415260bc83974687e3f9ae.js'></script>
        <script src="js/index.js"></script>
    </body>
</html>
