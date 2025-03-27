<%@page import="servlet.sendmail"%>
<%@page import="beans.Login"%>
<%@page import="op.DBOperation"%>
<%
   String username3=request.getParameter("username2");
   DBOperation db=new DBOperation();
   Login lg=db.getProfile(username3);
   String from="online.ide36@gmail.com";
   String to=lg.getEmail().trim();
   String fullname=lg.getFname()+" "+lg.getLname();
   String subject="Password Confirmation";
   String msg="Dear "+fullname+"\n\n Your Password is "+lg.getPassword();
   sendmail ob=new sendmail(to,from,subject,msg);
   
   try
   {
   ob. sendMail();
   out.println("Message Sent Successfully");
   }
   catch(Exception e)
   {
       out.println("Connection Failed. Try Again!!!!!");
   }
%>
