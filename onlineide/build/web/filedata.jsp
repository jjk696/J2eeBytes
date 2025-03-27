<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%
    String filename=request.getParameter("filename");
    String fpath=(String)session.getAttribute("PATH");
    String fprojectname=(String)session.getAttribute("PROJECTNAME");
    session.setAttribute("FILENAME", filename);
    File ff=new File(fpath+"/"+fprojectname+"/"+filename);
    String fdata="";
    if(ff.length()>0)
    {
        FileInputStream in=new FileInputStream(ff);
        byte fb[]=new byte[(int)ff.length()];
        in.read(fb);
        
        String st=new String(fb);
        fdata=st.trim();
    }
    else
    { String fname=filename.substring(0,filename.indexOf(".java"));
        String cdata="public class "+fname+"{\n\n\t public static void main(String arg[]){\n\n\t}}";
        fdata=cdata;
    }
    %>
    
    <%=fdata%>