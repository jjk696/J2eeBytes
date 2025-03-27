<%-- 
    Document   : IDE
    Created on : 26 Oct, 2015, 9:04:27 PM
    Author     : gurjot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/mobile.css"/>
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online IDE</title>
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style1.css" />
        <script type="text/javascript" src="js/modernizr.custom.86080.js"></script>
        <%--menubar--%>
        <link rel="stylesheet" href="css/styles.css">
        <script src="js/menu.js" type="text/javascript"></script>
        <script src="script/script.js"></script>
        <%--hover--%>
        <link rel="stylesheet" type="text/css" href="css/demo_1.css" />
        <link rel="stylesheet" type="text/css" href="css/style_common.css" />
        <link rel="stylesheet" type="text/css" href="css/style8.css" />
        <%--footer--%>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <%--login--%>
        <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
        <div align="center">
            <div id="main" style="min-height: 800px;height: auto;width: 1250px;border:0px solid blue">
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
                <div id="homemain" style="border: 0px solid green">
                    <%--hover--%>
                    <div class="container" style="border: 0px solid darkblue">
                        <div class="main" style="border:0px solid yellow">
                            <div class="view view-eighth">
                                <img src="image/3.jpg" />
                                <div class="mask">
                                    <h2>C</h2>
                                    <p>In 1972 Dennis 
                                        Ritchie at Bell Labs writes C and in 1978 the publication of 
                                        The C Programming Language 
                                        by Kernighan & Ritchie caused a revolution in the computing world.
                                    </p>
                                    <a href="#" class="info">Read More</a>
                                </div>
                            </div>
                            <div class="view view-eighth">
                                <img src="image/2.jpg" />
                                <div class="mask">
                                    <h2>JAVA</h2>
                                    <p>James Gosling, Mike Sheridan, and Patrick Naughton 
                                        initiated the Java language project in June 1991.
                                        The language was initially called Oak. Later the project was finally renamed Java
                                    </p>
                                    <a href="#" class="info">Read More</a>
                                </div>
                            </div>
                            <div class="view view-eighth">
                                <img src="image/1.jpg" />
                                <div class="mask">
                                    <h2>HTMl</h2>
                                    <p>The founder of HTML was Tim Berners-Lee and 
                                    his product was made attractive to the general public by 
                                     Mosaic browser which was evolved at NCSA. It has become extremely popular.
                                    </p>
                                    <a href="#" class="info">Read More</a>
                                </div>
                            </div>
                            <div class="view view-eighth">
                                <img src="image/6.jpg" />
                                <div class="mask">
                                    <h2>JQUERY</h2>
                                    <p>jQuery is a cross-platform JavaScript library designed 
                                    to simplify the client-side scripting of HTML. JQuery is developed by
                                    John Resig in August 26, 2006
                                    </p>
                                    <a href="#" class="info">Read More</a>
                                </div>
                            </div>
                            <div class="view view-eighth">
                                <img src="image/4.jpg" />
                                <div class="mask">
                                    <h2>PHP</h2>
                                    <p>PHP is a server-side scripting language designed for web development.Originally created by Rasmus Lerdorf in 1994</p>
                                    <a href="#" class="info">Read More</a>
                                </div>
                            </div>
                            <div class="view view-eighth">
                                <img src="image/5.png" />
                                <div class="mask">
                                    <h2>Java Script</h2>
                                    <p>JavaScript is a high-level, dynamic, untyped, and interpreted programming language.
                                        JavaScript is developed by Brendan Eich
                                    </p>
                                    <a href="#" class="info">Read More</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
                </div>
                <%--footer--%>
                <div id="clrr"></div>
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
                <div id="clrr"></div>
                <div id="markq" style="border: 0px solid red" class="col-3 col-m-3">
                    <h1 id="h">Updates</h1>
                    <div id="p">
                        <marquee direction="down" height=384px>
                            <p>
                            </p>
                        </marquee>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
