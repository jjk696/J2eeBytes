<%@page import="java.io.File"%>
<%
    String proj=request.getParameter("projectname");
    String projpath=(String)session.getAttribute("PATH");
    File projfile=new File(projpath+"/"+proj);
    String projdown[]=projfile.list();
   
    for(int i=0;i<projdown.length;i++){
      %> 
      <option value="<%=projdown[i]%>"><%=projdown[i]%></option>
   <% }
%>
   