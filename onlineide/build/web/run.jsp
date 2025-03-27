<%@page import="servlet.CompileRunProgram"%>
<%
    String rpath=(String)session.getAttribute("PATH");
    String rprojectname=(String)session.getAttribute("PROJECTNAME");
    String rfilename=(String)session.getAttribute("FILENAME");
    CompileRunProgram crp1=new CompileRunProgram();
    String ot=crp1.run(rpath+"/"+rprojectname, rfilename);
%>
<%=ot%>