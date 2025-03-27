<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%
    String fipath=(String)session.getAttribute("PATH");
    String fiprojectname=(String)session.getAttribute("PROJECTNAME");
    String fifilename=(String)session.getAttribute("FILENAME");
    File fi=new File(fipath+"/"+fiprojectname+"/"+fifilename);
    byte fin[]=new byte[(int)fi.length()];
    FileInputStream fis=new FileInputStream(fi);
    fis.read(fin);
    String fid=new String(fin);
     String find=request.getParameter("Find").trim();
    int nh=fid.indexOf(find);
    System.out.println(nh);
   if(nh==-1)
   {
        response.sendRedirect("ser.jsp?ct=0");
   }
   else
   {
       int count=0;
       String stt[]=fid.split(" ");
     for(int i=0;i<stt.length;i++)
     {
         if(stt[i].equals(find))
         {
             count++;
         }
     }
      response.sendRedirect("ser.jsp?ct="+count);
   }
   
%>