<%@page import="beans.Login"%>
<%@page import="beans.message"%>
<%@page import="java.util.ArrayList"%>
<%@page import="op.DBOperation"%>
<link type="text/css" rel="stylesheet" src="css/styles.css"/>
<%
    String sender1=request.getParameter("sender");
    String reciver1=request.getParameter("reciver");
    DBOperation bn=new DBOperation();
    ArrayList al6=bn.extractMsg(sender1,reciver1);
    for(int i=0;i<al6.size();i++){
        message m2=(message)al6.get(i); 
        Login lg=bn.getProfile(sender1);
        Login lg1=bn.getProfile(reciver1);
%>
                    <div class="chat-message">
                        <div class="chat-message-content clearfix">
                            <span class="chat-time"><%=m2.getTime()%></span>
                            <%if(m2.getSender().equals((String)session.getAttribute("USERNAME"))){%>
                            <h5 style="background-color: yellow;min-height: 30px;"><img src="<%=lg.getPath()%>" height="30" width="30" style='border-radius: 90px'/><%=lg.getFname()%>&nbsp;&nbsp;<%=lg.getLname()%></h5>
                            <%}else{%>
                             <h5 style="background-color: green;min-height: 30px;"><img src="<%=lg1.getPath()%>"  height="30" width="30" style='border-radius: 90px'/><%=lg1.getFname()%>&nbsp;&nbsp;<%=lg1.getLname()%></h5>
                            
                            <%}%>
                            <p><%=m2.getMsg()%></p>
                        </div> 
                    </div>
                    <hr>
<%}%>