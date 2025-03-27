<%@page import="java.io.File"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/mobile.css"/>
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"> 
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="HandheldFriendly" content="true">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online IDE</title>
        <link rel="stylesheet" href="css/demo_1.css"/>
        <link rel="stylesheet" href="css/styles_1.css"/>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/onlineide.js"></script>
        <script type="text/javascript"></script>
    </head>
    <body style="background-image: url(images/jj.jpg)">
        <div id="popUpDiv" style="display:none;">
            <a href="#" onclick="popup('popUpDiv')" id="close" >Close[x]</a>
                <form action="afterproject.jsp">
                    Project Name:<input type="text" name="text" placeholder="Project Name">
                    <input type="submit" name="choose" value="Create Project"/>
                </form>
                <div id="pmssg"></div>
	</div>
        <div id="clrr"></div>
        <div id="openp" style="display:none;">
            <a href="#" onclick="popup('popUpDiv')" id="clos" >Close[x]</a>
                <form action="afteropen.jsp">
                    Choose Project:<select name="pro_name">
                    <%
                        String path=(String)session.getAttribute("PATH");
                        File n=new File(path);
                        String j[]=n.list();
                        for(int i=0;i<j.length;i++){
                    %>
                    <option value="<%=j[i]%>">
                           <%=j[i]%>
                    </option>  
                    <% }%>
                </select>
                    <input type="submit" name="choose" value="Open Project"/>
                </form>
        </div>
        <div id="clrr"></div>
        <div id="openf" style="display:none;">
            <a href="#" onclick="popup('popUpDiv')" id="clo" >Close[x]</a>
            <form action="afterfile.jsp">
                <select name="file">
                    <%
                        String way=(String)session.getAttribute("PATH");
                        File t=new File(way);
                        String h[]=t.list();
                        for(int i=0;i<h.length;i++){
                    %>
                    <option value="<%=h[i]%>">
                        <%=h[i]%>
                    </option>
                    <%}%>
                </select><br/><br/>
                <input name="file1" type="text" placeholder="Name Of File"/><br/><br/>
                <div id="pmss"></div><br/>
                <input type="submit" value="Submit"/>
            </form>
        </div>
        <% if(request.getParameter("ps")!=null){
            if(request.getParameter("ps").equals("invalid")){%>
                <script type="text/javascript">
                    document.getElementById("popUpDiv").style.display="block";
                    document.getElementById("pmssg").innerHTML="<font color=red size=2>Project Name Already Exits</font>";
                </script>
       <% } }%>
       <div class="message">
        <% if(request.getParameter("f")!=null){
            if(request.getParameter("f").equals("invalidfile")){%>
            <script type="text/javascript">
                document.getElementById("openf").style.display="block";
                document.getElementById("pmss").innerHTML="<font color=red size=2>File Name Already Exits</font>";
            </script>
       <% } }%>
       </div>
       <div id="rep" style="display:none;">
           <a href="#" onclick="popup('popUpDiv')" id="c" >Close[x]</a>
            <form action="replace.jsp">
                <input type="text" placeholder="Find What" name="fw"/><br/>
                <input type="text" placeholder="Replace With" name="rw"/><br/>
                <input type="submit" value="Replace"/><br/>
                <input type="submit" value="Replace All"/><br/>
            </form>
	</div>
       <div id="find" style="display:none;">
           <a href="#" onclick="popup('popUpDiv')" id="c2" >Close[x]</a>
           <form action="find.jsp">
               <input type="text" placeholder="Find" name="Find"/><br/>
               <input type="submit" value="Find"/><br/>
            </form>
        <div id="msg"></div>
	</div>
        <div id="rn" style="display:none;">
           <a href="#" onclick="popup('popUpDiv')" id="c3" >Close[x]</a>
           <form action="rename.jsp">
               <input type="text" placeholder="Enter Name" name="rn"/><br/>
               <input type="submit" value="OK"/><br/>
            </form>
        <div id="msg"></div>
	</div>
        <%
            if(request.getParameter("ct")!=null){
                String c=request.getParameter("ct");
        %>
        <script type="text/javascript">
            document.getElementById("find").style.display="block";
            document.getElementById("msg").innerHTML="<font color=red size=2>This word exits "+<%=c%>+" number of times</font>";
        </script>
       <%}%>
       <div id="download" style="display:none;">
            <a href="#" onclick="popup('popUpDiv')" id="c4" >Close[x]</a>
            <form action="/onlineide/DownLoad" method="post">
                    <select name="projectd" onchange="getFiles(this)">
                        <option value="">--Select Project--</option>
                         <%
                        String down=(String)session.getAttribute("PATH");
                        File down1=new File(down);
                        String down2[]=down1.list();
                        for(int i=0;i<down2.length;i++){
                    %>
                    <option value="<%=down2[i]%>">
                        <%=down2[i]%>
                    </option>
                    <%}%>
                    </select>
                    <select name="pfile" id="pfile">
                        <option value="">--Select File--</option>
                </select>
                    <input type="submit" value="Download"/>
            </form>
                
	</div>
        <div id="upload" style="display:none;">
            <a href="#" onclick="popup('popUpDiv')" id="c6" >Close[x]</a>
            <form action="/onlineide/UploadServlet" method="post" enctype="multipart/form-data">
                <input type="file" placeholder="file" name="fi" id="fi"/>
                <input type="submit" value="Upload"/>
            </form>
                
	</div>
       <div id="clrr"></div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="IDE.jsp">Online IDE</a>
                </div>
                <div>
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="IDE.jsp">Home</a></li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">File<span class="caret"></span></a>
                             <ul class="dropdown-menu">
                                <li id="popup"><a href="#">New Project</a></li>
                                <li id="op"><a href="#">New File</a></li>
                                <li class="ope"><a href="#">Open Project</a></li> 
                                <li id="save"><a href="#">Save</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Compile and Run<span class="caret"></span></a>
                             <ul class="dropdown-menu">
                                <li><a href="javascript:compile()">Compile</a></li>
                                <li><a href="javascript:run()">Run</a></li>
                            </ul>
                        </li> 
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Edit<span class="caret"></span></a>
                             <ul class="dropdown-menu">
                                <li id="replace"><a href="#">Replace</a></li>
                                <li id="fin"><a href="#">Find</a></li>
                                <li id="rename"><a href="#">Rename</a></li>
                                <li><a href="#" onclick="left()">Shift Left</a></li>
                                <li><a href="#" onclick="right()">Shift Right</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Download and Upload<span class="caret"></span></a>
                             <ul class="dropdown-menu">
                                <li id="down"><a href="#">Download</a></li>
                                <%if(session.getAttribute("PROJECTNAME")!=null){%>
                                <li id="up222"><a href="#">Upload</a></li>
                                <%}%>
                            </ul>
                        </li> 
                    </ul>
                </div>
            </div>
        </nav>
        <div id="clrr"></div>
        <div id="icon">
            <a href="#"data-toggle="tooltip" title="Open Project"><img src="images/project_open.png" width="48" height="48"/></a>
            <a data-toggle="tooltip" title="New Project"><img src="images/window_new.png" width="48" height="48"/></a>
            <a data-toggle="tooltip" title="Undo"><img src="images/undo (1).png" width="48" height="48"/></a>
            <a data-toggle="tooltip" title="Redo"><img src="images/redo_icon.png" width="48" height="48"/></a>
            <input type="text" placeholder="search" name="search" width="48" height="48"/>
            <a data-toggle="tooltip" title="Build Project"><img src="images/applications_development.png" width="48" height="48"/></a>
            <a data-toggle="tooltip" title="Run Project"><img src="images/run.png" width="48" height="48"/></a>
        </div>   
        <div id="clrr"></div>
            <div id="text">
                <div class="t">
                    <%
                        if(session.getAttribute("PROJECTNAME")!=null){
                            String p=(String)session.getAttribute("PATH");
                            String pn=(String)session.getAttribute("PROJECTNAME");
                            String f=p+"/"+pn;
                            File g=new File(f);
                            String a[]=g.list();
                        %>
                        <img width="22" height="32" src="images/run.png"/><%=pn%><br/>
                        <%
                        for(int i=0;i<a.length;i++){
                            %>
                            |__<label onclick="getFileData(this)" id="h"><%=a[i]%></label><br/>
                        <%}
                        }%>
                        </div>
            </div>
           <form action="savefile.jsp">
            <div id="text1">
                <div id="s" style="display:none;">
                    <a href="#" onclick="popup('popUpDiv')" id="cl" >Close[x]</a>
                    <input type="submit" name="save" value="Save"/>
                </div>
                <textarea rows="30" cols="120" name="code" id="code"></textarea>
            </div>
            </form>
            <div id="text2">
                <h3>Output:-</h3>
                <textarea rows="6" cols="120" id="output"></textarea>
            </div>
            <div id="clrr"></div>
            <div id="foot" style="border: 0px solid darkorange">
            <div id="foo" style="border: 0px solid darkmagenta">
                <ul>
                    <li><a href='IDE.jsp'><span>Home |</span></a></li>
                    <li><a href='#'><span>Feedback |</span></a></li>
                    <li><a href='#'><span>Sitemap |</span></a></li>
                    <li><a href='con.jsp'><span>Contact </span></a></li>
                </ul>
            </div>
            <div id="cop">
                <p>Copyright © 2015 -2016 All Rights Reserved by Gurjot Singh New updating website 2015-2016.- Powered By Gurjot Singh. For any further information, please <a href="#">Contact us</a></p>
            </div>
            </div>
            <script>
                $(document).ready(function(){
                  $('[data-toggle="tooltip"]').tooltip();   
                });
            </script>
    </body>
</html>
