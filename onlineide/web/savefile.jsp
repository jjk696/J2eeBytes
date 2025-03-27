<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%
    String code=request.getParameter("code");
    String spath=(String)session.getAttribute("PATH");
    String sprojectname=(String)session.getAttribute("PROJECTNAME");
    String sfilename=(String)session.getAttribute("FILENAME");
    File sf=new File(spath+"/"+sprojectname+"/"+sfilename);
    byte sb[]=code.getBytes();
    FileOutputStream ot=new FileOutputStream(sf);
    ot.write(sb);
    session.setAttribute("SAVE", "save");
    response.sendRedirect("ser.jsp");
 %>
