<%@page import="op.DBOperation"%>
<%@page import="java.util.Date"%>
<%@page import="beans.message"%>
<%
    String msg=request.getParameter("meg");
    String sender=request.getParameter("sender_user");
    String reciver=request.getParameter("reciver_user");
    message m=new message();
    m.setMsg(msg);
    m.setSender(sender);
    m.setReciver(reciver);
    Date d=new Date();
    String dd=  d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900);
    String time=d.getHours()+":"+(d.getMinutes());
    m.setDate(dd);
    m.setTime(time);
    DBOperation bg=new DBOperation();
    bg.insertMsg(m);
    bg.extractMsg(sender, reciver);
%>