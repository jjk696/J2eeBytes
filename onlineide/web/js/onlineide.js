
function getData()
{
    try
    {
        xmlobj = new XMLHttpRequest();
    } catch (e)
    {
        try
        {
            xmlobj = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (e) {
        }
    }
    return xmlobj;
}

function getFileData(s)
{
    xmlobj = getData();
    if (xmlobj == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }
    filename = s.innerHTML;
    //alert(filename);
    xmlobj.open("GET", "filedata.jsp?filename=" + filename, true);
    xmlobj.send(null);
    xmlobj.onreadystatechange = statechanged;
}

function statechanged()
{
    if (xmlobj.readyState == 4)
    {
        document.getElementById("code").value = xmlobj.responseText;
    }
}
function compile()
{
    xmlobj = getData();
    if (xmlobj == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }

    xmlobj.open("GET", "compile.jsp", true);
    xmlobj.send(null);
    xmlobj.onreadystatechange = statechanged1;
}

function statechanged1()
{
    if (xmlobj.readyState == 4)
    {
        document.getElementById("output").value = xmlobj.responseText;
    }
}
function run()
{
    xmlobj = getData();
    if (xmlobj == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }

    xmlobj.open("GET", "run.jsp", true);
    xmlobj.send(null);
    xmlobj.onreadystatechange = statechanged2;
}

function statechanged2()
{
    if (xmlobj.readyState == 4)
    {
        alert(xmlobj.responseText);
        document.getElementById("output").value = xmlobj.responseText;
    }
}
/*js*/
$(document).ready(function() {
    $("#popup a").click(function() {
        $("#popUpDiv").slideDown("slow");
        $("#openp").fadeOut("slow");
        $("openf").slideUp("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#close").click(function() {
        $("#popUpDiv").slideUp("slow");
    });
});
$(document).ready(function() {
    $(".ope a").click(function() {
        $("#openp").slideDown("slow");
        $("#popUpDiv").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#clos").click(function() {
        $("#openp").slideUp("slow");
    });
});
$(document).ready(function() {
    $("#op a").click(function() {
        $("#openf").slideDown("slow");
        $("#popUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#clo").click(function() {
        $("#openf").slideUp("slow");
    });
});
$(document).ready(function() {
    $("#save a").click(function() {
        $("#s").slideDown("slow");
        $("#poUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#cl").click(function() {
        $("#s").slideUp("slow");
    });
});
$(document).ready(function() {
    $("#replace a").click(function() {
        $("#rep").slideDown("slow");
        $("#popUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#c").click(function() {
        $("#rep").slideUp("slow");
    });
});
$(document).ready(function() {
    $("#fin a").click(function() {
        $("#find").slideDown("slow");
        $("#poUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#c2").click(function() {
        $("#find").slideUp("slow");
    });
});
$(document).ready(function() {
    $("#rename a").click(function() {
        $("#rn").slideDown("slow");
        $("#poUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#download").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#c3").click(function() {
        $("#rn").slideUp("slow");
    });
});
$(document).ready(function() {
    $("#down a").click(function() {
        $("#download").slideDown("slow");
        $("#poUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("#upload").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#c4").click(function() {
        $("#download").slideUp("slow");
    });
});
function left() {
    document.getElementById("code").style.textAlign = "left";
}
function right() {
    document.getElementById("code").style.textAlign = "right";
}
function getFiles(t) {
    xmlobj = getData();
    if (xmlobj == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }

    projectname = t.value;
    xmlobj.open("GET", "dfiles.jsp?projectname=" + projectname, true);
    xmlobj.send(null);
    xmlobj.onreadystatechange = statechanged3;
}

function statechanged3()
{
    if (xmlobj.readyState == 4)
    {
        //alert(xmlobj.responseText);
        document.getElementById("pfile").innerHTML = xmlobj.responseText;
    }
}
$(document).ready(function() {
    $("#up222 a").click(function() {
        $("#upload").slideDown("slow");
        $("#poUpDiv").fadeOut("slow");
        $("#openp").fadeOut("slow");
        $("#openf").fadeOut("slow");
        $("#s").fadeOut("slow");
        $("#rep").fadeOut("slow");
        $("#find").fadeOut("slow");
        $("#rn").fadeOut("slow");
        $("download").fadeOut("slow");
    });
});
$(document).ready(function() {
    $("#c6").click(function() {
        $("#upload").slideUp("slow");
    });
});

$(document).ready(function() {
    $("#chat-open").click(function(){
        ("#live-chat").show();
    });
    $("#live-chat header").click(function() {
        $(".chat").slideToggle(300, "swing");
        $(".chat-message-counter").fadeToggle(300, "swing");
    });
    $(".band").click(function() {
        $("#live-chat").hide();
    });
});
function userData(i) {
    //alert(i);
    xmlobj1 = getData();
     //alert(xmlobj1);
    if (xmlobj1 == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }

    user = document.getElementById("k" + i).value;
    //alert(user);
    xmlobj1.open("GET", "user.jsp?username=" + user, true);
    
    xmlobj1.send(null);
    xmlobj1.onreadystatechange = statechanged4;
   
}
function statechanged4()
{
    //alert(xmlobj.readyState);
    if (xmlobj1.readyState == 4)
    {
       // alert(xmlobj.responseText);
        document.getElementById("name").innerHTML = xmlobj1.responseText;
        document.getElementById("reciver").value= user;
        
        chatLoad();
    }
}
function getMsgajax(){
    xmlobj2 = getData();
    if (xmlobj2 == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }
    msg=document.getElementById("sendermsg").value;
    reciver=document.getElementById("reciver").value;
    //alert(reciver);
    sender=document.getElementById("sender").value;
    //alert(sender);
    xmlobj2.open("GET","getmessage.jsp?meg="+msg+"&sender_user="+sender+"&reciver_user="+reciver,true);
    xmlobj2.send(null);
    xmlobj2.onreadystatechange=statechanged5;
}
function statechanged5(){
    if(xmlobj2.readyState==4){
        document.getElementById("sendermsg").value="";
        chatLoad();
    }
}
function chatLoad(){
    xmlobj3=getData();
     if (xmlobj3 == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }
    reciver=document.getElementById("reciver").value;
    //alert("rr"+reciver);
    sender=document.getElementById("sender").value;
    //alert(sender);
    xmlobj3.open("GET","userchat.jsp?reciver="+reciver+"&sender="+sender,true);
    xmlobj3.send(null);
    xmlobj3.onreadystatechange=statechanged6;
}
function statechanged6(){
    if(xmlobj3.readyState==4){
        //alert(xmlobj3.responseText);
        document.getElementById("chat555").innerHTML=xmlobj3.responseText;
    }
}


function chatLoad(){
    xmlobj3=getData();
     if (xmlobj3 == null)
    {
        alert("Your Browser does not support Ajax");
        return;
    }
    reciver=document.getElementById("reciver").value;
    //alert("rr"+reciver);
    sender=document.getElementById("sender").value;
    //alert(sender);
    xmlobj3.open("GET","userchat.jsp?reciver="+reciver+"&sender="+sender,true);
    xmlobj3.send(null);
    xmlobj3.onreadystatechange=statechanged6;
}
function statechanged6(){
    if(xmlobj3.readyState==4){
        //alert(xmlobj3.responseText);
        document.getElementById("chat555").innerHTML=xmlobj3.responseText;
    }
}

