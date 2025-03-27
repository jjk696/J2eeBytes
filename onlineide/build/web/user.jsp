<%@page import="beans.Login"%>
<%@page import="op.DBOperation"%>
<%
    String user=request.getParameter("username");
    DBOperation bb=new DBOperation();
    Login lg=bb.getProfile(user);
%>
<%=lg.getFname()%>&nbsp<%=lg.getLname()%>