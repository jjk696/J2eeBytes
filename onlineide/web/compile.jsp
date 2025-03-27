<%@page import="servlet.CompileRunProgram"%>
<%
    String cpath=(String)session.getAttribute("PATH");
    String cprojectname=(String)session.getAttribute("PROJECTNAME");
    String cfilename=(String)session.getAttribute("FILENAME");
    String cs=(String)session.getAttribute("SAVE");
    String compiledata="";
    if(cs.equals("save")){
        CompileRunProgram crp=new CompileRunProgram();
       compiledata= crp.compile(cpath+"/"+cprojectname,cfilename,cs);
    }else{
        compiledata="First Save Your File";
        
    }
%>
<%=compiledata%>
