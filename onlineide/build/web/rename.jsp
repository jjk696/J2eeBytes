<%@page import="java.io.File"%>
<%
    String repath=(String)session.getAttribute("PATH");
    String reprojectname=(String)session.getAttribute("PROJECTNAME");
    String refilename=(String)session.getAttribute("FILENAME");
    File refile=new File(repath+"/"+reprojectname+"/"+refilename);
    String rename=request.getParameter("rn");
    File newname=new File(repath+"/"+reprojectname+"/"+rename+".java");
    refile.renameTo(newname);
    response.sendRedirect("ser.jsp");
%>
