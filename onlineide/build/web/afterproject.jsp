<%-- 
    Document   : afterproject
    Created on : 27 Jan, 2016, 3:53:23 PM
    Author     : gurjot
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>After project</title>
    </head>
    <body>
         <%
               
                String name=request.getParameter("text");
               String path=(String)session.getAttribute("PATH");
               String full=path+"/"+name;
               File f=new File(full);
               System.out.println("getPath..."+f.getAbsolutePath());
               if(!f.exists()){
                    f.mkdir();
                    session.setAttribute("PROJECTNAME",name );
                    response.sendRedirect("ser.jsp");
                }
               else
               {
                   response.sendRedirect("ser.jsp?ps=invalid");
               }
               
                %>
    </body>
</html>
