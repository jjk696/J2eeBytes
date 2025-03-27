<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%
    String repath=(String)session.getAttribute("PATH");
    String reprojectname=(String)session.getAttribute("PROJECTNAME");
    String refilename=(String)session.getAttribute("FILENAME");
    File re=new File(repath+"/"+reprojectname+"/"+refilename);
    byte rrepalce[]=new byte[(int)re.length()];
    FileInputStream rr=new FileInputStream(re);
    rr.read(rrepalce);
    String r=new String(rrepalce);
    String fw=request.getParameter("fw");
    String rw=request.getParameter("rw");
    String st=r.replace(fw, rw);
    byte rrr[]=st.getBytes();
    FileOutputStream fos=new FileOutputStream(re);
    fos.write(rrr);
    response.sendRedirect("ser.jsp");
%>